package com.riskyminions.network.messages;


import com.riskyminions.network.Message;
import com.riskyminions.network.MessageType;


/**
 * This class is used to indicate the client to attack.
 *
 * @author lkuech
 */
public class AttackMoveRequest extends Message {

  /**
   * This is the constructor for the AttackMoveRequest class. It calls the constructor of the
   * Message class with the enum MessageType.ATTACK_MOVE_REQUEST.
   *
   * @author lkuech
   */
  public AttackMoveRequest() {
    super(MessageType.ATTACK_MOVE_REQUEST);
  }
}
