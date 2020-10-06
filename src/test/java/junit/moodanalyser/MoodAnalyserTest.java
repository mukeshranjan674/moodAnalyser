package junit.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	
	@Test
	public void whenGiven_Proper_ShouldReturn_Happy() {
		try {
			MoodAnalyser mood = new MoodAnalyser("I am in Happy Mood");
			String result = mood.analyseMood();
			Assert.assertEquals("HAPPY", result);
		}catch(InvalidMoodException e) {
			
		}
	}
	@Test
	public void whenGiven_Proper_ShouldReturn_Sad() {
		try {
			MoodAnalyser mood = new MoodAnalyser("I am in Sad Mood");
			String result = mood.analyseMood();
			Assert.assertEquals("SAD", result);
		}catch(InvalidMoodException e) {
			
		}
	}
	
	@Test
	public void whenGiven_Empty_ShouldThrow_CustomException() {
		try {
			MoodAnalyser mood = new MoodAnalyser("");
			mood.analyseMood();
		}catch(InvalidMoodException e) {
			Assert.assertEquals("Invalid Mood", e.getMessage());
		}
	}
	@Test
	public void whenGiven_Null_ShouldThrow_CustomException() {
		try {
			MoodAnalyser mood = new MoodAnalyser(null);
			mood.analyseMood();
		}catch(InvalidMoodException e) {
			Assert.assertEquals("Invalid Mood", e.getMessage());
		}
	}
}
