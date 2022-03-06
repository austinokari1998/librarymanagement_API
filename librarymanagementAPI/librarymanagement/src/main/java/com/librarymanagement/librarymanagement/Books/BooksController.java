package com.librarymanagement.librarymanagement.Books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
    @Autowired
    private BooksService bookserve;
    @GetMapping(value = "/books")
    public List<BooksDTO> all_books(){
        System.out.println("the total_books methods successfully executed");
        return bookserve.Total_books();
    }

    @PostMapping(value = "/books")
    public void add_book(@RequestBody BooksDTO book){
        bookserve.add_book(book);
    }
    @DeleteMapping(value="/books/{ID}")
    public void Delete_book(@PathVariable Integer ID,@RequestBody BooksDTO book ){
        bookserve.Delete_book(ID, book);
    }
    @PutMapping(value = "/books/{ID}")

    public void update_book(@PathVariable Integer ID, @RequestBody BooksDTO book){
        bookserve.update_book(ID, book);
    }

}
