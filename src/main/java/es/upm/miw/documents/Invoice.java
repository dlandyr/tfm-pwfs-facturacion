package es.upm.miw.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Invoice {

    private static final String DATE_FORMAT = "yyyy";
    @Id
    private String id;
    private LocalDateTime creationDate;
    private String description;

    //@DBRef
   // private Client client;

    public Invoice() {
        creationDate = LocalDateTime.now();
    }

    public Invoice(int idOfYear,String description) {
        this();
        this.id = new SimpleDateFormat(DATE_FORMAT).format(new Date()) + idOfYear;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || obj != null && getClass() == obj.getClass() && (id.equals(((Invoice) obj).id));
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", creationDate=" + creationDate +
                ", description='" + description + '\'' +
                '}';
    }
}
