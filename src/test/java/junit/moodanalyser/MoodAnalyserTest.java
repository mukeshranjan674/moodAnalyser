package junit.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void whenGiven_Empty_ShouldThrow_CustomException() {
		MoodAnalyser mood = new MoodAnalyser("I am in Sad Mood");
		String result = mood.analyseMood();
		Assert.assertEquals("SAD", result);
	}

	@Test
	public void whenGiven_Proper_ShouldReturn_Sad() {
		MoodAnalyser mood = new MoodAnalyser("I am in Happy Mood");
		String result = mood.analyseMood();
		Assert.assertEquals("HAPPY", result);
	}
}
