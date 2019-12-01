import java.util.Scanner;

class Game implements Global{
    static Scanner sc = new Scanner(System.in);

    static Board board;
    private Player playerX, playerO;

    Game(){

    }

    void win(Player player){
        if(player == null){
            System.out.println("It's a draw!");
        }else{
            System.out.println(player.getName() + " wins!");
        }
        board.displayBoard();
        System.exit(0);
    }

    void start(){
        board = new Board();
        setup();

        //set proper symbols
        playerX.setSymbol(X);
        playerO.setSymbol(O);

        System.out.println("\nRandomly choosing turn order...\n");

        boolean xFirst;

        if(Math.random() < 0.5){
            xFirst = true;
        }else{
            xFirst = false;
        }

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

    private void setup(){
        //gamemode determines the type of players
        int gamemode;
        System.out.println("Welcome to TicTacToe!\n");

        do{
            System.out.println("Please select one of the following game options:\n\t1 - Player vs Player\n\t2 - Player vs AI\n\t3 - AI vs AI\n");
            gamemode = sc.nextInt();
        }while(gamemode != 1 && gamemode != 2 && gamemode != 3);

        switch(gamemode){
            case 1:
                System.out.println("Enter the name for Player X: ");
                playerX = new HumanPlayer(sc.next());
                System.out.println("Enter the name for Player O: ");
                playerO = new HumanPlayer(sc.next());
                break;
            case 2:
                System.out.println("Enter the name for Player X: ");
                playerX = new HumanPlayer(sc.next());
                System.out.println("Enter the name for Player O: ");
                playerO = new AIPlayer(sc.next());
                break;
            case 3:
                System.out.println("Enter the name for Player X: ");
                playerX = new AIPlayer(sc.next());
                System.out.println("Enter the name for Player O: ");
                playerO = new AIPlayer(sc.next());
                break;
        }
    }
}