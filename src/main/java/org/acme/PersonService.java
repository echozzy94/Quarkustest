package org.acme;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;

@ApplicationScoped
public class PersonService {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public String getAllPersons(){
        return persons.toString();
    }

    public ArrayList<Person> getPersonList(){
        return persons;
    }

    public void addPerson(Person person){
        persons.add(person);
    }


}
