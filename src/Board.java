class Board {

    private Block gameboard[][];

    Board(){
        gameboard = new Block[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                gameboard[i][j] = new Block();
                gameboard[i][j].setState(' ');
            }
        }
    }

    //todo: makemove()
    //todo: getstate()
    //todo: updatestate()

    /**
     * Checks if there is an empty Block in the board
     * @return is true if empty block exists.
     */
    boolean hasEmpty(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(gameboard[i][j].getState() == ' ') return true;
            }
        }
        return false;
    }

    boolean checkWin(char symbol){
        if(checkHorizontalWin(symbol) || checkVerticalWin(symbol) || checkDiagonalWin(symbol)) return true;
        return false;
    }

    private boolean checkHorizontalWin(char symbol){
        if(gameboard[0][0].getState() == symbol && gameboard[0][1].getState() == symbol && gameboard[0][2].getState() == symbol) return true;
        else if(gameboard[1][0].getState() == symbol && gameboard[1][1].getState() == symbol && gameboard[1][2].getState() == symbol) return true;
        else if(gameboard[2][0].getState() == symbol && gameboard[2][1].getState() == symbol && gameboard[2][2].getState() == symbol) return true;
        return false;
    }

    private boolean checkVerticalWin(char symbol){
        if(gameboard[0][0].getState() == symbol && gameboard[1][0].getState() == symbol && gameboard[2][0].getState() == symbol) return true;
        else if(gameboard[0][1].getState() == symbol && gameboard[1][1].getState() == symbol && gameboard[2][1].getState() == symbol) return true;
        else if(gameboard[0][1].getState() == symbol && gameboard[1][2].getState() == symbol && gameboard[2][2].getState() == symbol) return true;
        return false;
    }

    private boolean checkDiagonalWin(char symbol){
        //checks middle item
        if(gameboard[1][1].getState() != symbol) return false;
        //checks corners
        if(gameboard[0][0].getState() == symbol && gameboard[2][2].getState() == symbol) return true;
        else if(gameboard[2][0].getState() == symbol && gameboard[0][2].getState() == symbol) return true;
        return false;
    }

    void displayBoard(){
        System.out.println((char)gameboard[0][0].getState() + "|" + (char)gameboard[0][1].getState() + "|" + (char)gameboard[0][2].getState());
        System.out.println((char)gameboard[1][0].getState() + "|" + (char)gameboard[1][1].getState() + "|" + (char)gameboard[1][2].getState());
        System.out.println((char)gameboard[2][0].getState() + "|" + (char)gameboard[2][1].getState() + "|" + (char)gameboard[2][2].getState());
    }

    char stateToChar(int state){
        switch(state){
            case 0:
                return ' ';
            case 1:
                return 'x';
            case 2:
                return 'o';
        }
        return '0';
    }

    Block getElement(int n){
        return gameboard[(n-1)/3][(n-1)%3];
    }
}
