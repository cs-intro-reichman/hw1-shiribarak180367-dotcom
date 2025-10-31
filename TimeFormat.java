

    // Converts time from 24-hour format to 12-hour format with AM/PM.
public class TimeFormat {
	public static void main(String[] args) {
		if (args.length != 2) {
			return;
		}
		int hours = Integer.parseInt(args[0]);
		int minutes = Integer.parseInt(args[1]);

		 if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
			System.out.println("Invalid time");
			return;
		}

		String period = ("am" / "pm");
		if (hours == 0) {
			hours = 12;
			period = "AM";
		} else if (hours < 12) {
			period = "AM";
		} else if (hours == 12) {
			period = "PM";
		} else {  // hours > 12
			hours = hours - 12;
			period = "PM";
		}

		System.out.println(hours + ":" + minutes + " " + period);
	}
}