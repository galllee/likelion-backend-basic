package com.test.SpringBootApi.domain;

import javax.persistence.*;

@Entity
@Table(name="Books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; //왜 long?

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "price")
    private int price;

    @Column(name = "author")
    private String author;

    Book() {}

    public Book(String bookName, int price, String author) {
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
