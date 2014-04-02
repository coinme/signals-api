package com.zipwhip.signals2.presence;

import com.zipwhip.signals2.address.ClientAddress;
import com.zipwhip.signals2.timeline.TimelineEvent;

import java.util.Date;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * <p/>
 * User: Michael
 * <p/>
 * Date: 6/28/11
 * <p/>
 * Time: 2:43 PM
 */

public class Presence implements TimelineEvent {

    // we control the serialisation version
    private static final long serialVersionUID = 10375439476839415L;

    /**
     * The timestamp that this was established/saved
     */
    private long timestamp;

    /**
     * IP address of the client
     */
    private String ip;

    /**
     * A way to uniquely call you
     */
    private ClientAddress address;

    /**
     * Some user agent string like a browser, that tells all apps installed and versions of apps.
     */
    private UserAgent userAgent;

    /**
     * Connected
     */
    private Boolean connected;

    /**
     * Last active Date+Time
     */
    private Date lastActive;

    /**
     * All of the end-clients that are connected via this ClientAddress.
     *
     * This allows us to support multiple apps under the same clientAddress (connection to the signal server).
     */
    private Set<PresenceEntry> entries;

    /**
     * A way to add undefined key/value data.
     */
    private PresenceExtraInfo extraInfo;

    /**
     * For filtering results to a specific label
     */
    private String label;

    public Presence() {

    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ClientAddress getAddress() {
        return address;
    }

    public void setAddress(ClientAddress address) {
        this.address = address;
    }

    public UserAgent getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(UserAgent userAgent) {
        this.userAgent = userAgent;
    }

    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

    public Date getLastActive() {
        return lastActive;
    }

    public void setLastActive(Date lastActive) {
        this.lastActive = lastActive;
    }

    public Set<PresenceEntry> getEntries() {
        return entries;
    }

    public void setEntries(Set<PresenceEntry> entries) {
        this.entries = entries;
    }

    public PresenceExtraInfo getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(PresenceExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getLabel() { return label; }

    public void setLabel(String label) { this.label = label; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Presence)) return false;

        Presence presence = (Presence) o;

        if (timestamp != presence.timestamp) return false;
        if (address != null ? !address.equals(presence.address) : presence.address != null) return false;
        if (connected != null ? !connected.equals(presence.connected) : presence.connected != null) return false;
        if (extraInfo != null ? !extraInfo.equals(presence.extraInfo) : presence.extraInfo != null) return false;
        if (label != null ? !label.equals(presence.label) : presence.label != null) return false;
        if (ip != null ? !ip.equals(presence.ip) : presence.ip != null) return false;
        if (lastActive != null ? !lastActive.equals(presence.lastActive) : presence.lastActive != null) return false;
        if (userAgent != null ? !userAgent.equals(presence.userAgent) : presence.userAgent != null) return false;

        if (presence.entries != entries && (entries == null || presence.entries == null)) {
            return false;
        } else if (!(presence.entries.size() == entries.size() && presence.entries.containsAll(entries))) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = ip != null ? ip.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (userAgent != null ? userAgent.hashCode() : 0);
        result = 31 * result + (connected != null ? connected.hashCode() : 0);
        result = 31 * result + (lastActive != null ? lastActive.hashCode() : 0);
        result = 31 * result + (entries != null ? entries.hashCode() : 0);
        result = 31 * result + (extraInfo != null ? extraInfo.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Presence{");
        sb.append("timestamp=").append(timestamp);
        sb.append(", ip='").append(ip).append('\'');
        sb.append(", address=").append(address);
        sb.append(", userAgent=").append(userAgent);
        sb.append(", connected=").append(connected);
        sb.append(", lastActive=").append(lastActive);
        sb.append(", entries=").append(entries);
        sb.append(", extraInfo=").append(extraInfo);
        sb.append(", label=").append(label);
        sb.append('}');
        return sb.toString();
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}