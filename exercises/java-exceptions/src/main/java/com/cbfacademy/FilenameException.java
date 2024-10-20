package com.cbfacademy;

// Custom checked exception class
public class FilenameException extends Exception {
    public FilenameException(String message) {
        super(message);
    }
}