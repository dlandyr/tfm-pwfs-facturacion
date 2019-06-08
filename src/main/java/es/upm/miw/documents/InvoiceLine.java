package es.upm.miw.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class InvoiceLine {

    private Integer amount;
    //@DBRef
    //private Product product;

    public InvoiceLine() {
    }

    public InvoiceLine(int amount) {
        super();
        //this.product = product;
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" +
                "amount=" + amount +
                '}';
    }
}
