package com.riskyminions.network.messages;

import com.riskyminions.network.Message;
import com.riskyminions.network.MessageType;
/**
 * Message class for the DistributionRequest.
 * @author lkuech
 */
public class DistributionRequest extends Message {

  /**
   * Constructor for the DistributionRequest class. It calls the constructor of the Message class with
   * the enum MessageType.DISTRIBUTION_REQUEST.
   * @author floribau
   */
  public DistributionRequest() {
    super(MessageType.DISTRIBUTION_REQUEST);
  }

}
