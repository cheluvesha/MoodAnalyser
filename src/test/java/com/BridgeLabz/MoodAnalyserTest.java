package com.BridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenHappyShouldReturnHappy() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("This is HAPPY message");
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessageWhenSadShouldReturnSad() {

        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("This is SAD message");
            String mood = null;
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("SAD", mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenMessageWhenReactSadShouldReturnSad() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in SAD mood");
            String mood = null;
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("SAD", mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenImInAnyMoodShouldReturnHappy() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in Any mood");
            String mood = null;
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void givenNullWillReturnCustomException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("Please Enter Proper Message",e.getMessage());
        }
    }

    @Test
    public void givenEmptyMessageWillReturnCustomException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("");
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("Please Enter Proper Message", e.getMessage());
        }
    }
}
