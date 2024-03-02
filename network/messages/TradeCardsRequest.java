package com.riskyminions.network.messages;

import com.riskyminions.network.Message;
import com.riskyminions.network.MessageType;

/**
 * This class represents a message idicating that the player is now able to trade cards.
 *
 * @author floribau
 */
public class TradeCardsRequest extends Message {

  /**
   * Constructor for the TradeCardsRequest.
   *
   * @author floribau
   */
  public TradeCardsRequest() {
    super(MessageType.TRADE_CARDS_REQUEST);
  }
}
