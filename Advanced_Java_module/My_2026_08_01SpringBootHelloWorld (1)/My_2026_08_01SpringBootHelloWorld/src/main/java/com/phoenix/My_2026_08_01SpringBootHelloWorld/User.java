package com.phoenix.My_2026_08_01SpringBootHelloWorld;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")

public class User{
	
	@Id
	@Column(name="userid")
	String userid;
	@Column(name="password")
	String password;
	
	

    //String userid;
    //String password;
    

    public User() {
    }

    public User(String v1, String v2) {
        this.userid = v1;
        this.password = v2;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}