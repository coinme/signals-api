package com.zipwhip.signals2;

import com.zipwhip.signals2.address.ChannelAddress;
import com.zipwhip.signals2.presence.Presence;

import java.util.Collection;

/**
 * @author Michael
 * @date 2/18/14
 */
public interface PresenceService {

    Collection<Presence> list(ChannelAddress globalPresenceChannel);
    
}
