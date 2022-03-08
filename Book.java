package com.example.demo.pojo;

import java.math.BigDecimal;

public class Book {
    private Integer id;
    private String name;
    private String locate;
    private Integer price;
    private Integer sales;
    private Integer stock;

    public Book(){}

    public Book(Integer id, String name, String locate, Integer price, Integer sales, Integer stock) {
        this.id = id;
        this.name = name;
        this.locate = locate;
        this.price = price;
        this.sales = sales;
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String author) {
        this.locate = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + locate + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", stock=" + stock +
                '}';
    }
}
