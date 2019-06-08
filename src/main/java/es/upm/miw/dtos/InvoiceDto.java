package es.upm.miw.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import es.upm.miw.documents.InvoiceLine;
import es.upm.miw.documents.Invoice;

import java.time.LocalDateTime;
import java.util.Arrays;

@JsonInclude(Include.NON_NULL)
public class InvoiceDto {

    private LocalDateTime creationDate;

    private String description;

    //private Client client;
    private InvoiceLine[] invoiceLines;

    public InvoiceDto() {
        // Empty for framework
    }

    public InvoiceDto(Invoice invoice) {
        this.creationDate = invoice.getCreationDate();
        this.description = invoice.getDescription();
        //this.client = invoice.getClient();
        this.invoiceLines = invoice.getInvoiceLines();
    }

    public InvoiceDto(LocalDateTime creationDate, String description, InvoiceLine[] invoiceLines) {
        this.creationDate = creationDate;
        this.description = description;
        this.invoiceLines = invoiceLines;
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

    public InvoiceLine[] getInvoiceLines() {
        return invoiceLines;
    }

    public void setInvoiceLines(InvoiceLine[] invoiceLines) {
        this.invoiceLines = invoiceLines;
    }

    @Override
    public String toString() {
        return "InvoiceDto{" +
                "creationDate=" + creationDate +
                ", description='" + description + '\'' +
                ", invoiceLines=" + Arrays.toString(invoiceLines) +
                '}';
    }
}
