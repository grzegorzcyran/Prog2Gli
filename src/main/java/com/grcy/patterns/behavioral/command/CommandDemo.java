package com.grcy.patterns.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        MyFile file = new MyFile("sample.txt");

        file.createFile("zawartość po staremu");

        FileOperationPerformer performer = new FileOperationPerformer();
        performer.executeOperation(new CreateFileOperation(file), "zawartość po nowemu");

        performer.executeOperation(new UpdateFileOperation(file), "dopisanie zawartości");


    }
}
