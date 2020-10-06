package junit.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void whenGiven_Improper_ShouldReturn_Sad() {
		MoodAnalyser mood = new MoodAnalyser();
		String result = mood.analyseMood("I am in Sad Mood");
		Assert.assertEquals("SAD", result);
	}

	@Test
	public void whenGiven_Proper_ShouldReturn_Sad() {
		MoodAnalyser mood = new MoodAnalyser();
		String result = mood.analyseMood("This is a happy message");
		Assert.assertEquals("HAPPY", result);
	}
}
