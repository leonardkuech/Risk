package com.riskyminions.network.messages;

import com.riskyminions.network.Message;
import com.riskyminions.network.MessageType;

/**
 * This class is the message send by the server to all connected clients when it shuts down.
 *
 * @author floribau
 */
public class ServerShutdownMessage extends Message {

  /**
   * The default constructor of this class.
   *
   * @author floribau
   */
  public ServerShutdownMessage() {
    super(MessageType.SERVER_SHUTDOWN_MESSAGE);
  }
}
