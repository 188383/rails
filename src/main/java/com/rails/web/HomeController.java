package com.rails.web;

import java.util.HashMap;
import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController{
    
        private HashMap<String,String> urls;
    
        public HomeController(){
            
        }
    
	@RequestMapping(value={"/","/home"},method=GET)
	public String home(Model model){
            
            model.addAttribute("message", "This is the message I have");
            return "home";	
	}
        
        @RequestMapping(value={"/about"},method=GET)
        public String about(Model model){
            String message = "This is the about which will hold the message";
            model.addAttribute("message", message);
            return "about";
        }
        
        @RequestMapping(value={"/faq"},method=GET)
        public String faq(){
            return "faq";
        }
}
