package com.karumien.easyinventory.core.dto;

/**
 * Created by Mira on 29.11.2017.
 */
public class User {

    private String email;
    private String fullname;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    public User(String fullname, String email) {
        this.fullname = fullname;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
