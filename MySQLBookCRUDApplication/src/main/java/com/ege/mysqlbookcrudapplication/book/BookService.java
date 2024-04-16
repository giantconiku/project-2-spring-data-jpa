package com.ege.mysqlbookcrudapplication.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book add(Book book)
    {
        return bookRepository.save(book);
    }

    public List<Book> findAll() 
    { 
        return bookRepository.findAll(); 
    }

    public Book findById(Long id) { return bookRepository.findById(id).get(); }
    
    public List<Book> findByTitle(String title)
    {  
        return bookRepository.findByTitle(title);  
    }

    public Book edit(Long id, Book book) {

        Optional<Book> optionalBook = bookRepository.findById(id);
        Book currentBook = optionalBook.get();
        currentBook.setTitle(book.getTitle());
        currentBook.setPrice(book.getPrice());
        currentBook.setPublicationDate(book.getPublicationDate());

        return bookRepository.save(currentBook);
    }

    public void deleteById(Long id) 
    {
        bookRepository.deleteById(id);
    }

    public void deleteAll() { bookRepository.deleteAll(); }
}

