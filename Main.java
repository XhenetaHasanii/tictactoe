import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Welcome to Tic Tac Toe Game");
    System.out.println("The symbols of the game are 'X' and 'O'");
    char playerOneSymbol = ' ';
    char playerTwoSymbol = ' ';
    ArrayList<Character> acceptableSymbols = new ArrayList<>();
    acceptableSymbols.add('X');
    acceptableSymbols.add('O');

    System.out.println("Player one, please enter your name: ");
    Scanner playerOneScanner = new Scanner(System.in);
    String playerOneName = playerOneScanner.nextLine();
    System.out.println("Player two, please enter your name: ");
    Scanner playerTwoScanner = new Scanner(System.in);
    String playerTwoName = playerTwoScanner.nextLine();

    while (acceptableSymbols.contains(playerOneSymbol) == false) {
      System.out.println("Player one, please enter your symbol: ");
      Scanner sc = new Scanner(System.in);
      playerOneSymbol = sc.nextLine().charAt(0);
    }
    while (acceptableSymbols.contains(playerTwoSymbol) == false) {
      System.out.println("Player two, please enter your symbol: ");
      Scanner sc = new Scanner(System.in);
      playerTwoSymbol = sc.nextLine().charAt(0);
    }

    Player playerOne = new Player(playerOneName, playerOneSymbol);
    Player playerTwo = new Player(playerTwoName, playerTwoSymbol);

    Game game = new Game(playerOne, playerTwo);
    while (game.isGameOver() != true) {
      game.getUserInput();
    }

  }
}
