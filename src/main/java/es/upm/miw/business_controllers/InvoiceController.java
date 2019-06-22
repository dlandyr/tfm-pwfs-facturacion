package es.upm.miw.business_controllers;

import es.upm.miw.documents.InvoiceLine;
import es.upm.miw.dtos.InvoiceDto;
import es.upm.miw.dtos.InvoiceSearchDto;
import org.apache.logging.log4j.LogManager;
import es.upm.miw.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class InvoiceController {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public InvoiceDto create(InvoiceDto invoice) {
        for (InvoiceLine il : invoice.getInvoiceLines()) {
            LogManager.getLogger("\t"+il.getProductId());
        }
        return invoice;
    }

   /* private InvoiceLine prepareInvoiceLine(InvoiceSearchDto invoiceSearchDto, String productId) {
        int stock = (invoiceSearchDto.getQuantity() == null) ? 10 : ProductDto.getStock();
    }*/

    public List<InvoiceSearchDto> readAll() {
        List<InvoiceSearchDto> invoiceSearchDtos=  new ArrayList<>();
        for (InvoiceDto dto : invoiceRepository.findAllInvoices()) {
            for (InvoiceLine invoiceLine : dto.getInvoiceLines()) {
                InvoiceSearchDto invoiceSearchDto;
                invoiceSearchDto=new InvoiceSearchDto(dto.getUserId(),dto.getCustomerId(),dto.getEnterpriseName(),dto.getDescription(),invoiceLine.getProductId(),
                        invoiceLine.getQuantity(),invoiceLine.getUnitPrice(),invoiceLine.getCalculatedTax(),dto.getTax(),dto.getSubtotal(),dto.getDiscount(),dto.getTotal());
                invoiceSearchDtos.add(invoiceSearchDto);
                System.out.println("InvoiceSearchDto: " + invoiceSearchDto);
                System.out.println("Invoice line: " + invoiceLine);
            }
        }
        System.out.println(",,,,,,,,,,;"+ invoiceSearchDtos);
        return invoiceSearchDtos ;
    }
}
