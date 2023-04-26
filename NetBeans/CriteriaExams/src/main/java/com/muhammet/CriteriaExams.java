package com.muhammet;

import com.muhammet.relations.Person;
import com.muhammet.repository.PersonRepository;

public class CriteriaExams {

    public static void main(String[] args) {
        PersonRepository repository = new PersonRepository();
        Person person = new Person();
        person.setName("a");
        person.setAge(40);
        /**
         * select * from tblperson where name like '%a%' and age=40
         */
        repository.findByEntity(person);
    }
}
