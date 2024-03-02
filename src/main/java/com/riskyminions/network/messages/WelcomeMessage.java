package com.riskyminions.network.messages;

import com.riskyminions.network.Message;
import com.riskyminions.network.MessageType;

/**
 * This class represents a welcome message that is sent to the client when he connects to the
 * server.
 *
 * @author paukaise
 */
public class WelcomeMessage extends Message {

  /**
   * Constructor for the welcome message.
   *
   * @author paukaise
   */
  public WelcomeMessage() {
    super(MessageType.WELCOME_MESSAGE);
  }

}
