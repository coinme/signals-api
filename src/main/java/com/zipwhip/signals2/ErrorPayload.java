package com.zipwhip.signals2;

/**
 * Date: 9/23/13
 * Time: 11:28 AM
 *
 * @author Michael
 * @version 1
 */
public class ErrorPayload {

    private final int code;
    private final String message;

    public ErrorPayload(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
