package es.upm.miw.business_controllers;

import es.upm.miw.documents.InvoiceLine;
import es.upm.miw.dtos.InvoiceDto;
import es.upm.miw.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import java.util.ArrayList;
import java.util.List;

@Controller
public class InvoiceController {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<InvoiceDto> readAll() {
        List<InvoiceDto> invoiceDtos=  new ArrayList<>();
        for (InvoiceDto dto : invoiceRepository.findAllInvoices()) {
            for (InvoiceLine invoiceLine : dto.getInvoiceLines()) {
                InvoiceDto invoiceDto ;
                invoiceDto=new InvoiceDto(dto.);
                invoiceDtos.add(invoiceDto);
                System.out.println("invoiceDto: " + invoiceDto);
                System.out.println("Invoice line: " + invoiceLine);
            }
        }
        System.out.println(",,,,,,,,,,;"+ invoiceDtos);
        return invoiceDtos ;
    }
}
