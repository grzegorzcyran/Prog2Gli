package com.grcy.patterns.behavioral.command;

public class UpdateFileOperation implements FileOperation {
    MyFile myFile;

    public UpdateFileOperation(MyFile myFile) {
        this.myFile = myFile;
    }

    @Override
    public String performOperation(String content) {
        return myFile.updateFile(content);
    }
}
