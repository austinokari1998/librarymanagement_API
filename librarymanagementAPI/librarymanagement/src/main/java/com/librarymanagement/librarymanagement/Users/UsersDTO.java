package com.librarymanagement.librarymanagement.Users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="UsersDTO")

public class UsersDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer User_ID;
    @Column(name="user_name")
    private String User_name;
    @Column(name="gender")
    @Enumerated(EnumType.STRING)
    private Gender  Gender;
    public UsersDTO(Integer user_ID, String user_name, Gender gender) {
        User_ID = user_ID;
        User_name = user_name;
        Gender = gender;
    }
    public UsersDTO(){

    }
    public Integer getUser_ID() {
        return User_ID;
    }
    public void setUser_ID(Integer user_ID) {
        User_ID = user_ID;
    }
    public String getUser_name() {
        return User_name;
    }
    public void setUser_name(String user_name) {
        User_name = user_name;
    }
    public Gender getGender() {
        return Gender;
    }
    public void setGender(Gender gender) {
        Gender = gender;
    }
    @Override
    public String toString() {
        return "UsersDTO [Gender=" + Gender + ", User_ID=" + User_ID + ", User_name=" + User_name + "]";
    }
    
}
    

