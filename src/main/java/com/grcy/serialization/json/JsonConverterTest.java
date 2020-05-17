package com.grcy.serialization.json;

import com.grcy.serialization.Person;

public class JsonConverterTest {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski", 35, "M", 0, "PL");

        PersonJsonUtil.mapPersonToJson(person);
    }

}
