package com.zipwhip.signals2;

/**
 * Created by IntelliJ IDEA.
 * User: Russ
 * Date: 9/10/13
 * Time: 3:03 PM
 */
public class SignalMessage {

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
}
