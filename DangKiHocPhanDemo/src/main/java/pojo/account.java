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

@Entity(name = "account")
public class account {
    @Id
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "type")
    private int type;
    
    @Column(name = "name")
    private String name;

    public account() {
        
    }

    public account(String username, String password, int type, String name) {
        this.username = username;
        this.password = password;
        this.type = type;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
