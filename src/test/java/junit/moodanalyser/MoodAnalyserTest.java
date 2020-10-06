package junit.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void whenGiven_Improper_ShouldReturn_Sad() {
		MoodAnalyser mood = new MoodAnalyser("This is a sad message");
		String result = mood.analyseMood();
		Assert.assertEquals("SAD", result);
	}
	@Test
	public void whenGiven_Proper_ShouldReturn_Sad() {
		MoodAnalyser mood = new MoodAnalyser("This is a happy message");
		String result = mood.analyseMood();
		Assert.assertEquals("HAPPY", result);
	}
}
