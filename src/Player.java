<<<<<<< HEAD
abstract public class Player implements Global{
=======
/**
 * Player is an abstract class
 */
abstract class Player {
>>>>>>> 87508b809ea7073eaa64a7329bf61df256760682

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
<<<<<<< HEAD

=======
>>>>>>> 87508b809ea7073eaa64a7329bf61df256760682
}
