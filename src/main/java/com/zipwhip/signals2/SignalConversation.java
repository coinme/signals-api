package com.zipwhip.signals2;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Russ
 * Date: 9/10/13
 * Time: 4:58 PM
 */
public class SignalConversation implements Serializable {

    private static final long serialVersionUID = 3852682394458321048L;

    private String address;
    private String bcc;
    private String deviceAddress;
    private Long deviceId;
    private String cc;
    private String fingerprint;
    private Long lastContactDeviceId;
    private String lastContactAddress;
    private String lastContactFirstName;
    private String lastContactLastName;
    private Long lastMessageDate;
    private String lastMessageBody;
    private Long lastNonDeletedMessageDate;
    private Integer unreadCount;
    private Long version;
    private Long lastUpdated;
    private Long dateCreated;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    public String getDeviceAddress() {
        return deviceAddress;
    }

    public void setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public Long getLastContactDeviceId() {
        return lastContactDeviceId;
    }

    public void setLastContactDeviceId(Long lastContactDeviceId) {
        this.lastContactDeviceId = lastContactDeviceId;
    }

    public String getLastContactAddress() {
        return lastContactAddress;
    }

    public void setLastContactAddress(String lastContactAddress) {
        this.lastContactAddress = lastContactAddress;
    }

    public String getLastContactFirstName() {
        return lastContactFirstName;
    }

    public void setLastContactFirstName(String lastContactFirstName) {
        this.lastContactFirstName = lastContactFirstName;
    }

    public String getLastContactLastName() {
        return lastContactLastName;
    }

    public void setLastContactLastName(String lastContactLastName) {
        this.lastContactLastName = lastContactLastName;
    }

    public Long getLastMessageDate() {
        return lastMessageDate;
    }

    public void setLastMessageDate(Long lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }

    public String getLastMessageBody() {
        return lastMessageBody;
    }

    public void setLastMessageBody(String lastMessageBody) {
        this.lastMessageBody = lastMessageBody;
    }

    public Long getLastNonDeletedMessageDate() {
        return lastNonDeletedMessageDate;
    }

    public void setLastNonDeletedMessageDate(Long lastNonDeletedMessageDate) {
        this.lastNonDeletedMessageDate = lastNonDeletedMessageDate;
    }

    public Integer getUnreadCount() {
        return unreadCount;
    }

    public void setUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Long getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Long dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SignalConversation that = (SignalConversation) o;

        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (bcc != null ? !bcc.equals(that.bcc) : that.bcc != null) return false;
        if (cc != null ? !cc.equals(that.cc) : that.cc != null) return false;
        if (dateCreated != null ? !dateCreated.equals(that.dateCreated) : that.dateCreated != null) return false;
        if (deviceAddress != null ? !deviceAddress.equals(that.deviceAddress) : that.deviceAddress != null)
            return false;
        if (deviceId != null ? !deviceId.equals(that.deviceId) : that.deviceId != null) return false;
        if (fingerprint != null ? !fingerprint.equals(that.fingerprint) : that.fingerprint != null) return false;
        if (lastContactDeviceId != null ? !lastContactDeviceId.equals(that.lastContactDeviceId) : that.lastContactDeviceId != null)
            return false;
        if (lastContactFirstName != null ? !lastContactFirstName.equals(that.lastContactFirstName) : that.lastContactFirstName != null)
            return false;
        if (lastContactLastName != null ? !lastContactLastName.equals(that.lastContactLastName) : that.lastContactLastName != null)
            return false;
        if (lastContactAddress != null ? !lastContactAddress.equals(that.lastContactAddress) : that.lastContactAddress != null)
            return false;
        if (lastMessageBody != null ? !lastMessageBody.equals(that.lastMessageBody) : that.lastMessageBody != null)
            return false;
        if (lastMessageDate != null ? !lastMessageDate.equals(that.lastMessageDate) : that.lastMessageDate != null)
            return false;
        if (lastNonDeletedMessageDate != null ? !lastNonDeletedMessageDate.equals(that.lastNonDeletedMessageDate) : that.lastNonDeletedMessageDate != null)
            return false;
        if (lastUpdated != null ? !lastUpdated.equals(that.lastUpdated) : that.lastUpdated != null) return false;
        if (unreadCount != null ? !unreadCount.equals(that.unreadCount) : that.unreadCount != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (bcc != null ? bcc.hashCode() : 0);
        result = 31 * result + (deviceAddress != null ? deviceAddress.hashCode() : 0);
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        result = 31 * result + (cc != null ? cc.hashCode() : 0);
        result = 31 * result + (fingerprint != null ? fingerprint.hashCode() : 0);
        result = 31 * result + (lastContactDeviceId != null ? lastContactDeviceId.hashCode() : 0);
        result = 31 * result + (lastContactAddress != null ? lastContactAddress.hashCode() : 0);
        result = 31 * result + (lastContactFirstName != null ? lastContactFirstName.hashCode() : 0);
        result = 31 * result + (lastContactLastName != null ? lastContactLastName.hashCode() : 0);
        result = 31 * result + (lastMessageDate != null ? lastMessageDate.hashCode() : 0);
        result = 31 * result + (lastMessageBody != null ? lastMessageBody.hashCode() : 0);
        result = 31 * result + (lastNonDeletedMessageDate != null ? lastNonDeletedMessageDate.hashCode() : 0);
        result = 31 * result + (unreadCount != null ? unreadCount.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SignalConversation");
        sb.append("{address='").append(address).append('\'');
        sb.append(", bcc='").append(bcc).append('\'');
        sb.append(", deviceAddress='").append(deviceAddress).append('\'');
        sb.append(", deviceId=").append(deviceId);
        sb.append(", cc='").append(cc).append('\'');
        sb.append(", fingerprint='").append(fingerprint).append('\'');
        sb.append(", lastContactDeviceId=").append(lastContactDeviceId);
        sb.append(", lastContactAddress='").append(lastContactAddress).append('\'');
        sb.append(", lastContactFirstName='").append(lastContactFirstName).append('\'');
        sb.append(", lastContactLastName='").append(lastContactLastName).append('\'');
        sb.append(", lastMessageDate=").append(lastMessageDate);
        sb.append(", lastMessageBody='").append(lastMessageBody).append('\'');
        sb.append(", lastNonDeletedMessageDate=").append(lastNonDeletedMessageDate);
        sb.append(", unreadCount=").append(unreadCount);
        sb.append(", version=").append(version);
        sb.append(", lastUpdated=").append(lastUpdated);
        sb.append(", dateCreated=").append(dateCreated);
        sb.append('}');
        return sb.toString();
    }
}
