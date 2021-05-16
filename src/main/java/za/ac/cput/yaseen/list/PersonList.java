package za.ac.cput.yaseen.list;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    private List<Person> list;

    public PersonList(){
        list = new ArrayList<Person>(){};
    }

    public PersonList(List<Person>list){
        this.list = list;
    }

    public void add(Person person){
        list.add(person);
    }

    public Person find(String personName){
        for(Person person: list){
            if (person.getName().equals(personName)){
                return person;
            }
        }
        return null;
    }

    public void remove(Person person){
        list.remove(person);
    }
}
