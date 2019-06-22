package es.upm.miw.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

@Document
public class Invoice {

    private static final String DATE_FORMAT = "yyyy";
    @Id
    private String id;
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

    public Invoice() {
        creationDate = LocalDateTime.now();
    }

    public Invoice(int idOfYear,String description,BigDecimal tax, BigDecimal subtotal, BigDecimal discount,
                   BigDecimal total, String userId, String customerId, String enterpriseName, InvoiceLine[] invoiceLines) {
        this();
        this.id = new SimpleDateFormat(DATE_FORMAT).format(new Date()) + idOfYear;
        this.description = description;
        this.tax = tax;
        this.subtotal = subtotal;
        this.discount = discount;
        this.total = total;
        this.userId = userId;
        this.customerId = customerId;
        this.enterpriseName = enterpriseName;
        this.invoiceLines = invoiceLines;
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
    public boolean equals(Object obj) {
        return this == obj || obj != null && getClass() == obj.getClass() && (id.equals(((Invoice) obj).id));
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", creationDate=" + creationDate +
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
