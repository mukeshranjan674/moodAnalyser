package junit.moodanalyser;

public class MoodAnalyser {

	private String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.contains("happy")) {
				return "HAPPY";
			} else {
				return "SAD";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("Invalid mood entered");
		}
	}
}
