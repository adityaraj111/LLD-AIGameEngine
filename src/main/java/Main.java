import api.AIEngine;
import api.GameEngine;
import api.RuleEngine;
import game.Board;
import game.Cell;
import game.Move;
import game.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameEngine gameEngine = new GameEngine();
        AIEngine aiEngine = new AIEngine();
        RuleEngine ruleEngine = new RuleEngine();
        Board board = gameEngine.start("TicTacToe");
        Scanner scanner = new Scanner(System.in);
        int row, col;
        while(!ruleEngine.getState(board).isOver()) {
            System.out.println("Make your move!");
            System.out.println(board);
            Player computer = new Player("O");
            Player human = new Player("X");
            row = scanner.nextInt();
            col = scanner.nextInt();
            Move oppMove = new Move(new Cell(row, col), human);
            board.move(oppMove);
            if (!ruleEngine.getState(board).isOver()) {
                Move computerMove = aiEngine.suggestMove(computer, board);
                board.move(computerMove);
            }
        }
        System.out.println("GameResult: "+ruleEngine.getState(board));
        System.out.println(board);
    }

}
