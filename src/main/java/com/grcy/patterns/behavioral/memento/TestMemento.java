package com.grcy.patterns.behavioral.memento;

public class TestMemento {
    public static void main(String[] args) {

        System.out.println("========MEMENTO========");
        GameState gameState = new GameState(1, "Etap 1");

        System.out.println(gameState);
        GameStateMemento memento1 = gameState.saveGame();

        System.out.println(gameState);
        gameState.changeGameState(2, "Etap 2");

        System.out.println(gameState);

        gameState.restore(memento1);

        System.out.println(gameState);

    }
}
