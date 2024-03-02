package com.riskyminions.network.messages;

import com.riskyminions.network.Message;
import com.riskyminions.network.MessageType;
/**
 * This class represents a MoveTroopsRequest. It is used to request a move of troops from one
 * country to another.
 *
 * @author lkuech
 */
public class MoveTroopsRequest extends Message {

  /**
   * Constructs a new MoveTroopsRequest.
   *
   * @author lkuech
   */
  public MoveTroopsRequest() {
    super(MessageType.MOVE_TROOPS_REQUEST);
  }
}
