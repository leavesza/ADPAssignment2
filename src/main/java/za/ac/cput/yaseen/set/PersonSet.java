package za.ac.cput.yaseen.set;

import java.util.HashSet;
import java.util.Set;

public class PersonSet {
    private Set<Person> set;

    public PersonSet(){

        set= new HashSet<Person>(){};
    }

    public PersonSet(Set<Person> set){

        this.set = set;

    }

    public void add(Person person){

        set.add(person);

    }

    public Person find(String name){

        for(Person person: set){
            if (person.getName().equals(name)){
                return person;
            }
        }
        return null;
    }

    public void remove(Person person){
        set.remove(person);
    }

}

