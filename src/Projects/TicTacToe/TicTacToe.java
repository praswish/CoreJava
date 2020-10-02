//TicTacToe
//Created by Praswish Maharjan 10/02/2020 praswish@gmail.com
//Player 1 + Player 2
//Play vs Computer not implemented
/*
Variables
int board[][] = new int[3][3];//{{0,0,0},{0,0,0},{0,0,0}}; //3X3 board that stores 0/1/2 - 0 empty - 1 Player1 - 2 Player2
int player // player 1 or player 2
int postion // position in board 1 to 9
int count // count how many position are filled in a game after 9 it reset the board

Functions
public void start()                         - start the game
public void displayBoard()                  - Display the Board
    public char dispChar(int number)        - dispal a particular char in displayBoard
public int[] rowcol(int number)             - convert postion to row and col on board
boolean checkResult( int player)            - Check if the player is winner
boolean playboard(int position, int player) - put the move in the board / return false if square is already occupied
public int inputboard(int player)           - Input the move (0-9) Check if the input is valid(0-9) and the position must be 0 before

*/
package Projects.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    int board[][] = new int[3][3];//{{0,0,0},{0,0,0},{0,0,0}};
    public void start(){
        displayBoard();

        int player =1, position,count=0;
        do{

            position =inputboard(player);

            if (position!=0) {
                playboard(position, player);
                displayBoard();

                if (checkResult(player)==true) {
                    System.out.println("Player " + player + " wins");
                    position =0;
                }
            }
            if (player==1) player =2;
                    else player=1;
            ++count;
            if (count == 9) {
                System.out.println("It's a draw: ");
                board = new int[3][3];
                displayBoard();
                count =0;
            }
        }while(position !=0);
        //Check if rc functio is working
        /*int rc[]= {0,0};
        for (int i=1 ; i<=9; i++ ) {
            rc = rowcol(i);
            System.out.println(i + " = " + rc[0] + " : " +rc[1]);
        }*/
    }

    public void displayBoard(){
        System.out.println("TicTacToe Version 1.0 - Praswish");
        System.out.println("Press 1 to 9 to select a particular cell from left to right| top to bottom ( 0 to exit )");
        System.out.println("-------------------------");

        for (int i =0; i < 3 ; i++){
            System.out.print("|\t");
            for(int j=0; j < 3 ; j++){
                System.out.print(dispChar(board[i][j]) + "\t|\t");
            }
            System.out.println();
            System.out.println("-------------------------");
        }

    }

    public char dispChar(int number){
        char ch='*';
        switch (number){
            case 0:
                ch = ' ';
                break;
            case 1:
                ch = 'X';
                break;
            case 2:
                ch = 'O';
                break;
        }
        return ch;
    }

    public int[] rowcol(int number){
        int rc[]= {0,0};
        rc[0] = (number-1) / 3;
        rc[1] = (number-1) % 3;
        return (rc);
    }

    boolean checkResult( int player){
        boolean result = false;

        if (board[0][0] == player && board[0][1] == player && board[0][2] == player ) result =true;         //row1 check
        else if (board[1][0] == player && board[1][1] == player && board[1][2] == player )result =true;     //row2 check
        else if (board[2][0] == player && board[2][1] == player && board[2][2] == player )result =true;     //row3 check
        else if (board[0][0] == player && board[1][0] == player && board[2][0] == player )result =true;     //col1 check
        else if (board[0][1] == player && board[1][1] == player && board[2][1] == player )result =true;     //col2 check
        else if (board[0][2] == player && board[1][2] == player && board[2][2] == player )result =true;     //col3 check
        else if (board[0][0] == player && board[1][1] == player && board[2][2] == player )result =true;     //dig1 check
        else if (board[0][2] == player && board[1][1] == player && board[2][0] == player )result =true;     //dig2 check

        return(result);
    }

    boolean playboard(int position, int player){
        int rc[]= {0,0};
        rc = rowcol(position);
        if( board[rc[0]] [rc[1]] != 0){
            return false;
        }
        else{
            board[rc[0]] [rc[1]] = player;
            return true;
        }

    }

    public int inputboard(int player){
        Scanner input = new Scanner(System.in);
        int choice = -1;
        System.out.print("Player " + player + " (1-9):");
        do {
            choice = input.nextInt();
            if (choice < 0 || choice  > 9) {
                System.out.println("Invalid Choice: (1-9)/0 to exit)");
                System.out.print("Player " + player + " (1-9):");
            }
            else if (playboard(choice,0) == false){
                System.out.println("Square Occupied ");
                System.out.print("Player " + player + " (1-9):");
            }
            else
                return choice;
        }while(true);
    }

}
