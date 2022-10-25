/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
public class Product {
    private String title;
    private String manufacturer;
    private int amountShop;
    private int price;

    public Product() {
    }

    public Product(String title, String manufacturer, int amountShop, int price) {
        this.title = title;
        this.manufacturer = manufacturer;
        this.amountShop = amountShop;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getAmountShop() {
        return amountShop;
    }

    public void setAmountShop(int amountShop) {
        this.amountShop = amountShop;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" 
                + "title=" + title 
                + ", manufacturer=" + manufacturer 
                + ", amountShop=" + amountShop 
                + ", price=" + price 
                + '}';
    }
    
}
