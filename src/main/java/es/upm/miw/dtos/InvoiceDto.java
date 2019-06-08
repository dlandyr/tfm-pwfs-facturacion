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
    private InvoiceLine[] invoiceLine;

    public InvoiceDto() {
        // Empty for framework
    }

    public InvoiceDto(Invoice invoice) {
        this.creationDate = invoice.getCreationDate();
        this.description = invoice.getDescription();
        //this.client = invoice.getClient();
        this.invoiceLine = invoice.getInvoiceLines();
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

    public InvoiceLine[] getInvoiceLine() {
        return invoiceLine;
    }

    public void setInvoiceLine(InvoiceLine[] invoiceLine) {
        this.invoiceLine = invoiceLine;
    }

    @Override
    public String toString() {
        return "InvoiceDto{" +
                "creationDate=" + creationDate +
                ", description='" + description + '\'' +
                ", invoiceLine=" + Arrays.toString(invoiceLine) +
                '}';
    }
}
