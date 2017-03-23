import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

  @Test
  public void Game_instantiatesCorrectly_true() {
    Game myGame = new Game("p1","p2");
    assertEquals(true, myGame instanceof Game);
  }
  @Test
  public void Deck_isEqualtoMDeck_true() {
    Game myGame = new Game("p1","p2");
    assertEquals(myGame.getDeck() , myGame.returnDeckArray());
  }

  @Test
  public void Test_doesDeckRemoveCard0() {
    Game myGame = new Game("p1","p2");
    myGame.takeCard();
  String expected = "ace of Spades";
  assertEquals(expected, myGame.getPlayerOneHand().get(0));
  }
  // @Test
  // public void deck_DoesDeckEqualDeckArray_true() {
  //   Game myGame = new Game();
  //   assertEquals(deck, myGame.returnDeckArray());
  // }
}
