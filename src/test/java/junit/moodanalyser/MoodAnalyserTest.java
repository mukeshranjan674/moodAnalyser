package junit.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void whenGiven_Improper_ShouldReturn_Sad() {
		MoodAnalyser mood = new MoodAnalyser();
		String result = mood.analyseMood("This is a sad message");
		Assert.assertEquals("SAD", result);
	}

	@Test
	public void whenGiven_Proper_ShouldReturn_Happy() {
		MoodAnalyser mood = new MoodAnalyser();
		String result = mood.analyseMood("This is a happy message");
		Assert.assertEquals("HAPPY", result);
	}
	@Test
	public void whenGiven_NULL_ShouldReturn_Happy() {
		MoodAnalyser mood = new MoodAnalyser();
		String result = mood.analyseMood(null);
		Assert.assertEquals("HAPPY", result);
	}
}
