package com.example.webdaynamic.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

public class Invoice {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id ;

    @ManyToOne
    private Party party;

    private LocalDateTime date;
    @Column(unique = true)
    private String invoicenumber;

    private double amount;

    @OneToMany(mappedBy = "Invoice",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<InvoiceItem> invoiceItems;

    public Invoice(int id, Party party, LocalDateTime date, String invoicenumber, double amount, List<InvoiceItem> invoiceItems) {
        this.id = id;
        this.party = party;
        this.date = date;
        this.invoicenumber = invoicenumber;
        this.amount = amount;
        this.invoiceItems = invoiceItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getInvoicenumber() {
        return invoicenumber;
    }

    public void setInvoicenumber(String invoicenumber) {
        this.invoicenumber = invoicenumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
}
