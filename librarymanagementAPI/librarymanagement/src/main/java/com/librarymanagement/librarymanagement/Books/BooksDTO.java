package com.librarymanagement.librarymanagement.Books;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BooksDTO")
public class BooksDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column(name="book_title")
    private String Book_Title;
    @Column(name="book_author")
    private String Book_Author;
    @Column(name="Isbn_no")
    private String IsBn_No;
    @Column(name = "availability")
    private Boolean availability;
    public BooksDTO(){

    }
    public BooksDTO(Integer iD, String book_Title, String book_Author, String isBn_No) {
        ID = iD;
        Book_Title = book_Title;
        Book_Author = book_Author;
        IsBn_No = isBn_No;
    }
    public Integer getID() {
        return ID;
    }
    public void setID(Integer iD) {
        ID = iD;
    }
    public String getBook_Title() {
        return Book_Title;
    }
    public void setBook_Title(String book_Title) {
        Book_Title = book_Title;
    }
    public String getBook_Author() {
        return Book_Author;
    }
    public void setBook_Author(String book_Author) {
        Book_Author = book_Author;
    }
    public String getIsBn_No() {
        return IsBn_No;
    }
    public void setIsBn_No(String isBn_No) {
        IsBn_No = isBn_No;
    }
    @Override
    public String toString() {
        return "BooksDTO [Book_Author=" + Book_Author + ", Book_Title=" + Book_Title + ", ID=" + ID + ", IsBn_No="
                + IsBn_No + "]";
    }
    public Boolean getAvailability() {
        return availability;
    }
    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
    
    
}
