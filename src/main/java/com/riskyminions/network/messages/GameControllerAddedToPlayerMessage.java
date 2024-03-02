package com.riskyminions.network.messages;

import com.riskyminions.network.Message;
import com.riskyminions.network.MessageType;

/**
 * Message class for the GameControllerAddedToPlayerMessage.
 * @author floribau
 */
public class GameControllerAddedToPlayerMessage extends Message {

  /**
   * Constructor for the GameControllerAddedToPlayerMessage.
   * @author floribau
   */
  public GameControllerAddedToPlayerMessage() {
    super(MessageType.GAME_CONTROLLER_ADDED_TO_PLAYER_MESSAGE);
  }
}
