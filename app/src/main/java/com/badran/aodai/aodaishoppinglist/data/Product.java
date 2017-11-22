package com.badran.aodai.aodaishoppinglist.data;

/**
 * Created by user on 06/11/2017.
 * /This class represents an item that will be at the shopping list
 */

public class Product {

    /**
     * the name of the product
     */

    private String name;
    /**
     * the price of the product
     */
    private double price;
    /**
     * the amount of the product
     */
    private double amount;
    /**
     * if the product is bought
     */
    private boolean isCompleted;
    /**
     * the path of product's image
     */
    private String imagPath;

    /**
     * a specail key or id unique for each product (primary key)
     */

    private String keyId;

    /**
     * building
     * @param name
     * @param price
     * @param amount
     */
    public Product(String name, double price, double amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        isCompleted=false;
        imagPath=null;

    }

    public Product(String name, double price, double amount, boolean isCompleted, String imagPath, String keyId) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.isCompleted = isCompleted;
        this.imagPath = imagPath;
        this.keyId = keyId;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isCompleted(boolean b) {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getImagPath() {
        return imagPath;
    }

    public void setImagPath(String imagPath) {
        this.imagPath = imagPath;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
}
