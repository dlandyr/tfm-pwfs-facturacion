package es.upm.miw.rest_controllers;

import es.upm.miw.business_controllers.InvoiceController;
import es.upm.miw.dtos.InvoiceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER') or hasRole('OPERATOR')")
@RestController
@RequestMapping(InvoiceResource.INVOICES)
public class InvoiceResource {

    public static final String INVOICES = "/invoices";
    public static final String ID = "/{id}";

    @Autowired
    private InvoiceController invoiceController;

    @GetMapping
    public List<InvoiceDto> readAll() {
        return this.invoiceController.readAll();
    }
}
