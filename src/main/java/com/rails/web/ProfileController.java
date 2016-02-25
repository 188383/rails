/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rails.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author pawel
 */

/*
    This controller will be responsible for serving the users that are logged in, that 
    is to load the account of the user. The controller controls all requests that
    are /user/{username}/
*/
@Controller

public class ProfileController {
    
    
    /**
     * TODO:
     * The class needs to have all dependencies injected. So analagous to the class
     * RegisterController where we used the @Autowired annotation. Remember that all
     * interfaces have be scanned by the component scanner!
     */
    
    /*
        This is the mapping the introducest the main page of the user.
    ideas:
    1 Create a list of options the user wants to make user of 
    2 Create a notifications board in the style of facebook or something else
    3 ... other ideas will be placed here.
    */
    //The profile page, this is presented after loggin in
    @RequestMapping({"/users/{username}"})
    public String profilePage(){
        return "profile";
    }
    
    /*
        This is the mapping that allows the user to make use of the credits service.
        The credit is purchased by the client and the client then has access to trailers.
        The details of credits is not clear but must plan for 
    a. per trip credits 
    b. time range credits, i.e over a period of x years
    */
    //serve the page with all the credit options
    @RequestMapping({"/users/{username}/credit"})
    public String profileCreditPage(){
        return "";
    }
    /*
        This is the mapping that serves the page that will show the list of all the trailers
        that are under use by the client. The trailers are then shown individually on a map if 
        need be and has a range of information about each trailer, i.e the amount of kilometers 
        travelled by the trailer, the start and end nodes of a graph etc.
    */
    //serve the page with information about trialers
    @RequestMapping({"/users/{username}/trailers"})
    public String profileTrailerPage(){
        
        return "";
    }
    /*
        This method displays a feature rich map that will have all the tracks placed
        on individual windows within the main computer, receiving real time location 
        feeds etc.
    */
    @RequestMapping({"users/{username}/map"})
    public String profileMapPage(){
        return "";
    }
    
}
