import java.util.ArrayList;
import java.util.List;

public class Game {
  private String[] suitArray = {"Spades", "Clubs", "Diamonds", "Hearts"};
  private String[] rankArray = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
  private ArrayList<String> mDeck = new ArrayList<String>();
  private ArrayList<String> mPlayerOneHand = new ArrayList<String>();
  private ArrayList<String> mPlayerTwoHand = new ArrayList<String>();
  private String mPlayerOne;
  private String mPlayerTwo;


  public Game(String playerOne, String playerTwo){
    mPlayerOneHand = returnPlayerOneDeck();
    // mPlayerTwoHand = ;
    mDeck = returnDeckArray();
    // mPlayerTwoHand

  }
  public ArrayList<String> getDeck(){
    return mDeck;
  }
  public ArrayList<String> getPlayerOneHand() {
    return mPlayerOneHand;
  }
  public ArrayList<String> getPlayerTwoHand() {
    return mPlayerTwoHand;
  }

  public String getPlayerOne() {
    return mPlayerOne;
  }

  public void takeCard() {
  String card = mDeck.remove(0);
    mPlayerOneHand.add(card);

  }
public ArrayList<String> returnPlayerOneDeck()  {
   ArrayList<String> x = new ArrayList<String>();
  return x;
}
public ArrayList<String> returnDeckArray()  {
  ArrayList<String> x = new ArrayList<String>();
  for(String suit : suitArray){
    for(String rank : rankArray){
      x.add(rank + " of " + suit);
    }
  }
  return x;
}


}
