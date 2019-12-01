abstract public class Player implements Global{

    char symbol;
    String name;

    Player(){}

    abstract void play();

    String getName(){
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    void setSymbol(char symbol) {
        this.symbol = symbol;
    }

}
