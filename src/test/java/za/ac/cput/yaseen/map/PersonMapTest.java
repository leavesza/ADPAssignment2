package za.ac.cput.yaseen.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;


public class PersonMapTest {

    @Test
    public void testAdd() {

        Map<Integer,Person> map = new HashMap<>();
        PersonMap personMap = new PersonMap(map);

        Person person = new Person();

        person.setName("Yaseen");
        person.setAge(17);
        personMap.add(1,person);

        assertTrue(map.containsKey(1));
        assertTrue(map.containsValue(person));
    }

    @Test
    public void testFind() {
        Map<Integer,Person> map = new HashMap<>();
        PersonMap personMap = new PersonMap(map);

        Person person = new Person();

        person.setName("Yaseen");
        person.setAge(17);
        personMap.add(1,person);

        Person foundPerson = personMap.find(1);
        assertEquals(foundPerson,person);
        System.out.println(person.getName());
    }

    @Test
    public void testRemove() {

        Map<Integer,Person> map = new HashMap<>();
        PersonMap personMap = new PersonMap(map);

        Person person = new Person();

        person.setName("Yaseen");
        person.setAge(17);
        personMap.add(1,person);


        personMap.remove(1);
        assertFalse(map.containsKey(1));
    }
}