package com.zipwhip.signals2.message;

import java.io.Serializable;
import java.util.Set;

/**
 * @author Michael
 * @date 2/11/14
 */
public class DisconnectCommand implements Serializable {

    // If specified, tells the client to connect to a specific host. (if unspecified, connect wherever you did before)
    private String host;
    // If specified, tells the client to connect to a specific port. (if unspecified, connect wherever you did before)
    private Integer port;
    // If specified, tells the client to wait X seconds to connect again. 0/null means no extra delay.
    private Integer delay;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }
}
