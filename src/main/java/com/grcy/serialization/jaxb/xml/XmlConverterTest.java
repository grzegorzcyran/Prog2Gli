package com.grcy.serialization.jaxb.xml;

import com.grcy.serialization.Person;

import java.util.Optional;

public class XmlConverterTest {
    public static void main(String[] args) {

        Person person = new Person("Anna", "Nowak", 22, "K", 1, "PL");

        //Person do XMLa na ekran
        PersonToXmlConverter.personToXmlString(person);

        //Person do XMLa w pliku
        PersonToXmlConverter.personToXMLFile(person);
        System.out.println("============");
        Optional<Person> optionalPerson = PersonToXmlConverter.xmlFileToPerson("personToXML.xml");
        if (optionalPerson.isPresent()) {
            System.out.println(optionalPerson.get());
        } else {
            System.out.println("Nobody");
        }

    }
}
