package com.riskyminions.network.messages;

import com.riskyminions.network.Message;
import com.riskyminions.network.MessageType;

/**
 * This class represents a message that indicates that the game has started.
 *
 * @author floribau
 */
public class StartGameMessage extends Message {

  /**
   * Constructor for the StartGameMessage.
   *
   * @author floribau
   */
  public StartGameMessage() {
    super(MessageType.START_GAME_MESSAGE);
  }
}
