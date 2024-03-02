package com.riskyminions.gamephases;

import com.riskyminions.game.GameState;
import com.riskyminions.gui.GameController;
import com.riskyminions.main.User;
import com.riskyminions.objects.Continent;
import com.riskyminions.objects.Country;
import com.riskyminions.objects.Placement;
import com.riskyminions.objects.enums.GamePhase;
import java.util.ArrayList;
import java.util.List;

/**
 * Class to represent the PlaceTroopsPhase. The player can place his troops on his countries. The
 * amount of troops to place is calculated by the amount of countries the player owns and the amount
 * of continents the player owns.
 *
 * @author lkuech
 */
public class PlaceTroopsPhase extends Phase {

  private String player;
  private int newTroopsCount;
  private List<Country> countriesOwnedByPlayer;
  private GameState gameState;
  private ArrayList<Placement> placements;

  /**
   * Constructor of PlaceTroopsPhase.
   *
   * @param player player who plays the current PlaceTroopsPhase
   * @author floribau
   */
  public PlaceTroopsPhase(String player) {

    this.player = player;
    this.countriesOwnedByPlayer = User.getUser().getGameState().getCountriesOwnedByPlayer(player);
    this.gameState = User.getUser().getGameState();
    this.newTroopsCount = calculateTroops();
    this.newTroopsCount += gameState.getTroopsFromTradingCards();
    this.placements = new ArrayList<>();
    distributeTroops();
  }

  /**
   * Method to calculate the amount of troops to distribute (additionally to the troops gained in
   * card trade).
   *
   * @return newTroops - the count of new troops to distribute
   * @author floribau
   */
  public int calculateTroops() {

    int newTroops = gameState.getCountriesOwnedByPlayer(player).size() / 3;
    if (newTroops < 3) {
      newTroops = 3;
    }
    for (Continent continent :
        gameState.getContinentsOwnedByPlayer(
            player)) {
      switch (continent.getName()) {
        case "Africa" -> newTroops += 3;
        case "Asia" -> newTroops += 7;
        case "SouthAmerica", "Australia" -> newTroops += 2;
        case "Europe", "NorthAmerica" -> newTroops += 5;
        default -> {
          // ignore;
        }
      }
    }
    return newTroops;
  }

  /**
   * Method to distribute the troops. The player can choose the country to place the troops on. The
   * player can place the troops until he has no more troops to place.
   *
   * @author lkuech
   */
  public void distributeTroops() {
    GameController gui = User.getUser().getGameController();
    gui.setGamePhase(GamePhase.PLACE_TROOP_PHASE);

    gui.showAvailableTroopsMessage(newTroopsCount);

    gui.setSelectedCountry1(null);
    gui.setSelectedCountry2(null);

    while (this.newTroopsCount > 0) {
      Placement newPlacement = gui.placeTroopSelection(player, newTroopsCount);
      if (newPlacement.getTroopsPlaced() != 0) {
        placements.add(newPlacement);
        gui.increaseTroopText(newPlacement.getCountry(), newPlacement.getTroopsPlaced());
      }
      this.newTroopsCount -= newPlacement.getTroopsPlaced();
    }
  }

  /**
   * Method to get the placements list.
   *
   * @return placements - the list of placements
   * @author lkuech
   */
  public ArrayList<Placement> getPlacements() {
    return placements;
  }
}
