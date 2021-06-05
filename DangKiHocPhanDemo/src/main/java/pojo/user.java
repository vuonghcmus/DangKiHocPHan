/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author HP
 */
@Entity(name = "user")
public class user {
    @Id
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "type")
    private int type;
    
    @Column(name = "id")
    private String id;

    public user() {
        
    }

    public user(String username, String password, int type, String id) {
        this.username = username;
        this.password = password;
        this.type = type;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

