package com.librarymanagement.librarymanagement.Books;

import java.util.List;

public interface BooksServiceInterface {
    public List<BooksDTO> Total_books();
    public void Delete_book(Integer ID, BooksDTO books);
    public void update_book(Integer ID, BooksDTO book);
    public void add_book(BooksDTO book);


}
