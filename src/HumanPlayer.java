import java.util.Scanner;

public class HumanPlayer extends Player {

    Board gameboard;

    HumanPlayer(String name){
        this.name = name;
    }

    void play(){
        gameboard = Game.board;

        gameboard.displayBoard();

        System.out.println(name + "'s turn! Make a move!");
        int place;
        do{
            System.out.println("Enter a value");
            place = Game.sc.nextInt();
        }while(place > 9 || place < 1 && gameboard.getElement(place).getState() == 0);

        gameboard.getElement(place).setState(getStateSymbol());

    }
}
