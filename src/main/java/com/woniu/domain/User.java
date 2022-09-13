package com.woniu.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String account;
    private String username;
    private String password;

    public User(String account, String username, String password) {
        this.account = account;
        this.username = username;
        this.password = password;
    }
}
