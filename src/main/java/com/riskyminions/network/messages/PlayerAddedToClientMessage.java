package com.riskyminions.network.messages;

import com.riskyminions.network.Message;
import com.riskyminions.network.MessageType;
import com.riskyminions.objects.Player;
/**
 * This class represents a PlayerAddedToClientMessage. It is used to inform the client that a new
 * player has been added to the game.
 *
 * @author lkuech
 */
public class PlayerAddedToClientMessage extends Message {

  private final Player player;

  /**
   * Constructs a new PlayerAddedToClientMessage.
   *
   * @param player the player.
   * @author lkuech
   */
  public PlayerAddedToClientMessage(Player player) {
    super(MessageType.PLAYER_ADDED_TO_CLIENT_MESSAGE);
    this.player = player;
  }

  /**
   * Returns the player.
   *
   * @return the player.
   * @author lkuech
   */
  public Player getPlayer() {
    return this.player;
  }
}
