package junit.moodanalyser;

public class MoodAnalyser {

	String message;

	public MoodAnalyser() {
		super();
	}

	public String analyseMood(String message) {
		if (message.contains("happy")) {
			return "HAPPY";
		} else {
			return "SAD";
		}
	}
}
