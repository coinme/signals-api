package com.zipwhip.signals2;

/**
 * Created by IntelliJ IDEA.
 * User: Russ
 * Date: 4/10/2014
 * Time: 4:37 PM
 */
public class SignalServerEvent {

    private final int code;
    private final String message;

    public SignalServerEvent(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SignalServerEvent{");
        sb.append("code=").append(code);
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
