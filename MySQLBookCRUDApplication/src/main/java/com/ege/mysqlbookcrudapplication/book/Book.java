package com.ege.mysqlbookcrudapplication.book;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private Double price;

    @Column(name = "publication_date")
    private Date  publicationDate;

    public  Book() {
    }

    public  Book(String title,double  price,Date publicationDate){
        this.title = title;
        this.price=price;
        this.publicationDate=publicationDate;
    }

    public Long getId(){
    return id;
 }

    public String getTitle() {
	return title;
}

    public void setTitle(String title) {
	this.title = title;
}

    public double getPrice() {
	return price;
}

    public void setPrice(Double price) {
	this.price = price;
}

    public  Date getPublicationDate() {
    return publicationDate;
}

    public void setPublicationDate(Date publicationDate) {
    this.publicationDate = publicationDate;
}

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", publicationDate=" + publicationDate +
                '}';
    }
}