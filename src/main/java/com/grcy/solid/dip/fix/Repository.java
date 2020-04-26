package com.grcy.solid.dip.fix;

public interface Repository {

    void saveTask(String task);

    void deleteTask(int taskId);

}
