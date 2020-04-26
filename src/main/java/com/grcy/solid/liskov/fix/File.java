package com.grcy.solid.liskov.fix;

public class File implements FileWritable, FileReadable {

    @Override
    public byte[] read() {
        return new byte[0];
    }

    @Override
    public void write(byte[] data) {

    }
}
