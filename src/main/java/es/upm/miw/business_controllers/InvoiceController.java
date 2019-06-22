package es.upm.miw.business_controllers;

import es.upm.miw.documents.Invoice;
import es.upm.miw.documents.InvoiceLine;
import es.upm.miw.dtos.InvoiceDto;
import es.upm.miw.dtos.InvoiceSearchDto;
import es.upm.miw.exceptions.NotFoundException;
import es.upm.miw.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import es.upm.miw.dtos.InvoiceDto;
import es.upm.miw.dtos.InvoiceSearchDto;

@Controller
public class InvoiceController {

    @Autowired
    private InvoiceRepository invoiceRepository;

    /*public InvoiceDto create(String descriptionInvoice, String userId, String customerId, String enterpriseName, String[] idProducts, Integer[] quantity) {
        InvoiceLine[] invoiceLines = new InvoiceLine[idProducts.length];
        InvoiceSearchDto invoiceSearchDtos = new InvoiceSearchDto();
        for (int i = 0; i < idProducts.length; i++) {
            if(this.invoiceRepository.findById(idProducts[i]).isPresent()) {
                String productId = invoiceSearchDtos.getDescriptionProduct();
                if (productId == null) {
                    //Aqui debe ir una excepcion
                }
                InvoiceLine invoiceLine= prepareInvoiceLine(invoiceSearchDtos, productId);
                invoiceLines[i] = new InvoiceLine();
            }
        }
          return null;
    }*/

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
