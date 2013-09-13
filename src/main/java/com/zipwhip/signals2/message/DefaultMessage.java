package com.zipwhip.signals2.message;

import com.zipwhip.signals2.address.Address;

import java.io.Serializable;

/**
 * Date: 5/7/13
 * Time: 6:13 PM
 *
 * @author Michael
 * @version 1
 */
public class DefaultMessage implements Message {

    private static final long serialVersionUID = 8111225347753594028L;

    private Address address;
    private Serializable content;
    private long timestamp;
    private String id;
    private String type;
    private String event;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Serializable getContent() {
        return content;
    }

    public void setContent(Serializable content) {
        this.content = content;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
