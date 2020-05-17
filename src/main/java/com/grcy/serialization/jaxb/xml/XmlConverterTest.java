package com.grcy.serialization.jaxb.xml;

import com.grcy.serialization.Person;

public class XmlConverterTest {
    public static void main(String[] args) {

        Person person = new Person("Anna", "Nowak", 22, "K", 1, "PL");

        PersonToXmlConverter.personToXmlString(person);
    }
}
