import java.util.Scanner;

class Game{
    Scanner sc = new Scanner(System.in);

    private Board board;
    private Player playerX, playerO;

    Game(){

    }

    void start(){
        this.board = new Board();
        setup();

    }

    void setup(){
        //gamemode determines the type of players
        int gamemode;
        System.out.println("Welome to TicTacToe!\n");

        do{
            System.out.println("Please select one of the following game options:\n\t1 - Player vs Player\n\t2 - Player vs AI\n\t3 - AI vs AI\n");
            gamemode = sc.nextInt();
        }while(gamemode != 0 && gamemode != 1 && gamemode != 2);

        switch(gamemode){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        
    }
}