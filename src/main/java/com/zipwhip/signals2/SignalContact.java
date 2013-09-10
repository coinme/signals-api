package com.zipwhip.signals2;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Russ
 * Date: 9/10/13
 * Time: 3:26 PM
 */
public class SignalContact implements Serializable {

    private static final long serialVersionUID = 16143896926539627L;

    private String address;
    private String carrier;
    private String businessName;
    private Long deviceId;
    private Long targetGroupDevice;
    private String email;
    private String firstName;
    private String lastName;

    private Long version;
    private Long dateCreated;
    private Long lastUpdated;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Long getTargetGroupDevice() {
        return targetGroupDevice;
    }

    public void setTargetGroupDevice(Long targetGroupDevice) {
        this.targetGroupDevice = targetGroupDevice;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Long dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SignalContact contact = (SignalContact) o;

        if (address != null ? !address.equals(contact.address) : contact.address != null) return false;
        if (businessName != null ? !businessName.equals(contact.businessName) : contact.businessName != null)
            return false;
        if (carrier != null ? !carrier.equals(contact.carrier) : contact.carrier != null) return false;
        if (dateCreated != null ? !dateCreated.equals(contact.dateCreated) : contact.dateCreated != null) return false;
        if (deviceId != null ? !deviceId.equals(contact.deviceId) : contact.deviceId != null) return false;
        if (email != null ? !email.equals(contact.email) : contact.email != null) return false;
        if (firstName != null ? !firstName.equals(contact.firstName) : contact.firstName != null) return false;
        if (lastName != null ? !lastName.equals(contact.lastName) : contact.lastName != null) return false;
        if (lastUpdated != null ? !lastUpdated.equals(contact.lastUpdated) : contact.lastUpdated != null) return false;
        if (targetGroupDevice != null ? !targetGroupDevice.equals(contact.targetGroupDevice) : contact.targetGroupDevice != null)
            return false;
        if (version != null ? !version.equals(contact.version) : contact.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (carrier != null ? carrier.hashCode() : 0);
        result = 31 * result + (businessName != null ? businessName.hashCode() : 0);
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        result = 31 * result + (targetGroupDevice != null ? targetGroupDevice.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        return result;
    }
}
