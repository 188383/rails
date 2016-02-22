/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rails.data;

import com.rails.entity.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *
 * @author pawel
 */
@Component
public class PersonRepositoryImpl implements PersonRepository{
    
    private ArrayList<Person> people;
    
    public PersonRepositoryImpl(){
        this.people = new ArrayList();
        for(int i=0;i<10;i++){
            String name = Integer.toString(i);
            String surname = Integer.toString(i);
            String password = Integer.toString(i);
            this.people.add(new Person(name,surname,password));
        }
    }
    
    public List<Person> findPeople(long max, int count) {
        return this.people;
    }
    
}
