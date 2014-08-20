package com.zipwhip.signals;

import java.io.Serializable;
import java.util.Set;

/**
 * Date: 8/22/13
 * Time: 5:20 PM
 *
 * @author Michael
 * @version 1
 */
public class SubscribeCompleteContent implements Serializable {

    private static final long serialVersionUID = -2443828032282657819L;

    private String subscriptionId;
    private Set<String> addresses;

    public SubscribeCompleteContent() {

    }

    public SubscribeCompleteContent(String subscriptionId, Set<String> addresses) {
        this.subscriptionId = subscriptionId;
        this.addresses = addresses;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }
}
