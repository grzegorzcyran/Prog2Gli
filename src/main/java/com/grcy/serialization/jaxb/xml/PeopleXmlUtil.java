package com.grcy.serialization.jaxb.xml;

import com.grcy.serialization.Person;
import com.grcy.serialization.Persons;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringWriter;
import java.util.Optional;

public class PeopleXmlUtil {

    public static void peopleToXmlString(Persons persons) {

        try {
            JAXBContext context = JAXBContext.newInstance(Persons.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter stringWriter = new StringWriter();
            marshaller.marshal(persons, stringWriter);

            System.out.println(stringWriter.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void peopleToXMLFile(Persons persons) {

        try {
            JAXBContext context = JAXBContext.newInstance(Persons.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File file = new File("peopleToXml.xml");
            marshaller.marshal(persons, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public static Optional<Persons> xmlFileToPeople(String fileName) {
        File xmlFile = new File(fileName);
        JAXBContext jaxbContext;
        Persons persons = null;

        try {
            jaxbContext = JAXBContext.newInstance(Persons.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            persons = (Persons) unmarshaller.unmarshal(xmlFile);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return Optional.ofNullable(persons);

    }

}
