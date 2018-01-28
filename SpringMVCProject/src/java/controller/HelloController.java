/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDao;
import dao.UserDaoImpl;
import model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.User;



/**
 *
 * @author mxiaoxi
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String welcomePage(Model model){
        model.addAttribute("userModel", "uuuuuuuuuuuuu");
        return "helloPage/hello";
    }
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String helloPage(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, Model model){
        System.out.println("helloPage");
        
        User u = new User();
        u.setFirstName(firstName);
        u.setLastName(lastName);
        
        UserDao uDao = new UserDaoImpl();
        uDao.save(u);
                        
        UserModel um = new UserModel(uDao.getUser());

        
        model.addAttribute("userModel", "Welcome " + um.getFirstName() + " " + um.getLastName() + " from backend" );
        
        return "helloPage/hello";
    }
   
}
