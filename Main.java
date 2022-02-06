import java.io.*;
import java.util.*;

 public class Main {

    public static void main(String[] args) {

            Player playerOne=new Player( "Xheni",'O' );
            Player playerTwo=new Player( "Tini",'X' );
            Game game= new Game(playerOne,playerTwo);
           // game.printGameFieldOnScreen();
            char[][] gameField=new char[3][3];
            Scanner scanner=new Scanner(System.in);
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter X or 0");
            //char symbol=sc.next().charAt(0);
            gameField[0][0]=sc.next().charAt(0);
            System.out.println(Arrays.deepToString(gameField).replace("],","\n").replace(",","\t| ")
                    .replaceAll("[\\[\\]]", " "));
            System.out.println("Please enter X or 0");
            gameField[0][1]=scanner.next().charAt(0);
            System.out.println(Arrays.deepToString(gameField).replace("],","\n").replace(",","\t| ")
                    .replaceAll("[\\[\\]]", " "));
            System.out.println("Please select the position you want to play");

    }
}
