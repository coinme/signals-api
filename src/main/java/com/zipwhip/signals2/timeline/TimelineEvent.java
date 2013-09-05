package com.zipwhip.signals2.timeline;

import java.io.Serializable;

/**
 * Date: 6/20/13
 * Time: 2:53 PM
 *
 * @author Michael
 * @version 1
 */
public interface TimelineEvent extends Serializable {

    long getTimestamp();

}
