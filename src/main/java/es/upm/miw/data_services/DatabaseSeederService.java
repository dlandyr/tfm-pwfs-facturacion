package es.upm.miw.data_services;

import es.upm.miw.documents.*;
import es.upm.miw.repositories.*;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Arrays;

@Service
public class DatabaseSeederService {

    private static final String VARIOUS_CODE = "1";

    private static final String VARIOUS_NAME = "Varios";

    @Autowired
    private Environment environment;

    @Value("${miw.databaseSeeder.ymlFileName:#{null}}")
    private String ymlFileName;

    @Autowired
    private InvoiceRepository invoiceRepository;

    @PostConstruct
    public void constructor() {
        String[] profiles = this.environment.getActiveProfiles();
        if (Arrays.stream(profiles).anyMatch("dev"::equals)) {
            this.deleteAllAndInitializeAndLoadYml();
        } else if (Arrays.stream(profiles).anyMatch("prod"::equals)) {
            this.initialize();
        }
    }

    private void initialize() {
        if (!this.invoiceRepository.existsById(VARIOUS_CODE)) {
            LogManager.getLogger(this.getClass()).warn("------- Create Invoice -----------");
            Invoice invoice = new Invoice();
            this.invoiceRepository.save(invoice);
        }
    }

    public void deleteAllAndInitialize() {
        LogManager.getLogger(this.getClass()).warn("------- Delete All -----------");
        // Delete Repositories -----------------------------------------------------
        this.invoiceRepository.deleteAll();
        // -------------------------------------------------------------------------
        this.initialize();
    }

    public void deleteAllAndInitializeAndLoadYml() {
        this.deleteAllAndInitialize();
        this.seedDatabase();
        this.initialize();
    }

    public void seedDatabase() {
        if (this.ymlFileName != null) {
            try {
                LogManager.getLogger(this.getClass()).warn("------- Initial Load: " + this.ymlFileName + "-----------");
                this.seedDatabase(new ClassPathResource(this.ymlFileName).getInputStream());
            } catch (IOException e) {
                LogManager.getLogger(this.getClass()).error("File " + this.ymlFileName + " doesn't exist or can't be opened");
            }
        } else {
            LogManager.getLogger(this.getClass()).error("File db.yml doesn't configured");
        }
    }

    public void seedDatabase(InputStream input) {
        Yaml yamlParser = new Yaml(new Constructor(DatabaseGraph.class));
        DatabaseGraph tpvGraph = yamlParser.load(input);

        // Save Repositories -----------------------------------------------------
        this.invoiceRepository.saveAll(tpvGraph.getInvoiceList());
        // -----------------------------------------------------------------------
        LogManager.getLogger(this.getClass()).warn("------- Seed...   " + "-----------");
    }
}






