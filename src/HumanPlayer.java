<<<<<<< HEAD
public class HumanPlayer extends Player {

    Board gameboard;

=======
class HumanPlayer extends Player {
>>>>>>> 87508b809ea7073eaa64a7329bf61df256760682
    HumanPlayer(String name){
        this.name = name;
    }

    void play(){
        Board gameboard = Game.board;

        gameboard.displayBoard();

        System.out.println(name + "'s turn! Make a move!");
        int place;
        do{
            System.out.println("Enter a value");
            place = Game.sc.nextInt();
        }while(place > 9 || place < 1 || gameboard.getElement(place).getState() != EMPTY);

        gameboard.getElement(place).setState(this.symbol);

    }
}
