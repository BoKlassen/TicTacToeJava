class Block implements Global{
    /*
    state = 0: Empty
    state = 1: X
    state = 2: O
     */
    private char state = 0;

    Block(){}

    int getState(){
        return this.state;
    }

    void setState(char state){
        this.state = state;
    }

    public boolean isValidState(int n){
        if(this.state == EMPTY || this.state == X || this.state == O) return true;
        return false;
    }

    @Override
    public String toString(){
        switch(this.state){
            case EMPTY:
                return "This block is empty";
            case X:
                return "This block hold the value 'X'";
            case O:
                return "This block hold the value 'X'";
        }
        return null;
    }
}