package junit.moodanalyser;

public class MoodAnalyser {
	
	String message;
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
	public String analyseMood() {
			if(message.contains("happy")) {
				return "HAPPY";
			}
			else {
				return "SAD";
			}
	}
}
