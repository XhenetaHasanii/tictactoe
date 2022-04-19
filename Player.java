public class Player {

  private String playerName;
  private char playerSign;

  public Player(String p_playerName, char p_playerSign) {
    playerName = p_playerName;
    playerSign = p_playerSign;
  }

  public String getPlayerName() {
    return playerName;
  }

  public char getPlayerSign() {
    return playerSign;
  }
}
