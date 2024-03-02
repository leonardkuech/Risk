package com.riskyminions.network.messages;

import com.riskyminions.network.Message;
import com.riskyminions.network.MessageType;

/**
 * Message class for the HeartBeatMessage.
 *
 * @author lkuech
 */
public class HeartBeatMessage extends Message {

  /**
   * Constructor for the HeartBeatMessage class.
   *
   * @author lkuech
   */
  public HeartBeatMessage() {
    super(MessageType.HEART_BEAT_MESSAGE);
  }
}
