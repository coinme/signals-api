package com.zipwhip.signals2;

/**
 * Date: 9/23/13
 * Time: 11:45 AM
 *
 * @author Michael
 * @version 1
 */
public class SignalServerException extends Exception {

    private static final long serialVersionUID = 82742604956295130L;

    private final int code;

    public SignalServerException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
