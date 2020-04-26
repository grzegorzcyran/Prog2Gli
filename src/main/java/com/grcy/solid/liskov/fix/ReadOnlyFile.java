package com.grcy.solid.liskov.fix;

public class ReadOnlyFile implements FileReadable {
    @Override
    public byte[] read() {
        return new byte[0];
    }
}
