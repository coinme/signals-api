package com.zipwhip.signals.features;

import com.zipwhip.signals2.address.ClientAddress;
import com.zipwhip.signals2.timeline.TimelineEvent;

import java.io.Serializable;
import java.util.Set;

/**
 * Date: 6/19/13
 * Time: 3:17 PM
 *
 * This is sent from zipwhip-mvc to zipwhip-signals (router).
 *
 * @author Michael
 * @version 1
 */
public class SubscriptionRequest implements Serializable, TimelineEvent {

    private static final long serialVersionUID = 1194789208510678423L;

    /**
     * The subscriptionId is how we multiplex.
     */
    private String subscriptionId;

    private ClientAddress clientAddress;

    private long timestamp;

    /**
     * This is the list of ChannelAddress that they want to subscribe to. This will be the "channel" portion
     * of the ChannelAddress.
     *
     * This is plugged into the SubscriptionTopology.
     */
    private Set<String> channels;

    /**
     * This is of the form /presence/${deviceUuid}
     *
     * It's a special named channel because zipwhip-signals doesn't have access to zw_data. It's not able
     * to pull out the global presence channel.
     */
    private String presenceChannel;

    public SubscriptionRequest() {

    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public ClientAddress getClientAddress() {
        return clientAddress;
    }

    public Set<String> getChannels() {
        return channels;
    }

    public void setChannels(Set<String> channels) {
        this.channels = channels;
    }

    public String getPresenceChannel() {
        return presenceChannel;
    }

    public void setPresenceChannel(String presenceChannel) {
        this.presenceChannel = presenceChannel;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setClientAddress(ClientAddress clientAddress) {
        this.clientAddress = clientAddress;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
