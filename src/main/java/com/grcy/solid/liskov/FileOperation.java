package com.grcy.solid.liskov;

public interface FileOperation {
    byte[] read();

    void write(byte[] data);
}
