package za.ac.cput.yaseen.collection;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;



public class PersonCollectionTest {

    @Test
    public void testAdd() {
        ArrayList<Person> collection = new ArrayList<>();
        PersonCollection personCollection = new PersonCollection(collection);
        Person person = new Person();

        person.setName("Yaseen");
        person.setAge(17);
        personCollection.add(person);
        Assert.assertTrue(collection.contains(person));
    }

    @Test
    public void testFind() {
        ArrayList<Person> collection = new ArrayList<>();
        PersonCollection personCollection = new PersonCollection(collection);
        Person person = new Person();

        person.setName("Yaseen");
        person.setAge(17);
        personCollection.add(person);

        Person foundPerson = personCollection.find("Yaseen");
        Assert.assertEquals(foundPerson, person);
        System.out.println(person.getName());
    }

    @Test
    public void testRemove() {
        ArrayList<Person> collection = new ArrayList<>();
        PersonCollection personCollection = new PersonCollection(collection);
        Person person = new Person();

        person.setName("Yaseen");
        person.setAge(17);
        personCollection.add(person);

        personCollection.remove(person);
        Assert.assertFalse(collection.contains(person));
    }

}