package es.upm.miw.repositories;

import es.upm.miw.documents.Invoice;
import es.upm.miw.dtos.InvoiceDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface InvoiceRepository extends MongoRepository<Invoice, String> {

    @Query(value = "{}", fields = "{'id' : 0, 'creationDate' : 1, 'description' : 2, 'tax' : 3, 'subtotal' : 4," +
            "'discount' : 5, 'total' : 6, 'userId' : 7 ', 'customerId' : 8, 'enterpriseName' : 9, 'invoiceLines': 10}")
    List<InvoiceDto> findAllInvoices();
}
