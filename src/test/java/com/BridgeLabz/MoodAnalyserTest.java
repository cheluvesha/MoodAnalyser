package com.BridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenHappyShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is HAPPY message");
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessageWhenSadShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is SAD message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessageWhenReactSadShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm in SAD mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenImInAnyMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm in Any mood");
        Assert.assertEquals("HAPPY", mood);
    }
}
