package com.riskyminions.network.messages;

import com.riskyminions.network.Message;
import com.riskyminions.network.MessageType;

/**
 * This class represents a NextPhaseRequest. It is used to request the next phase.
 *
 * @author lkuech
 */
public class NextPhaseRequest extends Message {

  /**
   * Constructs a new NextPhaseRequest.
   *
   * @author lkuech
   */
  public NextPhaseRequest() {
    super(MessageType.NEXT_PHASE_REQUEST);
  }
}
