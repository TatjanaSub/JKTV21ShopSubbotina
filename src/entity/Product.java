/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pupil
 */
@Entity
public class Product implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
