/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rails.web;

import com.rails.data.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author pawel
 */
@Controller
@RequestMapping({"/login"})
public class LoginController {
    
    private PersonRepository personRepository;
    
    @Autowired
    public LoginController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public String loginForm(){
        
        return "login";
    }
    

    /**
     * @return the personRepository
     */
    public PersonRepository getPersonRepository() {
        return personRepository;
    }

    /**
     * @param personRepository the personRepository to set
     */
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
}
