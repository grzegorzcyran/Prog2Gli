package com.grcy.solid.liskov;

public class File implements FileOperation {
    @Override
    public byte[] read() {
        // reads data
        return new byte[0];
    }

    @Override
    public void write(byte[] data) {
        // writes data
    }

}
