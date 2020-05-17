package com.grcy.serialization.jaxb.xml;

import com.grcy.serialization.Person;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringWriter;
import java.util.Optional;

public class PersonToXmlConverter {

    public static void personToXmlString(Person person) {

        try {
            // wskazanie klasy którą będziemy konwertowac do XML
            JAXBContext context = JAXBContext.newInstance(Person.class);
            // powołanie obiektu do przekształcenia Person w strumień danych
            Marshaller marshaller = context.createMarshaller();
            //ustawiamy że XML ma byś w formacie JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter stringWriter = new StringWriter();
            //wykonanie transformacji obiektu do XMLa
            marshaller.marshal(person, stringWriter);

            System.out.println(stringWriter.toString());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void personToXMLFile(Person person) {

        try {
            JAXBContext context = JAXBContext.newInstance(Person.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File file = new File("personToXml.xml");
            marshaller.marshal(person, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public static Optional<Person> xmlFileToPerson(String fileName) {
        File xmlFile = new File(fileName);
        JAXBContext jaxbContext;
        Person person = null;

        try {
            jaxbContext = JAXBContext.newInstance(Person.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            person = (Person) unmarshaller.unmarshal(xmlFile);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return Optional.ofNullable(person);

    }

}
