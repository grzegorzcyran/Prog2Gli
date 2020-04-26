package com.grcy.solid.liskov;

public class ReadOnlyFile implements FileOperation {
    @Override
    public byte[] read() {
        // reads data
        return new byte[0];
    }

    @Override
    public void write(byte[] data) {
        throw new UnsupportedOperationException();
    }
}
