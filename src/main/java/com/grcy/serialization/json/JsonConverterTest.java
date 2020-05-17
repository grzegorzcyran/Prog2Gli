package com.grcy.serialization.json;

import com.grcy.serialization.Person;
import com.grcy.serialization.Persons;

import java.util.ArrayList;
import java.util.List;

public class JsonConverterTest {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski", 35, "M", 0, "PL");

        PersonJsonUtil.mapPersonToJson(person);

        PersonJsonUtil.savePersonToJsonFile(person);

        Person personRead = PersonJsonUtil.readPersonFromJsonFile("personJson.json");
        System.out.println("==============");
        System.out.println(personRead);

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

        PeopleJsonUtil.mapPeopleToJson(people);
        PeopleJsonUtil.savePeopleToJsonFile(people);

        Persons readPersons = PeopleJsonUtil.readPeopleFromJsonFile("peopleJson.json");
        System.out.println("=========Read people from JSON file==========");
        System.out.println(readPersons);
        readPersons.getPeople().forEach(System.out::println);
    }

}
/**
JSON - JavaScript Object Notation
 {
    "fistName" : "Anna",
    "lastName" : "Mucha",
    ...
        }
 {
 "lastName" : "Wojewódzki",
 ...
 }

 */

/**
CSV
1. Nagłówek (opcjonalny)
firstname,lastname,age
2. Dane (must have)
Anna,Mucha,40,,,,,
Kuba,Wojewódzki,42
 */
