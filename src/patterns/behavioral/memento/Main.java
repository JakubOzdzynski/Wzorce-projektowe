package patterns.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        GameState gameState = new GameState(1, "Level 1");
        System.out.println(gameState);
        GameStateMemento memento = gameState.saveGame();
        System.out.println(gameState);
        gameState.changeGameState(2, "Level 2");
        System.out.println(gameState);
        gameState.restore(memento);
        System.out.println(gameState);
    }
}
