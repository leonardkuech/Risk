package com.riskyminions.network.messages;

import com.riskyminions.network.Message;
import com.riskyminions.network.MessageType;
/**
 * This class represents a PlayerReadyMessage. It is used to inform the client that a player is
 * ready to start the game.
 *
 * @author lkuech
 */
public class PlayerReadyMessage extends Message {

  /**
   * Constructs a new PlayerReadyMessage.
   *
   * @author lkuech
   */
  public PlayerReadyMessage() {
    super(MessageType.PLAYER_READY_MESSAGE);
  }
}
