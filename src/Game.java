/**
 * Game.java contains the gameboard, manages iteration between Player moves, and checks for gamewin condition.
 */

import java.util.Scanner;

class Game{
    static Scanner sc = new Scanner(System.in);

    static Board board;
    private Player playerX, playerO;

    Game(){}

    /**
     * Ends the game and prints the appropriate message for passed Player.
     * @param player is used to determine win message. A null player implies draw condition.
     */
    private void win(Player player){
        if(player == null){
            System.out.println("It's a draw!");
        }else{
            System.out.println(player.getName() + " wins!");
        }
        board.displayBoard();
        System.exit(0);
    }

    /**
     * New game is started.
     */
    void start(){
        board = new Board();
        setup();

        //set proper symbols
        playerX.setSymbol('x');
        playerO.setSymbol('o');

        System.out.println("\nRandomly choosing turn order...\n");

        //xFirst variable determines of playerX will play first. Decided randomly.
        boolean xFirst;

        if(Math.random() < 0.5){
            xFirst = true;
        }else{
            xFirst = false;
        }

        //loops player turns until win condition or draw condition. Order is decided randomly and based on boolean xFirst
        if(xFirst){
            while(true){
                if(board.hasEmpty()){
                    playerX.play();
                    if(board.checkWin(playerX.getSymbol())) win(playerX);
                }else{
                    break;
                }
                if(board.hasEmpty()){
                    playerO.play();
                    if(board.checkWin(playerO.getSymbol())) win(playerO);
                }else{
                    break;
                }
            }
        }else{
            while(true){
                if(board.hasEmpty()){
                    playerO.play();
                    if(board.checkWin(playerO.getSymbol())) win(playerO);
                }else{
                    break;
                }
                if(board.hasEmpty()){
                    playerX.play();
                    if(board.checkWin(playerX.getSymbol())) win(playerX);
                }else{
                    break;
                }
            }
        }

        if(board.checkWin(playerX.getSymbol())) win(playerX);
        else if(board.checkWin(playerO.getSymbol())) win(playerO);
        else win(null);
    }

    /**
     * Determines the type of players, and gets their names.
     */
    private void setup(){
        int gamemode;
        System.out.println("Welcome to TicTacToe!\n");

        do{
            System.out.println("Please select one of the following game options:\n\t1 - Player vs Player\n\t2 - Player vs AI\n\t3 - AI vs AI\n");
            gamemode = sc.nextInt();
        }while(gamemode != 1 && gamemode != 2 && gamemode != 3);

        //gets player names
        System.out.println("Enter the name for Player X: ");
        String nameX = sc.next();
        System.out.println("Enter the name for Player O: ");
        String nameO = sc.next();

        switch(gamemode){
            case 1:
                playerX = new HumanPlayer(nameX);
                playerO = new HumanPlayer(nameX);
                break;
            case 2:
                playerX = new HumanPlayer(nameX);
                playerO = new AIPlayer(nameX);
                break;
            case 3:
                playerX = new AIPlayer(nameX);
                playerO = new AIPlayer(nameX);
                break;
        }
    }
}