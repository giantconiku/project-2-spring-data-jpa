package com.ege.mysqlbookcrudapplication.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book add(@RequestBody Book book) {
        return bookService.add(book);
    }

    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable Long id) { return bookService.findById(id); }

    @GetMapping(params = {"title"})
    public List<Book> findByTitle(@RequestParam(value = "title") String title) {
        return bookService.findByTitle(title);
    }

    @PutMapping("/{id}")
    public Book edit(@PathVariable("id") Long id, @RequestBody Book book) {
        return bookService.edit(id, book);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        bookService.deleteById(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAll() { bookService.deleteAll(); }
}
