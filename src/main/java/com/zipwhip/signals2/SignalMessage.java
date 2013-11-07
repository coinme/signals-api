package com.zipwhip.signals2;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Russ
 * Date: 9/10/13
 * Time: 3:03 PM
 */
public class SignalMessage implements Serializable {

    private static final long serialVersionUID = -5631019663174617721L;

    private String address;
    private String body;
    private String transmissionState;
    private String advertisement;
    private String fromName;
    private String fingerprint;
    private Long deviceId;
    private Long contactId;
    private Long contactDeviceId;
    private String messageType;
    private Long scheduledDate;
    private Long dateRead;
    private Long dateCreated;
    private boolean hasAttachments;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTransmissionState() {
        return transmissionState;
    }

    public void setTransmissionState(String transmissionState) {
        this.transmissionState = transmissionState;
    }

    public String getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(String advertisement) {
        this.advertisement = advertisement;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Long getContactDeviceId() {
        return contactDeviceId;
    }

    public void setContactDeviceId(Long contactDeviceId) {
        this.contactDeviceId = contactDeviceId;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public Long getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(Long scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public Long getDateRead() {
        return dateRead;
    }

    public void setDateRead(Long dateRead) {
        this.dateRead = dateRead;
    }

    public Long getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Long dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isHasAttachments() {
        return hasAttachments;
    }

    public void setHasAttachments(boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SignalMessage that = (SignalMessage) o;

        if (hasAttachments != that.hasAttachments) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (advertisement != null ? !advertisement.equals(that.advertisement) : that.advertisement != null)
            return false;
        if (body != null ? !body.equals(that.body) : that.body != null) return false;
        if (contactDeviceId != null ? !contactDeviceId.equals(that.contactDeviceId) : that.contactDeviceId != null)
            return false;
        if (contactId != null ? !contactId.equals(that.contactId) : that.contactId != null) return false;
        if (dateCreated != null ? !dateCreated.equals(that.dateCreated) : that.dateCreated != null) return false;
        if (dateRead != null ? !dateRead.equals(that.dateRead) : that.dateRead != null) return false;
        if (deviceId != null ? !deviceId.equals(that.deviceId) : that.deviceId != null) return false;
        if (fingerprint != null ? !fingerprint.equals(that.fingerprint) : that.fingerprint != null) return false;
        if (fromName != null ? !fromName.equals(that.fromName) : that.fromName != null) return false;
        if (messageType != null ? !messageType.equals(that.messageType) : that.messageType != null) return false;
        if (scheduledDate != null ? !scheduledDate.equals(that.scheduledDate) : that.scheduledDate != null)
            return false;
        if (transmissionState != null ? !transmissionState.equals(that.transmissionState) : that.transmissionState != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (transmissionState != null ? transmissionState.hashCode() : 0);
        result = 31 * result + (advertisement != null ? advertisement.hashCode() : 0);
        result = 31 * result + (fromName != null ? fromName.hashCode() : 0);
        result = 31 * result + (fingerprint != null ? fingerprint.hashCode() : 0);
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        result = 31 * result + (contactId != null ? contactId.hashCode() : 0);
        result = 31 * result + (contactDeviceId != null ? contactDeviceId.hashCode() : 0);
        result = 31 * result + (messageType != null ? messageType.hashCode() : 0);
        result = 31 * result + (scheduledDate != null ? scheduledDate.hashCode() : 0);
        result = 31 * result + (dateRead != null ? dateRead.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (hasAttachments ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SignalMessage");
        sb.append("{address='").append(address).append('\'');
        sb.append(", body='").append(body).append('\'');
        sb.append(", transmissionState='").append(transmissionState).append('\'');
        sb.append(", advertisement='").append(advertisement).append('\'');
        sb.append(", fromName='").append(fromName).append('\'');
        sb.append(", fingerprint='").append(fingerprint).append('\'');
        sb.append(", deviceId=").append(deviceId);
        sb.append(", contactId=").append(contactId);
        sb.append(", contactDeviceId=").append(contactDeviceId);
        sb.append(", messageType='").append(messageType).append('\'');
        sb.append(", scheduledDate=").append(scheduledDate);
        sb.append(", dateRead=").append(dateRead);
        sb.append(", dateCreated=").append(dateCreated);
        sb.append(", hasAttachments=").append(hasAttachments);
        sb.append('}');
        return sb.toString();
    }
}
