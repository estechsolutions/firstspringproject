package com.estech.solutions.firstspringproject.service;

import java.util.List;

import com.estech.solutions.firstspringproject.dao.PersonDao;
import com.estech.solutions.firstspringproject.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    
    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

 
    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }


    public List<Person> selectAllPeople(){
        return personDao.selectAllPeople();
    }


}
