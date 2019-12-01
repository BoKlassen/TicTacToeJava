<<<<<<< HEAD
class AIPlayer extends Player {

=======
/**
 *AIPlayer is a subclass to Player.
 */
class AIPlayer extends Player {
>>>>>>> 87508b809ea7073eaa64a7329bf61df256760682

    AIPlayer(String name){
        this.name = name;
    }

    void play() {
        Board gameboard = Game.board;

        gameboard.displayBoard();

        System.out.println(name + "'s turn! Randomly choosing!");
        int place;
        do{
            place = (int) (Math.random() * 9) + 1;
        }while(place > 9 || place < 1 || gameboard.getElement(place).getState() != EMPTY);

        gameboard.getElement(place).setState(this.symbol);
    }
}
