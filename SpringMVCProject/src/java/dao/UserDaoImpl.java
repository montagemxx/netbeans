/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import pojo.User;

/**
 *
 * @author mxiaoxi
 */
public class UserDaoImpl implements UserDao{
    private List<User> users;
    @Override
    public void save(User user) {
                
        System.out.println("you can create, delete, search, and update information to database through Dao!");
        users = new ArrayList<> ();
        users.add(user);
    }

    @Override
    public User getUser() {
        return users.get(0);
    }

    @Override
    public void deleteUser(String id) {
    }
    
    
}
