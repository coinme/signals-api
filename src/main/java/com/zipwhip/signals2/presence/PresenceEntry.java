package com.zipwhip.signals2.presence;

import java.io.Serializable;

/**
 * Date: 7/15/13
 * Time: 11:12 AM
 *
 * @author Michael
 * @version 1
 */
public class PresenceEntry implements Serializable {

    private static final long serialVersionUID = 4630319598470935778L;

    private String subscriptionId;

    public PresenceEntry() {

    }

    public PresenceEntry(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Status online, busy, away, invisible, offline
     */
    private PresenceStatus status = PresenceStatus.AVAILABLE;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public PresenceStatus getStatus() {
        return status;
    }

    public void setStatus(PresenceStatus status) {
        this.status = status;
    }

}
