package com.riskyminions.gamephases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.riskyminions.game.GameState;
import com.riskyminions.gui.GameController;
import com.riskyminions.main.User;
import com.riskyminions.objects.Attack;
import com.riskyminions.objects.Player;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests the features of AttackMove class.
 *
 * @author floribau
 */
class AttackMoveTest {

  private GameState testGameState;
  private String playerOneKey;
  private String playerTwoKey;
  private GameController mockGameController;

  /**
   * Sets up the variables necessary for each test.
   *
   * @author floribau
   */
  @BeforeEach
  void initTest() {
    User user = User.getUser();
    mockGameController = mock(GameController.class);
    try {
      user.addGameController(mockGameController);
    } catch (NullPointerException e) {
      // ignore server-client communication
    }

    ArrayList<Player> players = new ArrayList<>();
    for (int i = 0; i < 2; i++) {
      players.add(new Player("testPlayer" + (i + 1), User.generateKey(), false));
    }
    playerOneKey = players.get(0).getUserKey();
    playerTwoKey = players.get(1).getUserKey();
    testGameState = new GameState(playerOneKey, players);
    testGameState.updateCountryOwner(testGameState.getCountries().get(0), playerOneKey, 5);
    testGameState.updateCountryOwner(testGameState.getCountries().get(1), playerTwoKey, 2);

    user.setGameState(testGameState);
  }

  /**
   * tests the functionality of the attackMove() method and all called methods.
   *
   * @author floribau
   */
  @Test
  void testAttackMove() {
    Attack mockAttack = new Attack();
    mockAttack.setAttackingCountry(testGameState.getCountries().get(0));
    mockAttack.setDefendingCountry(testGameState.getCountries().get(1));
    mockAttack.setTroopsUsed(mockAttack.getAttackingCountry().getTroops() - 1);
    mockAttack.setAttackValid(true);
    when(mockGameController.attackSelection(playerOneKey)).thenReturn(mockAttack);

    AttackMove testAttackMove = new AttackMove(playerOneKey);

    assertEquals(testGameState.getCountries().get(0), testAttackMove.getAttackingCountry());
    assertEquals(testGameState.getCountries().get(1), testAttackMove.getDefendingCountry());
    assertEquals(playerOneKey, testAttackMove.getAttackingPlayer());
    assertEquals(playerTwoKey, testAttackMove.getDefendingPlayer());
  }
}