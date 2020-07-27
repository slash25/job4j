package ru.job4j.search;
import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDict phones = new PhoneDict();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    public void whenFindBySurname() {
        PhoneDict phones = new PhoneDict();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Arsentev");
        assertThat(persons.get(0).getName(), is("Petr"));
    }

    public void whenFindByPhone() {
        PhoneDict phones = new PhoneDict();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("534872");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    public void whenFindByAddress() {
        PhoneDict phones = new PhoneDict();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Bryansk");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}
