package com.BridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenHappyShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is HAPPY message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessageWhenSadShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is SAD message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessageWhenReactSadShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in SAD mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenImInAnyMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in Any mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenNullWillReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
