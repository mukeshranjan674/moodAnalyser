package junit.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void whenGiven_Improper_ShouldReturn_Sad() {
		MoodAnalyser mood = new MoodAnalyser("this is a sad message");
		try {
			String result = mood.analyseMood();
			Assert.assertEquals("SAD", result);
		} catch (MoodAnalysisException e) {

		}
	}

	@Test
	public void whenGiven_Proper_ShouldReturn_Happy() {
		MoodAnalyser mood = new MoodAnalyser("This is a happy message");
		try {
			String result = mood.analyseMood();
			Assert.assertEquals("HAPPY", result);

		} catch (MoodAnalysisException e) {

		}
	}

	@Test
	public void whenGiven_NULL_ShouldThrow_CustomException() {
		MoodAnalyser mood = new MoodAnalyser(null);
		try {
			mood.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals("Invalid mood entered", e.getMessage());
		}

	}

	@Test
	public void whenGiven_Empty_ShouldThrow_CustomException() {
		MoodAnalyser mood = new MoodAnalyser("");
		try {
			mood.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals("Invalid mood entered", e.getMessage());
		}

	}
}
