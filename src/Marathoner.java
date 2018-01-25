
public class Marathoner {
	private double speed;
	private String name;
	private int bibNumber;
	static int lastNumberIssued = 0;
	private static String time = "9.00";
	private static String location = "San Diego";
	private static String date = "3/3/18";

	Marathoner(String name, double speed) {
		this.speed = speed;
		this.name = name;
		lastNumberIssued++;
		bibNumber = lastNumberIssued;

	}

	String getLocation() {
		return location;
	}

	String getTime() {
		return time;
	}

	String getDate() {
		return date;
	}

	int getBibNumber() {
		return bibNumber;

	}

	double getSpeed() {
		return speed;
	}

	String getName() {
		return name;

	}

	void setName(String name) {
		this.name = name;
	}

	void setSpeed(double speed) {
		this.speed = speed;
	}

	void setBibNumber(int bibNumber) {
		lastNumberIssued++;
		bibNumber = lastNumberIssued;
	}

	static void setDate(String date) {
		Marathoner.date = date;
	}

	static void setTime(String time) {
		Marathoner.time = time;
	}

	static void setLocation(String location) {
		Marathoner.location = location;
	}
}
