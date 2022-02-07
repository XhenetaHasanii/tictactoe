import java.util.*;
import java.util.Scanner;

public class Game
{
    private Player playerOne;
    private Player playerTwo;
    private char [][] gameField;

    public Game(Player playerOne,Player playerTwo)
    {
            this.playerOne=playerOne;
            this.playerTwo=playerTwo;
            char [][] gameField=new char[3][3];
    }
    public void getUserInput ()
    {
        Scanner scanner=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter X or 0");
        //char symbol=sc.next().charAt(0);
        gameField[0][0]=sc.next().charAt(0);
        System.out.println(Arrays.deepToString(gameField));
        System.out.println("Please enter X or 0");
        gameField[0][1]=scanner.next().charAt(0);
        System.out.println(Arrays.deepToString(gameField)).replace("],","\n").replace(",","\t| ")
                .replaceAll("[\\[\\]]", " "));;

    }
  /**for(int j = 0; j < 3; j++) {
            if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                return board[0][j];
            }
        }

        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
        }
        if(board[2][0] == board[1][1] && board[1][1] ==  board[0][2] && board[2][0] != '-') {
            return board[2][0];
        }

        
        return ' ';

    } /** 
