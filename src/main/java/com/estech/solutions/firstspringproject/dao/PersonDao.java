package com.estech.solutions.firstspringproject.dao;

import java.util.List;
import java.util.UUID;
import com.estech.solutions.firstspringproject.model.Person;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();
    
}
