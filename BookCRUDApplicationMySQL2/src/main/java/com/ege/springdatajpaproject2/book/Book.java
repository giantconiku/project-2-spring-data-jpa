package com.ege.springdatajpaproject2.book;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private Long id;
 private String title;
 private Double price;
 private Date  publicationDate;

 public  Book(){

 }
 public  Book(String title,double  price,Date publicationDate){

    this.title = title;
    this.price=price;
    this.publicationDate=publicationDate;

 }
 @Override
 public String toString(){
    return "Book [id=" + id + 
            ", title=" + title + 
            ", price=" + price+
            ", Publication date=" + publicationDate +"]";
 }
 public Long getId(){
    return id;
 }
 public void setId(Long id){
    this.id=id;
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
public void setPrice(double price) {
	this.price = price;
}
public  Date getPublicationDate() { 
    return publicationDate;
}
public void setPublicationDate(Date publicationDate) {    
    this.publicationDate = publicationDate;
}  
}