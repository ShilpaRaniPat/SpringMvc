package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {
        @RequestMapping(value="/")
        public String greeting(ModelMap map){
            User user=new User();
            user.setUser("Shilpa");
            map.addAttribute("greeting","user is " +user.getUser()+ " as needed" );
            return "index";

        }


    }

