package com.grcy.serialization;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

//Niezbędna anotacja dla JAXB
@XmlRootElement
//innterfejs Serializable jest potrzebny do
//umożliwienia serializacji klasy
public class Person implements Serializable {
    private String firstName;
    private String lastName;

    // transient oznacza że dane pole nie będzie serializowane
    // czyli nie trafi do strumienia serializowanych danych
    // przy odczycie ze strumienia zostanie zainicjowane
    // wartością domyślną
    private transient int age;
    private String gender;
    private int noOfChildren;
    private String nationality;

    /**
     * Konstruktor bezargumentowy na potrzeby JAXB
     */
    public Person() {
    }

    public Person(String firstName, String lastName, int age, String gender, int noOfChildren, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.noOfChildren = noOfChildren;
        this.nationality = nationality;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNoOfChildren() {
        return noOfChildren;
    }

    public void setNoOfChildren(int noOfChildren) {
        this.noOfChildren = noOfChildren;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", noOfChildren=" + noOfChildren +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
