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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DefaultMessage)) return false;

        DefaultMessage message = (DefaultMessage) o;

        if (timestamp != message.timestamp) return false;
        if (address != null ? !address.equals(message.address) : message.address != null) return false;
        if (content != null ? !content.equals(message.content) : message.content != null) return false;
        if (event != null ? !event.equals(message.event) : message.event != null) return false;
        if (id != null ? !id.equals(message.id) : message.id != null) return false;
        if (type != null ? !type.equals(message.type) : message.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (int) (timestamp ^ (timestamp >>> 32));
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (event != null ? event.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DefaultMessage");
        sb.append("{address=").append(address);
        sb.append(", content=").append(content);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", id='").append(id).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", event='").append(event).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
