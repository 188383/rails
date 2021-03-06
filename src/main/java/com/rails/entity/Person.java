/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rails.entity;

import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import javax.validation.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 *
 * @author pawel
 * TODO
 * This model still needs to have validation added to it. Further planning of the database
 * will also be needed. 
 */

/*
    This class represents the person entity. This is the class that describes 
    all people involved in a particular organisation. 

TODO:  add a role/group to each person. When we have a group created we can have
multiple users use a company account to do updates and to use the applications.
ie. users can be owner, manager, simple or what ever other segregation we need. 
*/

public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String picturseUrl;
    private String locationUrl;
    private Long salt;
    
    public Person(){
        this.id = null;
        this.firstName = "";
        this.lastName = "";
        this.username = "";
        this.password = "";
        this.salt = null;
    }
    
    public Person(String firstName,String lastName,String password){
        this.id = null;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.salt = null;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the salt
     */
    public Long getSalt() {
        return salt;
    }

    /**
     * @param salt the salt to set
     */
    public void setSalt(Long salt) {
        this.salt = salt;
    }
    @Override
    public boolean equals(Object that){
        return EqualsBuilder.reflectionEquals(this,that,"id","time");
    }
    @Override
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this, "id","time");
    }

    /**
     * @return the picturseUrl
     */
    public String getPicturseUrl() {
        return picturseUrl;
    }

    /**
     * @param picturseUrl the picturseUrl to set
     */
    public void setPicturseUrl(String picturseUrl) {
        this.picturseUrl = picturseUrl;
    }

    /**
     * @return the locationUrl
     */
    public String getLocationUrl() {
        return locationUrl;
    }

    /**
     * @param locationUrl the locationUrl to set
     */
    public void setLocationUrl(String locationUrl) {
        this.locationUrl = locationUrl;
    }
}
