package com.grcy.solid.dip.fix;

public class Test {
    public static void main(String[] args) {

        Repository repository = new FileRepository();
        TaskService taskService = new TaskService(repository);

        taskService.addTask("Task1");

        //=================

        repository = new DBRepository();

        TaskService taskService1 = new TaskService(repository);

        taskService1.removeTask(1);


        //============================
        // wcześniej miał FileRepo, teraz DBRepo
        taskService = new TaskService(repository);
    }
}
