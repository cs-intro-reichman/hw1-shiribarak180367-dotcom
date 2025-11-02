

    // Converts time from 24-hour format to 12-hour format with AM/PM.
public class TimeFormat {
	public static void main(String[] args) {
		
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String ampm;
		int hours24;
		String minutesStr;

		if (hours == 0) 
		{
			hours24 = 0;
			ampm = "AM";
		} 
		else if (hours < 12) 
		{
			hours24 = hours;
			ampm = "AM";
		}
		 else if (hours == 12) 
		 {
			hours24=12; 
			ampm = "PM";
		} 
		else
		 {
			hours24 = hours - 12;
			ampm = "PM";
		 }
			if (minutes < 10) 
			{
				minutesStr = "0" + minutes;
			} 
			else 
			{
				minutesStr = String.valueOf(minutes);
			}

		System.out.println(hours24 + ":" + minutesStr + " " + ampm);

	}
}

