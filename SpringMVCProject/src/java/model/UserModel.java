/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import pojo.User;

/**
 *
 * @author mxiaoxi
 */
public class UserModel {
    private String firstName;
    private String lastName;

    /**
     * @return the firstName
     */
    public UserModel(User u){
        this.firstName = u.getFirstName();
        this.lastName = u.getLastName();
    }
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
