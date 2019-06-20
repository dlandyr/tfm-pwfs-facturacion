package es.upm.miw.dtos;

import java.math.BigDecimal;

public class InvoiceSearchDto {

    private String descriptionInvoice;
    private String descriptionProduct;
    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal calculatedTax;

    public InvoiceSearchDto(){
    }

    public InvoiceSearchDto(String descriptionInvoice, String descriptionProduct, Integer quantity, BigDecimal unitPrice, BigDecimal calculatedTax){
        this.descriptionInvoice = descriptionInvoice;
        this.descriptionProduct = descriptionProduct;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.calculatedTax = calculatedTax;
    }

    public String getDescriptionInvoice() {
        return descriptionInvoice;
    }

    public void setDescriptionInvoice(String descriptionInvoice) {
        this.descriptionInvoice = descriptionInvoice;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
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

    @Override
    public String toString() {
        return "InvoiceSearchDto{" +
                "descriptionInvoice='" + descriptionInvoice + '\'' +
                ", descriptionProduct='" + descriptionProduct + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", calculatedTax=" + calculatedTax +
                '}';
    }
}
