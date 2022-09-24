package sample;

public class MoodAnalyser {

	// method to analyse mood by reading string
	private String message;

	public MoodAnalyser() {
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// method to analyse mood by reading string
	public String analyseMood(String message) {
		if (message.toLowerCase().contains("any")) {
			return "HAPPY";
		} else if (message.toLowerCase().contains("sad")) {
			return "SAD";
		} else {
			return null;
		}
	}

	// main method
	public static void main(String[] args) {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am Happy");
		System.out.println(mood);
		mood = moodAnalyser.analyseMood("I am Sad");
		System.out.println(mood);
	}
}