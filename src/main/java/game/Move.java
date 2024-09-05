package game;

public class Move {

    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    private Cell cell;


    public Move(Cell cell, Player player) {
        this.player = player;
        this.cell = cell;
    }

    public Cell getCell() {
        return cell;
    }
}

