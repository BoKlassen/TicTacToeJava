abstract public class Player {

    char symbol;
    String name;

    Player(){}

    Player(String name){
        this.name = name;
    }

    abstract void play();

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    int getStateSymbol(){
        switch(symbol){
            case ' ':
                return 0;
            case 'x':
                return 1;
            case 'o':
                return 2;
        }
        return '0';
    }
}
