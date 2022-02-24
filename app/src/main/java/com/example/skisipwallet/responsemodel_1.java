package com.example.skisipwallet;

public class responsemodel_1 {

    String username;
    String email;
    String password;
    String password2;
    //Constructor of the Class for message:
    public responsemodel_1(String username, String email, String password, String password2) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.password2 = password2;
    }

    // Blank Constructor for best practice and mandatory for fireBase
    public responsemodel_1() {
    }

    //Getter Setter For Above Variable to Show Message:
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
/*
...................................................................................................
 Response Model Class is Completed Now go To the Next step of Retrofit API is (API-INTERFACE).java
...................................................................................................

 SUMMARY Of Response Model Class is:
 (1):Constructor of class
 (2): Getter And Setter Method Of Above Class.
 */