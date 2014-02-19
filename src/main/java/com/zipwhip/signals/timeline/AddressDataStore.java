package com.zipwhip.signals.timeline;

import com.zipwhip.signals2.address.Address;
import com.zipwhip.signals2.timeline.TimelineEvent;

/**
 * Date: 8/20/13
 * Time: 2:21 PM
 *
 * @author Michael
 * @version 1
 */
public interface AddressDataStore<T extends TimelineEvent> {

    /**
     * Must be cluster locked (synchronized)
     *
     * @param address
     * @param event The new event
     * @return The head (the thing that is/was stored for this address)
     */
    T put(Address address, T event) throws Exception;

    /**
     *
     *
     * @param address
     * @return
     */
    T get(Address address) throws Exception;

}
