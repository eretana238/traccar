package org.traccar;

public class SendDataException extends RuntimeException{
    public SendDataException() {}

    public SendDataException(String message) {
        super(message);
    }
}
