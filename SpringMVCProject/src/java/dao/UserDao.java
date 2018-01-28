/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import pojo.User;

/**
 *
 * @author mxiaoxi
 */
public interface UserDao {
    
    void save(User user);
    User getUser();
    void deleteUser(String id);
}
