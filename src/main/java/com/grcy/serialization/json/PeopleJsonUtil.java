package com.grcy.serialization.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grcy.serialization.Person;
import com.grcy.serialization.Persons;

import java.io.File;
import java.io.IOException;

public class PeopleJsonUtil {

    public static void mapPeopleToJson(Persons persons) {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = null;

        try {
            jsonString = objectMapper.writeValueAsString(persons);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(jsonString);
    }

    public static void savePeopleToJsonFile(Persons persons) {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("peopleJson.json");

        try {
            objectMapper.writeValue(file, persons);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Persons readPeopleFromJsonFile(String fileName) {
        ObjectMapper objectMapper = new ObjectMapper();
        Persons persons = null;
        File file = new File(fileName);

        try {
            persons = objectMapper.readValue(file, Persons.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }
}
