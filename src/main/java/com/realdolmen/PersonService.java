package com.realdolmen;


public class PersonService {

    PersonRepository personRepository;

    public void save (Person person){
        personRepository.save(person);
    }

    public Person findbyID (Integer id) {
        return personRepository.find(id);
    }

    public void removebyID (Integer id){
        Person p = personRepository.find(id);
        personRepository.remove(p);
    }

}
