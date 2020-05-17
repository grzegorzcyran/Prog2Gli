package com.grcy.serialization.jaxb.xml;

import com.grcy.serialization.Person;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

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



}
