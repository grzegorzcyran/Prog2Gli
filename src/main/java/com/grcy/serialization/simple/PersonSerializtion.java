package com.grcy.serialization.simple;

import com.grcy.serialization.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonSerializtion {

    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Nowak", 33, "M", 2, "PL");

        try {
            //Tworzymy strumień wyjściowy i przekazujemy do niego obiekt
            //Obiekt ma być zapisany w pliku
            FileOutputStream fout = new FileOutputStream("PersonSerialized.data");
            ObjectOutputStream outputStream = new ObjectOutputStream(fout);

            outputStream.writeObject(person1);
            outputStream.close();
            fout.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
