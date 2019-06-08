package es.upm.miw.repositories;

import es.upm.miw.documents.Invoice;
import es.upm.miw.dtos.InvoiceDto;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public class InvoiceRepository {

    //@Query(value = "{}", fields = "{ 'id' : 0, 'description' : 1, 'creationDate' : 1, 'invoiceLines': 1}")
    //List<InvoiceDto> findAllOrders();
}
