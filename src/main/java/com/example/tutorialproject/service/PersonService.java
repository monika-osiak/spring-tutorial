package com.example.tutorialproject.service;

import com.example.tutorialproject.dao.PersonDao;
import com.example.tutorialproject.model.Person;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
