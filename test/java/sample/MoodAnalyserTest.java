package sample;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	MoodAnalyser moodAnalyser = new MoodAnalyser();

	@Test
	public void givenMessageIsProperShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String actualResult = moodAnalyser.analyseMood("I am Sad in Mood");
		Assert.assertEquals("SAD", actualResult);
	}

	@Test
	public void givenMessageIsProperAndContainAnyShouldReturnHappy() {
		String actualResult = moodAnalyser.analyseMood("I am in any Mood");
		Assert.assertEquals("HAPPY", actualResult);
	}

}
