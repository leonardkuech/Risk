package com.riskyminions.network.messages;

import com.riskyminions.network.Message;
import com.riskyminions.network.MessageType;

/**
 * This class is the message send to the server when the pressing continue after start.
 *
 * @author floribau
 */
public class PressedContinueAfterDetermineBeginnerMessage extends Message {

  /**
   * Default constructor of this class.
   *
   * @author floribau
   */
  public PressedContinueAfterDetermineBeginnerMessage() {
    super(MessageType.PRESSED_CONTINUE_AFTER_DETERMINE_BEGINNER_MESSAGE);
  }
}
