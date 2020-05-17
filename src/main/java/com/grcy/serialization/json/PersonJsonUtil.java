package com.grcy.serialization.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grcy.serialization.Person;

public class PersonJsonUtil {

    public static void mapPersonToJson(Person person) {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = null;

        try {
            jsonString = objectMapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(jsonString);
    }
}
