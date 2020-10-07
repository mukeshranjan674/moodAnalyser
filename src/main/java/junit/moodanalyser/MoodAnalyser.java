package junit.moodanalyser;

import junit.moodanalyser.InvalidMoodException.ExceptionType;

public class MoodAnalyser {

	private String message;

	public MoodAnalyser() {
		super();
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() throws InvalidMoodException {
		try {
			if (message.length() == 0)
				throw new InvalidMoodException(ExceptionType.ENTERED_EMPTY, "Invalid Mood");
			if (message.contains("Sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new InvalidMoodException(ExceptionType.ENTERED_NULL, "Invalid Mood");
		}
	}
}
