package es.upm.miw.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import es.upm.miw.documents.InvoiceLine;
import es.upm.miw.documents.Invoice;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

@JsonInclude(Include.NON_NULL)
public class InvoiceDto {

    private LocalDateTime creationDate;
    private String description;
    private BigDecimal tax;
    private BigDecimal subtotal;
    private BigDecimal discount;
    private BigDecimal total;
    private String userId;
    private String customerId;
    private String enterpriseName;

    private InvoiceLine[] invoiceLines;

    public InvoiceDto() {
    }

    public InvoiceDto(Invoice invoice) {
        this.creationDate = invoice.getCreationDate();
        this.description = invoice.getDescription();
        this.tax = invoice.getTax();
        this.subtotal = invoice.getSubtotal();
        this.discount = invoice.getDiscount();
        this.total = invoice.getTotal();
        this.userId = invoice.getUserId();
        this.customerId = invoice.getCustomerId();
        this.enterpriseName = invoice.getEnterpriseName();
        this.invoiceLines = invoice.getInvoiceLines();
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

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
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
                ", tax=" + tax +
                ", subtotal=" + subtotal +
                ", discount=" + discount +
                ", total=" + total +
                ", userId='" + userId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", enterpriseName='" + enterpriseName + '\'' +
                ", invoiceLines=" + Arrays.toString(invoiceLines) +
                '}';
    }
}
