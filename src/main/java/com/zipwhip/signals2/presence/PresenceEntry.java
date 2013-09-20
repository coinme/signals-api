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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PresenceEntry{");
        sb.append("subscriptionId='").append(subscriptionId).append('\'');
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PresenceEntry)) return false;

        PresenceEntry that = (PresenceEntry) o;

        if (status != that.status) return false;
        if (subscriptionId != null ? !subscriptionId.equals(that.subscriptionId) : that.subscriptionId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subscriptionId != null ? subscriptionId.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
