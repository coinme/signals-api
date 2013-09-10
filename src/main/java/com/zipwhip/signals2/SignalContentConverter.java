package com.zipwhip.signals2;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 9/10/13
 * Time: 2:41 PM
 * <p/>
 * I don't like putting this logic centralized in a static utility class. However, for sake of expediency
 * of development, it's convenient to do this instead of muck around with adding zipwhip-common-util as a dependency
 * for signals-api.
 *
 * @author Michael
 * @version 1
 */
public class SignalContentConverter {

    public static final String ADDRESS = "address";
    public static final String BODY = "body";
    public static final String TRANSMISSION_STATE = "transmissionState";
    public static final String ADVERTISEMENT = "advertisement";
    public static final String FROM_NAME = "fromName";
    public static final String FINGERPRINT = "fingerprint";
    public static final String DEVICE_ID = "deviceId";
    public static final String CONTACT_ID = "contactId";
    public static final String CONTACT_DEVICE_ID = "contactDeviceId";
    public static final String MESSAGE_TYPE = "messageType";
    public static final String SCHEDULED_DATE = "scheduledDate";
    public static final String DATE_READ = "dateRead";
    public static final String ATTACHMENTS = "attachments";
    public static final String CARRIER = "carrier";
    public static final String BUSINESS_NAME = "businessName";
    public static final String TARGET_GROUP_DEVICE = "targetGroupDevice";
    public static final String EMAIL = "email";
    public static final String FIRST_NAME = "firstName";
    public static final String LAST_NAME = "lastName";
    public static final String LAST_UPDATED = "lastUpdated";
    public static final String DATE_CREATED = "dateCreated";
    public static final String VERSION = "version";

    public static SignalMessage fromSignalMessageMap(Map<String, Object> map) throws Exception {
        SignalMessage message = new SignalMessage();

        message.setAddress(getString(map, ADDRESS));
        message.setBody(getString(map, BODY));
        message.setTransmissionState(getString(map, TRANSMISSION_STATE));
        message.setAdvertisement(getString(map, ADVERTISEMENT));
        message.setFromName(getString(map, FROM_NAME));
        message.setFingerprint(getString(map, FINGERPRINT));
        message.setDeviceId(getLong(map, DEVICE_ID));
        message.setContactId(getLong(map, CONTACT_ID));
        message.setContactDeviceId(getLong(map, CONTACT_DEVICE_ID));
        message.setMessageType(getString(map, MESSAGE_TYPE));
        message.setScheduledDate(getLong(map, SCHEDULED_DATE));
        message.setDateRead(getLong(map, DATE_READ));
        message.setHasAttachments(getBoolean(map, ATTACHMENTS));
        message.setDateCreated(getLong(map, DATE_CREATED));

        return message;
    }

    public static SignalContact fromSignalContactMap(Map<String, Object> map) throws Exception {
        SignalContact contact = new SignalContact();

        contact.setAddress(getString(map, ADDRESS));
        contact.setBusinessName(getString(map, BUSINESS_NAME));
        contact.setCarrier(getString(map, CARRIER));
        contact.setDateCreated(getLong(map, DATE_CREATED));
        contact.setDeviceId(getLong(map, DEVICE_ID));
        contact.setEmail(getString(map, EMAIL));
        contact.setFirstName(getString(map, FIRST_NAME));
        contact.setLastName(getString(map, LAST_NAME));
        contact.setLastUpdated(getLong(map, LAST_UPDATED));
        contact.setTargetGroupDevice(getLong(map, TARGET_GROUP_DEVICE));
        contact.setVersion(getLong(map, VERSION));

        return contact;
    }

    /**
     * The zipwhip cloud doesn't want to specifically bind to the SignalMessage object. So it enqueues Maps to the signal server.
     * <p/>
     * This does cause a versioning problem on clients. We intent to solve the versioning problem via an IP address or versioning header on
     * initial connect. As far as converting between old payload and new payload, that is an unsolved issue.
     *
     * @param message
     * @return
     * @throws Exception
     */
    public static HashMap<String, Object> toMap(SignalMessage message) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();

        map.put(ADDRESS, message.getAddress());
        map.put(ADVERTISEMENT, message.getAdvertisement());
        map.put(ATTACHMENTS, message.isHasAttachments());
        map.put(BODY, message.getBody());
        map.put(CONTACT_DEVICE_ID, message.getContactDeviceId());
        map.put(CONTACT_ID, message.getContactId());
        map.put(DATE_READ, message.getDateRead());
        map.put(DEVICE_ID, message.getDeviceId());
        map.put(FINGERPRINT, message.getFingerprint());
        map.put(FROM_NAME, message.getFromName());
        map.put(MESSAGE_TYPE, message.getMessageType());
        map.put(SCHEDULED_DATE, message.getScheduledDate());
        map.put(DATE_CREATED, message.getDateCreated());
        map.put(TRANSMISSION_STATE, message.getTransmissionState());

        return map;
    }

    public HashMap<String, Object> toMap(SignalContact contact) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();

        map.put(ADDRESS, contact.getAddress());
        map.put(CARRIER, contact.getCarrier());
        map.put(BUSINESS_NAME, contact.getBusinessName());
        map.put(DEVICE_ID, contact.getDeviceId());
        map.put(TARGET_GROUP_DEVICE, contact.getTargetGroupDevice());
        map.put(EMAIL, contact.getEmail());
        map.put(FIRST_NAME, contact.getFirstName());
        map.put(LAST_NAME, contact.getLastName());

        map.put(LAST_UPDATED, contact.getLastUpdated());
        map.put(DATE_CREATED, contact.getDateCreated());
        map.put(VERSION, contact.getVersion());

        return map;
    }


    private static String getString(Map<String, Object> map, String key) {
        if (map.containsKey(key)) {
            return (String) map.get(key);
        }
        return null;
    }

    private static Long getLong(Map<String, Object> map, String key) {
        if (map.containsKey(key)) {
            return (Long) map.get(key);
        }
        return null;
    }

    private static Boolean getBoolean(Map<String, Object> map, String key) {
        if (map.containsKey(key)) {
            return (Boolean) map.get(key);
        }
        return false;
    }

}
