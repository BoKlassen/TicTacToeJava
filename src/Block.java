class Block{
    /*
    state = 0: Empty
    state = 1: X
    state = 2: O
     */
    private int state = 0;

    Block(){}

    int getState(){
        return this.state;
    }

    void setState(int state){
        this.state = state;
    }

    public boolean isValidState(int n){
        if(this.state == 0 || this.state == 1 || this.state == 2) return true;
        return false;
    }

    @Override
    public String toString(){
        switch(this.state){
            case 0:
                return "This block is empty";
            case 1:
                return "This block hold the value 'X'";
            case 2:
                return "This block hold the value 'X'";
        }
        return null;
    }
}