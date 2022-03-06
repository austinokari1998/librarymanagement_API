package com.librarymanagement.librarymanagement.Users;

import java.util.List;

import com.librarymanagement.librarymanagement.Books.BooksDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {




@Autowired
private UsersService userserve;

@GetMapping(value = "/total_users")
public List<UsersDTO> total_users(){
    return userserve.all_users();

    
}

    

@PostMapping(value="/total_users")
public void add_user(@RequestBody UsersDTO user){
    userserve.add_user(user);
}


@DeleteMapping(value = "/total_users/{User_ID}")
public void delete_user(@RequestBody UsersDTO user,@PathVariable Integer User_ID){
    userserve.delete_user(User_ID, user);

}
@PutMapping(value = "/total_users/{User_ID}")
public void update_book(@RequestBody UsersDTO user,@PathVariable Integer User_ID){
    userserve.update_user(User_ID, user);
}



@PatchMapping(value = "/total_users/{User_ID}/{ID}")
public void BorrowBooks(@RequestBody BooksDTO book, @PathVariable Integer User_ID, @PathVariable Integer ID){
    userserve.BorrowBooks(User_ID, ID, book);
}

@PostMapping(value = "/total_users/{User_ID}")
   public void DonateBooks(@RequestBody BooksDTO Book, @PathVariable Integer User_ID){
   userserve.DonateBooks(Book, User_ID);
   }



}
        
    