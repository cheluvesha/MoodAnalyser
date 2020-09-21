package com.BridgeLabz;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.contains("HAPPY")) {
            return "HAPPY";
        }
        else {
            return "SAD";
        }
    }
}
