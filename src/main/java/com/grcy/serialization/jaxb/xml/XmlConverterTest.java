package com.grcy.serialization.jaxb.xml;

import com.grcy.serialization.Person;
import com.grcy.serialization.Persons;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class XmlConverterTest {
    public static void main(String[] args) {

        Person person = new Person("Anna", "Nowak", 22, "K", 1, "PL");
        Person person2 = new Person("Maria", "Paluc", 28, "K", 2, "PL");
        Person person3 = new Person("Jacek", "Wojak", 33, "M", 0, "PL");
        Person person4 = new Person("Igor", "Mostowy", 55, "M", 4, "PL");

        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        Persons people = new Persons();
        people.setPeople(personList);
        System.out.println("==========People List XML===========");
        //Person do XMLa na ekran
        PeopleXmlUtil.peopleToXmlString(people);

        //Person do XMLa w pliku
        PeopleXmlUtil.peopleToXMLFile(people);
        System.out.println("======Print XML======");
        Optional<Persons> optionalPersons = PeopleXmlUtil.xmlFileToPeople("peopleToXml.xml");
        if (optionalPersons.isPresent()) {
            System.out.println(optionalPersons.get());
            optionalPersons.get().getPeople().forEach(System.out::println);
        } else {
            System.out.println("Nobody");
        }

    }
}
