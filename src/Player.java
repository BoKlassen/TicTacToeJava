/**
 * Player is an abstract class
 */
abstract class Player {

    char symbol;
    String name;

    Player(){}

    abstract void play();

    String getName(){
        return name;
    }

    char getSymbol() {
        return symbol;
    }

    void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
