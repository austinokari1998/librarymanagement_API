package com.librarymanagement.librarymanagement.Books;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BooksService implements BooksServiceInterface {
@Autowired
private BooksRepository bookrepo;
    @Override
    public List<BooksDTO> Total_books() {
        List<BooksDTO> total_books=new ArrayList<>();
        bookrepo.findAll().forEach(total_books::add);
        return total_books;
        
    }

    @Override
    public void Delete_book(Integer ID,BooksDTO book) {
        bookrepo.deleteById(ID);

        
        
    }

    @Override
    public void update_book(Integer ID, BooksDTO book) {
        bookrepo.save(book);
        
    }

    @Override
    public void add_book(BooksDTO book) {
        bookrepo.save(book);
        
    }
    
}
