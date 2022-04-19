import java.util.Scanner;

public class Game {

  private Player playerOne;
  private Player playerTwo;
  private char[][] gameField = new char[3][3];
  private boolean playerOneTurn;
  private boolean gameOver;

  private int playerWon;

  public Game(Player p_playerOne, Player p_playerTwo) {
    playerOne = p_playerOne;
    playerTwo = p_playerTwo;
    for (int i = 0; i < gameField.length; ++i) {
      for (int j = 0; j < gameField.length; ++j) {
        gameField[i][j] = ' ';
      }
    }
    playerOneTurn = true;
    gameOver = false;
    playerWon = 0;
  }

  public void printGameFieldOnScreen() {
    String splitLines = "_   _   _";
    String firstRow = gameField[0][0] + " | " + gameField[0][1] + " | " + gameField[0][2];
    System.out.println(firstRow);
    System.out.println(splitLines);
    String secondRow = gameField[1][0] + " | " + gameField[1][1] + " | " + gameField[1][2];
    System.out.println(secondRow);
    System.out.println(splitLines);
    String thirdRow = gameField[2][0] + " | " + gameField[2][1] + " | " + gameField[2][2];
    System.out.println(thirdRow);
    System.out.println(splitLines);
  }

  public void checkGameOver() {

    if (this.gameField[0][0] != ' ' && this.gameField[0][0] == this.gameField[0][1]
        && this.gameField[0][0] ==
        this.gameField[0][2] && this.gameField[0][0] == this.playerOne.getPlayerSign()) {
      this.playerWon = 1;
      gameOver = true;
    } else if (this.gameField[0][0] != ' ' && this.gameField[0][0] == this.gameField[0][1]
        && this.gameField[0][0] ==
        this.gameField[0][2] && this.gameField[0][0] == this.playerTwo.getPlayerSign()) {
      this.playerWon = 2;
      gameOver = true;
    } else if (this.gameField[0][0] != ' ' && this.gameField[0][0] == this.gameField[1][0]
        && this.gameField[0][0] ==
        this.gameField[2][0] && this.gameField[0][0] == this.playerOne.getPlayerSign()) {
      this.playerWon = 1;
      gameOver = true;
    } else if (this.gameField[0][0] != ' ' && this.gameField[0][0] == this.gameField[1][0]
        && this.gameField[0][0] ==
        this.gameField[2][0] && this.gameField[0][0] == this.playerTwo.getPlayerSign()) {
      this.playerWon = 2;
      gameOver = true;
    } else if (this.gameField[0][0] != ' ' && this.gameField[0][0] == this.gameField[1][1]
        && this.gameField[0][0] ==
        this.gameField[2][2] && this.gameField[0][0] == this.playerOne.getPlayerSign()) {
      this.playerWon = 1;
      gameOver = true;
    } else if (this.gameField[0][0] != ' ' && this.gameField[0][0] == this.gameField[1][1]
        && this.gameField[0][0] ==
        this.gameField[2][2] && this.gameField[0][0] == this.playerTwo.getPlayerSign()) {
      this.playerWon = 2;
      gameOver = true;
    } else if (this.gameField[0][1] != ' ' && this.gameField[0][1] == this.gameField[1][1]
        && this.gameField[0][1] ==
        this.gameField[2][1] && this.gameField[0][1] == this.playerOne.getPlayerSign()) {
      this.playerWon = 1;
      gameOver = true;
    } else if (this.gameField[0][1] != ' ' && this.gameField[0][1] == this.gameField[1][1]
        && this.gameField[0][1] ==
        this.gameField[2][1] && this.gameField[0][1] == this.playerTwo.getPlayerSign()) {
      this.playerWon = 2;
      gameOver = true;
    } else if (this.gameField[0][2] != ' ' && this.gameField[0][2] == this.gameField[1][2]
        && this.gameField[0][2] ==
        this.gameField[2][2] && this.gameField[0][2] == this.playerOne.getPlayerSign()) {
      this.playerWon = 1;
      gameOver = true;
    } else if (this.gameField[0][2] != ' ' && this.gameField[0][2] == this.gameField[1][2]
        && this.gameField[0][2] ==
        this.gameField[2][2] && this.gameField[0][2] == this.playerTwo.getPlayerSign()) {
      this.playerWon = 2;
      gameOver = true;
    } else if (this.gameField[1][0] != ' ' && this.gameField[1][0] == this.gameField[1][1]
        && this.gameField[1][0] ==
        this.gameField[1][2] && this.gameField[1][0] == this.playerOne.getPlayerSign()) {
      this.playerWon = 1;
      gameOver = true;
    } else if (this.gameField[1][0] != ' ' && this.gameField[1][0] == this.gameField[1][1]
        && this.gameField[1][0] ==
        this.gameField[1][2] && this.gameField[1][0] == this.playerTwo.getPlayerSign()) {
      this.playerWon = 2;
      gameOver = true;
    } else if (this.gameField[2][0] != ' ' && this.gameField[2][0] == this.gameField[2][1]
        && this.gameField[2][0] ==
        this.gameField[2][2] && this.gameField[2][0] == this.playerOne.getPlayerSign()) {
      this.playerWon = 1;
      gameOver = true;
    } else if (this.gameField[2][0] != ' ' && this.gameField[2][0] == this.gameField[2][1]
        && this.gameField[2][0] ==
        this.gameField[2][2] && this.gameField[2][0] == this.playerTwo.getPlayerSign()) {
      this.playerWon = 2;
      gameOver = true;
    }

    if (this.isFieldFull() == true && this.gameOver == false) {
      this.playerWon = 0;
      this.gameOver = true;
      System.out.println("Field is full and there is no winner. Play another game!");
    }

    if (this.playerWon == 0 && this.gameOver == false && this.isFieldFull() == false) {
      System.out.println("Game is not over yet");
    }

    if (this.gameOver == true && this.playerWon == 1) {
      System.out.println("Player one has won");
    }

    if (this.gameOver == true && this.playerWon == 2) {
      System.out.println("Player two has won");
    }

  }

  public void getUserInput() {
    int rowCoordinate = 0;
    int columnCoordinate = 0;

    if (playerOneTurn == true) {
      System.out.println(
          "Player one give in your position in form of 'x y' where x=row and y=column : ");
      Scanner playerOneInput = new Scanner(System.in);
      String userInput = playerOneInput.nextLine();
      if (userInput.charAt(0) != ' ' && userInput.charAt(2) != ' ') {
        rowCoordinate = Character.getNumericValue(userInput.charAt(0));
        columnCoordinate = Character.getNumericValue(userInput.charAt(2));
      }

      if (rowCoordinate >= 0 && rowCoordinate <= 2 && columnCoordinate >= 0
          && columnCoordinate <= 2) {
        this.gameField[rowCoordinate][columnCoordinate] = playerOne.getPlayerSign();
        this.playerOneTurn = false;
      }
    } else {

      System.out.println(
          "Player two give in your position in form of 'x y' where x=row and y=column : ");
      Scanner playerTwoInput = new Scanner(System.in);
      String userInput = playerTwoInput.nextLine();

      if (userInput.charAt(0) != ' ' && userInput.charAt(2) != ' ') {
        rowCoordinate = Character.getNumericValue(userInput.charAt(0));
        columnCoordinate = Character.getNumericValue(userInput.charAt(2));
      }

      if (rowCoordinate >= 0 && rowCoordinate <= 2 && columnCoordinate >= 0
          && columnCoordinate <= 2) {
        this.gameField[rowCoordinate][columnCoordinate] = playerTwo.getPlayerSign();
        this.playerOneTurn = true;
      }
    }

    this.printGameFieldOnScreen();
    this.checkGameOver();
  }

  public boolean isGameOver() {
    return gameOver;
  }

  public boolean isFieldFull() {
    boolean isFull = true;

    for (int i = 0; i < gameField.length; ++i) {
      for (int j = 0; j < gameField.length; ++j) {
        if (this.gameField[i][j] == ' ') {
          isFull = false;
          break;
        }
      }
    }
    return isFull;
  }
}
