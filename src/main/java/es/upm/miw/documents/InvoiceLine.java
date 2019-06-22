package es.upm.miw.documents;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;

@Document
public class InvoiceLine {

    @DBRef
    private Invoice invoice;
    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal calculatedTax;
    private String productId;

    public InvoiceLine() {
    }

    public InvoiceLine(Invoice invoice, int quantity, BigDecimal unitPrice, BigDecimal calculatedTax, String productId) {
        super();
        this.invoice = invoice;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.calculatedTax = calculatedTax;
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getCalculatedTax() {
        return calculatedTax;
    }

    public void setCalculatedTax(BigDecimal calculatedTax) {
        this.calculatedTax = calculatedTax;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" +
                "invoice=" + invoice +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", calculatedTax=" + calculatedTax +
                ", productId='" + productId + '\'' +
                '}';
    }
}
