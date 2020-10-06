package junit.moodanalyser;

public class MoodAnalyser {

	String message;

	public MoodAnalyser() {
		super();
	}

	public String analyseMood(String message) {
		try {
			if (message.contains("happy")) {
				return "HAPPY";
			} else {
				return "SAD";
			}
		} catch (Exception e) {
			return "HAPPY";
		}
	}
}
