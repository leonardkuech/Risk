package com.riskyminions.network.messages;

import com.riskyminions.network.Message;
import com.riskyminions.network.MessageType;

/**
 * This class is the GameStateReceivedMessage Type.
 *
 * @author floribau
 */
public class GameStateReceivedMessage extends Message {

  /**
   * This is the Constructor of the class.
   *
   * @author floribau
   */
  public GameStateReceivedMessage() {
    super(MessageType.GAME_STATE_RECEIVED_MESSAGE);
  }
}
