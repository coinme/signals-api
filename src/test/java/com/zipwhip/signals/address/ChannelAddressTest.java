package com.zipwhip.signals.address;

import com.zipwhip.signals2.address.ChannelAddress;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: Russ
 * Date: 9/3/13
 * Time: 12:43 PM
 */
public class ChannelAddressTest {

    private String channel1;
    private ChannelAddress address1;

    private String channel2;
    private ChannelAddress address2;

    @Before
    public void setUp() throws Exception {
        channel1 = UUID.randomUUID().toString();
        channel2 = UUID.randomUUID().toString();

        address1 = new ChannelAddress(channel1);
        address2 = new ChannelAddress(channel2);
    }

    @Test
    public void testEquals() throws Exception {
        assertEquals("Addresses weren't equal!", address1, address1);
        assertTrue("Addresses weren't supposed to be equal!", !address1.equals(address2));
    }
}
