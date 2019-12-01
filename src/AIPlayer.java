/**
 *AIPlayer is a subclass to Player.
 */
class AIPlayer extends Player {

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
        }while(place > 9 || place < 1 || gameboard.getElement(place).getState() != ' ');

        gameboard.getElement(place).setState(this.symbol);
    }
}
