package es.upm.miw.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.math.BigDecimal;

@JsonInclude(Include.NON_NULL)
public class InvoiceSearchDto {

    private String descriptionUser;
    private String descriptionCustomer;
    private String descriptionEnterprise;
    private String descriptionInvoice;
    private String descriptionProduct;
    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal calculatedTax;
    private BigDecimal tax;
    private BigDecimal subtotal;
    private BigDecimal discount;
    private BigDecimal total;

    public InvoiceSearchDto(){
    }

    public InvoiceSearchDto(String descriptionUser, String descriptionCustomer, String descriptionEnterprise, String descriptionInvoice, String descriptionProduct,
                            Integer quantity, BigDecimal unitPrice, BigDecimal calculatedTax, BigDecimal tax, BigDecimal subtotal, BigDecimal discount, BigDecimal total){
        this.descriptionUser = descriptionUser;
        this.descriptionCustomer = descriptionCustomer;
        this.descriptionEnterprise = descriptionEnterprise;
        this.descriptionInvoice = descriptionInvoice;
        this.descriptionProduct = descriptionProduct;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.calculatedTax = calculatedTax;
        this.tax = tax;
        this.subtotal = subtotal;
        this.discount = discount;
        this.total = total;
    }

    public String getDescriptionUser() {
        return descriptionUser;
    }

    public void setDescriptionUser(String descriptionUser) {
        this.descriptionUser = descriptionUser;
    }

    public String getDescriptionCustomer() {
        return descriptionCustomer;
    }

    public void setDescriptionCustomer(String descriptionCustomer) {
        this.descriptionCustomer = descriptionCustomer;
    }

    public String getDescriptionEnterprise() {
        return descriptionEnterprise;
    }

    public void setDescriptionEnterprise(String descriptionEnterprise) {
        this.descriptionEnterprise = descriptionEnterprise;
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

    @Override
    public String toString() {
        return "InvoiceSearchDto{" +
                "descriptionUser='" + descriptionUser + '\'' +
                ", descriptionCustomer='" + descriptionCustomer + '\'' +
                ", descriptionEnterprise='" + descriptionEnterprise + '\'' +
                ", descriptionInvoice='" + descriptionInvoice + '\'' +
                ", descriptionProduct='" + descriptionProduct + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", calculatedTax=" + calculatedTax +
                ", tax=" + tax +
                ", subtotal=" + subtotal +
                ", discount=" + discount +
                ", total=" + total +
                '}';
    }
}
