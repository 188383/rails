/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rails.web;

import com.rails.data.PersonRepository;
import com.rails.data.PersonRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 *
 * @author pawel
 */
@Controller
@RequestMapping("/users")
public class PersonController {
    
    PersonRepository person;
    
//    public PersonController(){
//        person = new PersonRepositoryImpl();
//    }
    /**
     * To make this autowiring nonesense work, you have to set up 
     * a component scan for the components that you are looking for
     * @param person 
     */
    @Autowired
    public PersonController(PersonRepository person){
        this.person = person;
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public String people(Model model){
        model.addAttribute("personList",person.findPeople(Long.MAX_VALUE, 10));
        return "people";
    }
}
