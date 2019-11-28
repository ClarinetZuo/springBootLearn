package com.example.webdemo.vo;

import java.util.Date;

/**
 * author:Zuo Junhao
 * NEFU
 */
public class Book {

    String isbn;
    String name;
    Integer price;
    Date publisTime;
    public Book(){

    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", publisTime=" + publisTime +
                '}';
    }

    public Book(String isbn, String name, Integer price, Date publisTime) {
        this.isbn = isbn;
        this.name = name;
        this.price = price;
        this.publisTime = publisTime;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getPublisTime() {
        return publisTime;
    }

    public void setPublisTime(Date publisTime) {
        this.publisTime = publisTime;
    }
}
