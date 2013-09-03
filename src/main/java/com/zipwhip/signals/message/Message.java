package com.zipwhip.signals.message;

import com.zipwhip.signals.address.Address;
import com.zipwhip.signals.timeline.TimelineEvent;

import java.io.Serializable;

/**
 * Date: 5/7/13
 * Time: 4:41 PM
 *
 * @author Michael
 * @version 1
 */
public interface Message extends TimelineEvent {

    /**
     * Indicates who this message is to be delivered to.
     *
     * @return
     */
    Address getAddress();

    /**
     * The content of the message.
     *
     * @return
     */
    Serializable getContent();

    /**
     * This timestamp is important for ordering. Without it, derivative data cannot be calculated.
     *
     * It should be the time of the signal creation, not the time of processing into mailbox.
     *
     * @return
     */
    long getTimestamp();

    /**
     * Used to dedupe signals. Messages with the same Id are candidates to dedupe. Business logic dictates how it
     * is deduped.
     *
     * @return
     */
    String getId();

    /**
     * Example: "zipwhip/message"
     *
     * @return
     */
    String getType();

    /**
     * Example: "delete", "read", "receive"
     *
     * @return
     */
    String getEvent();

}
