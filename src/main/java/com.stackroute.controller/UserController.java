package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
        @RequestMapping(value="/")
        public String use(){
            return "index";


        }
        @RequestMapping("/Credentials")
        public String greeting(@RequestParam("Username") String i ,@RequestParam("Password") String j ,ModelMap map){
           User user=new User(i,j);
            //user.setUsername(i);
                map.addAttribute("greeting", "user is " + user.getUsername() + " as needed");
                return "display";

        }


    }

