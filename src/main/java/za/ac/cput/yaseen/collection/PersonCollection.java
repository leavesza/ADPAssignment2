package za.ac.cput.yaseen.collection;

import java.util.ArrayList;
import java.util.Collection;

public class PersonCollection {
    private Collection<Person> collection;

    public PersonCollection(){

        collection = new ArrayList();
    }

    public PersonCollection(ArrayList <Person> collection){
        this.collection = collection;

    }

    public void add(Person person){
        collection.add(person);

    }

    public Person find(String name){
        for(Person p: collection){
            if (p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    public void remove(Person person){
        collection.remove(person);
    }


}

