package junit.moodanalyser;

public class InvalidMoodException extends Exception {

	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY;
	}

	ExceptionType type;

	public InvalidMoodException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}

}
