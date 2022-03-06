package com.librarymanagement.librarymanagement.Users;

import com.librarymanagement.librarymanagement.Books.BooksDTO;

public interface UserServiceInterface {
    public void BorrowBooks( Integer User_ID, Integer ID, BooksDTO book);
    public void ReturnBooks(Integer User_ID, Integer ID, BooksDTO book);
    public void DonateBooks(BooksDTO Book,  Integer User_ID);
    
}
