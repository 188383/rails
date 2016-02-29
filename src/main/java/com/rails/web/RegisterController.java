/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rails.web;
import com.rails.data.PersonRepository;
import com.rails.entity.Person;
import java.util.Map;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
@RequestMapping({"/register"})
public class RegisterController {
    
    private PersonRepository personRepository;
    
    @Autowired
    public RegisterController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
    
    /*
        Note, to get instances of the request and response objects just include 
        these two variables into the input variables for the method that requires
        them.
    
        Below we have the registration form method. This method is currently using
        JSP and the JSTL tag. The model that is declared in this class is used 
        to validate the user.
    */
    
    @RequestMapping(method=RequestMethod.GET)
    public String registerationForm(Model model){
        Person person = new Person();
        model.addAttribute("person",person);
        return "forms/register";
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public String registrationProcess(@RequestParam Map<String,String>params,
            HttpServletRequest request){
        for(String str : params.keySet()){
            System.out.println(params.get(str));
            
        }
        return "redirect:home";
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
