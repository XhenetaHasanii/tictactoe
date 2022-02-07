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
  for(int j = 0; j < 3; j++) {
            if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                return board[0][j];
            }
        }

        //Check the diagonals
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
        }
        if(board[2][0] == board[1][1] && board[1][1] ==  board[0][2] && board[2][0] != '-') {
            return board[2][0];
        }

        //Otherwise nobody has not won yet
        return ' ';

    }
