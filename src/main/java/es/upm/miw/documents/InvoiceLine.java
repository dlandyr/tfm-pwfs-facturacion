package es.upm.miw.documents;

import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;

@Document
public class InvoiceLine {

    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal calculatedTax;
    private String productId;

    public InvoiceLine() {
    }

    public InvoiceLine(int quantity, BigDecimal unitPrice, BigDecimal calculatedTax, String productId) {
        super();
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

    @Override
    public String toString() {
        return "InvoiceLine{" +
                "quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", calculatedTax=" + calculatedTax +
                ", productId='" + productId + '\'' +
                '}';
    }
}
