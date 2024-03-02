package com.riskyminions.network.messages;

import com.riskyminions.network.Message;
import com.riskyminions.network.MessageType;
/**
 * This class represents a NextPhaseMessage. It is used to request the next phase.
 *
 * @author lkuech
 */
public class NextPhaseMessage extends Message {
  /** Constructs a new NextPhaseMessage. */
  public NextPhaseMessage() {
    super(MessageType.NEXT_PHASE_MESSAGE);
  }
}
