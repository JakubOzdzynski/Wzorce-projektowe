package patterns.behavioral.memento;

public class GameStateMemento {
    private int id;
    private String gameState;

    public GameStateMemento(int id, String gameState) {
        this.id = id;
        this.gameState = gameState;
    }

    public int getId() {
        return id;
    }

    public String getGameState() {
        return gameState;
    }
}
