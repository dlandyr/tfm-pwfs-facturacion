package es.upm.miw.data_services;

import es.upm.miw.documents.Invoice;

import java.util.ArrayList;
import java.util.List;

public class DatabaseGraph {

    private List<Invoice> invoiceList;

    public DatabaseGraph() {

        this.invoiceList = new ArrayList<>();
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }
}
