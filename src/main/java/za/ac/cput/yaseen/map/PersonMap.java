package za.ac.cput.yaseen.map;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {

    private Map<Integer,Person> map;

    public PersonMap()
    {
        map= new HashMap<>();
    }

    public PersonMap(Map<Integer,Person> map)
    {

        this.map = map;

    }

    public void add(int id, Person person)
    {
        map.put(id,person);
    }

    public Person find(int id)
    {

        return map.get(id);
    }

    public void remove(int id)
    {

        map.remove(id);
    }
}
