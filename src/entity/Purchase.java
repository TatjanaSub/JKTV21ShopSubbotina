/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pupil
 */
public class Purchase implements Serializable{
    private Customer customer;
    private Date takeOfProduct;
    private Product product;
    private int amountCustomer;
    private int priceCustomer;

    public Purchase() {
    }

    public Purchase(Customer customer, Date takeOfProduct, Product product, int amountCustomer, int priceCustomer) {
        this.customer = customer;
        this.takeOfProduct = takeOfProduct;
        this.product = product;
        this.amountCustomer = amountCustomer;
        this.priceCustomer = priceCustomer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getTakeOfProduct() {
        return takeOfProduct;
    }

    public void setTakeOfProduct(Date takeOfProduct) {
        this.takeOfProduct = takeOfProduct;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmountCustomer() {
        return amountCustomer;
    }

    public void setAmountCustomer(int amountCustomer) {
        this.amountCustomer = amountCustomer;
    }

    public int getPriceCustomer() {
        return priceCustomer;
    }

    public void setPriceCustomer(int priceCustomer) {
        this.priceCustomer = priceCustomer;
    }

    @Override
    public String toString() {
        return "Purchase{" 
                + "\n"
                +  customer 
                + "\n"
                + " takeOfProduct=" + takeOfProduct 
                + "," + product 
                + "\n"
                + "amountCustomer=" + amountCustomer 
                + ", priceCustomer=" + priceCustomer 
                + '}'
                + "\n";
    }
    
}
