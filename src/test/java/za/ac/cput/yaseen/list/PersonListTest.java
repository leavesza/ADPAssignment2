package za.ac.cput.yaseen.list;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class PersonListTest {

    @Test
    public void testAdd() {
        ArrayList<Person> list = new ArrayList<>();
        PersonList personList = new PersonList(list);
        Person person = new Person();

        person.setName("Yaseen");
        person.setAge(17);
        personList.add(person);
        Assert.assertTrue(list.contains(person));
    }

    @Test
    public void testFind() {
        ArrayList<Person> list = new ArrayList<>();
        PersonList personList= new PersonList(list);
        Person person = new Person();


        person.setName("Yaseen");
        person.setAge(17);
        personList.add(person);

        Person foundPerson = personList.find("Yaseen");
        Assert.assertEquals(foundPerson, person);
        System.out.println(person.getName());
    }

    @Test
    public void testRemove() {
        ArrayList<Person> list = new ArrayList<>();
        PersonList personList = new PersonList(list);
        Person person = new Person();


        person.setName("Yaseen");
        person.setAge(17);
        personList.add(person);

        personList.remove(person);
        Assert.assertFalse(list.contains(person));
    }
}