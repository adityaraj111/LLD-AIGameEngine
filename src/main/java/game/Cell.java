package game;

public class Cell {
    int row;
    int col;

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
