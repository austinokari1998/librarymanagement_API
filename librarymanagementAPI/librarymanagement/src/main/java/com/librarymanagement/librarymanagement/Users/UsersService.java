package com.librarymanagement.librarymanagement.Users;


import java.util.ArrayList;
import java.util.List;

import com.librarymanagement.librarymanagement.Books.BooksDTO;
import com.librarymanagement.librarymanagement.Books.BooksService;
import com.librarymanagement.librarymanagement.Users.errorhandling.BookNotBorrowed;
import com.librarymanagement.librarymanagement.Users.errorhandling.BookNotFoundError;
import com.librarymanagement.librarymanagement.Users.errorhandling.BookorUserNotFound;
import com.librarymanagement.librarymanagement.Users.errorhandling.ResourceNotFoundError;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UsersService implements UserServiceInterface {
    @Autowired

    private UsersRepository userrepo;
    @Autowired
    private BooksService book_serve;
    
     List<UsersDTO> total_users=new ArrayList<>();

    public List<UsersDTO>  all_users(){


        userrepo.findAll().forEach(total_users::add);
        return total_users;
    }
    
    public void add_user(UsersDTO user){
        userrepo.save(user);
    }

    public void delete_user(Integer User_ID,UsersDTO user){
        userrepo.deleteById(User_ID);
    }

    public void update_user(Integer User_ID, UsersDTO user){
        userrepo.save(user);

    }
   
   

    public void BorrowBooks(Integer User_ID, Integer ID, BooksDTO book) {
        if ((check_user(User_ID)) & (Bookchecker(ID))){
            if (book.getAvailability()==true){
            book.setAvailability(false);
            book_serve.update_book(ID, book);

        }
        else{
            throw new BookNotFoundError(
                "the book has been been borrowed and isnt available"
            );
        }
    }
        else{

            throw new BookorUserNotFound(
                "the book or user may be non_existent"
            );
            
        }

        
        
    }
    public Boolean Bookchecker(Integer ID){
        for(BooksDTO book:book_serve.Total_books()){
            if (book.getID().equals(ID)){
                return true;
            }
        }
        return false;

    }

    public void ReturnBooks(Integer User_ID, Integer ID, BooksDTO book) {
        if ((check_user(User_ID)) & (Bookchecker(ID))){
            if (book.getAvailability()==false){
                book.setAvailability(true);
            }
            
            else{
                throw new BookNotBorrowed("the book was not borrowed ..");
            }

        }
        
    }

    public Boolean check_user(Integer User_ID){
        for(UsersDTO user: total_users){

            if(user.getUser_ID().equals(User_ID)){
                return true;
            }


        }
                return false;
            


        }

    public void DonateBooks(BooksDTO Book, Integer User_ID) {
        if (check_user(User_ID)){
                BooksDTO book=new BooksDTO();
                book.setID(book.getID());
                 book.setBook_Title(book.getBook_Title());
                 book.setBook_Author(book.getBook_Author());
                book.setIsBn_No(book.getIsBn_No());
                book.setAvailability(true);

             book_serve.add_book(book);
        }
        else{
            throw new ResourceNotFoundError("the user was not found");
        }
             
    }
    




    
}
