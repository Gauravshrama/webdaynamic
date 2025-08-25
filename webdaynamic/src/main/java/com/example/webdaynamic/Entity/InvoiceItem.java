package com.example.webdaynamic.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class InvoiceItem {

        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        private int id;

        private String itemname;

        @ManyToOne
        @JsonBackReference
        private Invoice invoice;

        @ManyToOne
        private Product product;

        private int quantity;

        private double rate;

        private double taxRate;

        private double total;

        @Override
        public String toString() {
                return "InvoiceItem{" +
                        "id=" + id +
                        ", itemname='" + itemname + '\'' +
                        ", invoice=" + invoice +
                        ", product=" + product +
                        ", quantity=" + quantity +
                        ", rate=" + rate +
                        ", taxRate=" + taxRate +
                        ", total=" + total +
                        '}';
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getItemname() {
                return itemname;
        }

        public void setItemname(String itemname) {
                this.itemname = itemname;
        }

        public Invoice getInvoice() {
                return invoice;
        }

        public void setInvoice(Invoice invoice) {
                this.invoice = invoice;
        }

        public Product getProduct() {
                return product;
        }

        public void setProduct(Product product) {
                this.product = product;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }

        public double getRate() {
                return rate;
        }

        public void setRate(double rate) {
                this.rate = rate;
        }

        public double getTaxRate() {
                return taxRate;
        }

        public void setTaxRate(double taxRate) {
                this.taxRate = taxRate;
        }

        public double getTotal() {
                return total;
        }

        public void setTotal(double total) {
                this.total = total;
        }
}
