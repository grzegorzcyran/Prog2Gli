package com.grcy.serialization.simple;

import com.grcy.serialization.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonDeserialization {

    public static void main(String[] args) {
        Person person = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("PersonSerialized.data");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            person = (Person) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(person);
    }
}
