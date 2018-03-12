package ru.financemonitor.security.exception;

/**
 * Thrown when System User is not found.
 * Created by Polina Petrenko on 12.03.2018.
 */
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }
}
