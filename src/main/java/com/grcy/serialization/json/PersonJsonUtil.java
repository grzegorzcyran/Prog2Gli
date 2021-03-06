package com.grcy.serialization.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grcy.serialization.Person;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class PersonJsonUtil {

    public static void mapPersonToJson(Person person) {
        //klasa do odwzorowania wskazanych obiektów (u nas Person)
        //na strumień danych JSON (i odwrotnie)
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = null;

        try {
            //zapis obiektu do JSON Stringa
            jsonString = objectMapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(jsonString);
    }

    public static void savePersonToJsonFile(Person person) {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("personJson.json");

        try {
            //zapisujemy do pliku obiekt person przekształcony do JSONa
            objectMapper.writeValue(file, person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Person readPersonFromJsonFile(String fileName) {
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = null;
        File file = new File(fileName);

        try {
            person = objectMapper.readValue(file, Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return person;
    }
}
