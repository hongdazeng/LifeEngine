public class Story {
	int day;
	int month;
	int year;

	String placename;
	int weather;

	public Story() {
		this.day = 1;
		this.month = 1;
		this.year = 1500;

		this.placename = "Wolfenburg";
		this.weather = 0;
	}

	public String getDate() {
		String returndate = (day + " of " + getMonth() + "," + year);
		return returndate;
	}

	public String getPlace() {
		return this.placename;
	}

	public String getWeather() {
		switch (weather) {
		case 0: return "Sunny";
		case 1: return "Cloudy";
		case 2: return "Rainy";
		case 3: return "Stormy";
		case 4: return "Snowy";
		case 5: return "Windy";
		default: return "Error:No Weather";
		}
	}

	public int getWeatherCode() {
		return weather;
	}

	public String getMonth() {
		switch (month) {
		case 1: return "January";
		case 2: return "February";
		case 3: return "March";
		case 4: return "April";
		case 5: return "May";
		case 6: return "June";
		case 7: return "July";
		case 8: return "August";
		case 9: return "September";
		case 10: return "October";
		case 11: return "November";
		case 12: return "December";
		default: return "Error:No Month";
		}
	}

	public void setWeather(int ui) {
		weather = ui;
	}

	public int getMonthN() {
		return month;
	}

	public void newDay() {
		day++;
		if (day == 31) {
			day = 1;
			month++;
			if (month == 13) {
				month = 1;
				year++;
			}
		}
	}
}