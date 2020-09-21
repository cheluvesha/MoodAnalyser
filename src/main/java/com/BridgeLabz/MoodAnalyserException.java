package com.BridgeLabz;

public class MoodAnalyserException extends Exception {
    String message;
    public ExceptionType type;

    public MoodAnalyserException(String message) {
        this.message = message;
    }

    enum ExceptionType {
        ENTERED_NULL,ENTERED_EMPTY
    }

    public MoodAnalyserException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }


}