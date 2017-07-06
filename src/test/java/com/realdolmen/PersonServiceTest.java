package com.realdolmen;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.matchers.Null;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.same;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

    @Mock PersonRepository personRepository;
    private Person person;

    @InjectMocks
    private PersonService personService = new PersonService();

    @Before
    public void makeNewPerson () {
         person = new Person("K","D",null, null);
    }

    @Test
    public void testPersonIsSaved (){
        personService.save(person);
        verify(personRepository).save(same(person));
    }

    @Test
    public void testPersonIsFoundById (){
        when(personRepository.find(anyInt())).thenReturn(person);
        personService.findbyID(10);
        verify(personRepository).find(anyInt());

    }

    @Test
    public void testPersonIsRemovedById () {
        when(personRepository.find(anyInt())).thenReturn(person);
        personService.removebyID(anyInt());
        verify(personRepository).find(anyInt());
        verify(personRepository).remove(same(person));

    }







}
