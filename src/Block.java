class Block{
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
        if(this.state == ' ' || this.state == 'x' || this.state == 'o') return true;
        return false;
    }

    @Override
    public String toString(){
        switch(this.state){
            case ' ':
                return "This block is empty";
            case 'x':
                return "This block hold the value 'X'";
            case 'o':
                return "This block hold the value 'X'";
        }
        return null;
    }
}