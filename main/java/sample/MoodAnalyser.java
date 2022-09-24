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
		try {
			if (message.toLowerCase().contains("Any")) {
				return "HAPPY";
			} else if (message.toLowerCase().contains("Sad")) {
				return "SAD";
			} else if (message.contains(" ")) {
				return "Invalid mood";
			} else {
				return null;
			}
		} catch (NullPointerException e) {
			System.out.println("exception: Null Pointer Exception \n");
			e.printStackTrace();
			return "Invalid mood";
		}
	}

	public static void main(String[] args) {
		MoodAnalyser obj = new MoodAnalyser();
		System.out.println("Mood " + obj.analyseMood(null));
	}
}