package za.ac.cput.yaseen.set;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class PersonSetTest {
    @Test
    public void testAddToSet() {


        Set<Person> set = new HashSet<>();
        PersonSet personSet = new PersonSet(set);
        Person person = new Person();
        person.setName("Yaseen");
        personSet.add(person);

        Assert.assertTrue(set.contains(person));


    }

    @Test
    public void testFindInSet() {


        Set<Person> set = new HashSet<>();
        PersonSet personSet = new PersonSet(set);
        Person person = new Person();
        person.setName("Yaseen");
        personSet.add(person);



        Person foundPerson = personSet.find("Yaseen");
        Assert.assertEquals(foundPerson, person);
        System.out.println(person.getName());

    }

    @Test
    public void testRemoveFromSet() {

        Set<Person> set = new HashSet<>();
        PersonSet personSet = new PersonSet(set);
        Person person = new Person();
        person.setName("Yaseen");
        personSet.add(person);

        personSet.remove(person);
        Assert.assertFalse(set.contains(person));

    }
}