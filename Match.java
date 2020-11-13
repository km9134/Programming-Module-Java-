/**
 * 
 */
package wc;

/**
 * @author kylemoffett
 *
 */
public class Match {

	// instance vars
	private int year;
	private String host;
	private String stage;
	private String stadium;
	private String city;
	private int attendance;
	private String homeName;
	private int homeGoals;
	private int awayGoals;
	private String awayName;
	private String winCondition;
	private int htHomeGoals;
	private int htAwayGoals;
	private String homeInitials;
	private String awayInitials;

	// constructors
	/**
	 * @param year
	 * @param host
	 * @param stage
	 * @param stadium
	 * @param city
	 * @param attendance
	 * @param homeName
	 * @param homeGoals
	 * @param awayGoals
	 * @param awayName
	 * @param winCondition
	 * @param htHomeGoals
	 * @param htAwayGoals
	 * @param homeInitials
	 * @param awayInitials
	 */
	public Match() {

	}

	// methods
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) throws IllegalArgumentException {
		if (year >= 1930) {
			this.year = year;
		} else {
			throw new IllegalArgumentException("Please enter a year from 1930 onwards");

		}
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host the host to set
	 */
	public void setHost(String host) throws IllegalArgumentException {

		char[] ch = host.toCharArray();
		int letter = 0;

		// count the number of letters in a character array
		for (int i = 0; i < host.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			}

		}
		// if count of letters is >=1 and <30 setHost else print error to screen
		if (letter >= 1 & letter < 30) {
			this.host = host;
		} else {
			throw new IllegalArgumentException("Host name should be between 1 and 30 characters");

		}
	}

	/**
	 * @return the stage
	 */
	public String getStage() {
		return stage;
	}

	/**
	 * @param stage the stage to set
	 */
	public void setStage(String stage) throws IllegalArgumentException {

		char[] ch = stage.toCharArray();
		int letter = 0;

		// count the number of letters in a character array
		for (int i = 0; i < stage.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			}

		}
		// if count of letters is >=1 and <50 setHost else print error to screen
		if (letter >= 1 & letter < 50) {
			this.stage = stage;
		} else {
			throw new IllegalArgumentException("Stage name should be between 1 and 50 characters");
		}
	}

	/**
	 * @return the stadium
	 */
	public String getStadium() {
		return stadium;
	}

	/**
	 * @param stadium the stadium to set
	 */
	public void setStadium(String stadium) throws IllegalArgumentException {

		char[] ch = stadium.toCharArray();
		int letter = 0;

		// count the number of letters in a character array
		for (int i = 0; i < stadium.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			}

		}
		// if count of letters is >=1 and <30 setHost else print error to screen
		if (letter >= 1 & letter < 80) {
			this.stadium = stadium;
		} else {
			throw new IllegalArgumentException("Stadium name should be between 1 and 80 characters");
		}
	}

	/**
	 * 
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 
	 * @param city the city to set
	 */
	public void setCity(String city) throws IllegalArgumentException {
		char[] ch = city.toCharArray();
		int letter = 0;

		// count the number of letters in a character array
		for (int i = 0; i < city.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			}

		}
		// if count of letters is >=1 and <30 setCity else print error to screen
		if (letter >= 1 & letter < 40) {
			this.city = city;

		} else {
			throw new IllegalArgumentException("City name should be between 1 and 40 characters");

		}
	}

	/**
	 * @return the attendance
	 */
	public int getAttendance() throws IllegalArgumentException {
		return attendance;
	}

	/**
	 * @param attendance the attendance to set
	 */
	public void setAttendance(int attendance) {
		if (attendance >= 0 & attendance <= 200000) {
			this.attendance = attendance;
		} else {
			throw new IllegalArgumentException("Attendance can't be less than zero or greater than 200k");
		}
	}

	/**
	 * @return the homeName
	 */
	public String getHomeName() {
		return homeName;
	}

	/**
	 * @param homeName the homeName to set
	 */
	public void setHomeName(String homeName) throws IllegalArgumentException {
		char[] ch = homeName.toCharArray();
		int letter = 0;

		// count the number of letters in a character array
		for (int i = 0; i < homeName.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			}

		}
		// if count of letters is >=1 and <35 setCity else print error to screen
		if (letter >= 1 & letter < 35) {
			this.homeName = homeName;

		} else {
			throw new IllegalArgumentException("Home team name should be between 1 and 35 characters");

		}
	}

	/**
	 * @return the homeGoals
	 */
	public int getHomeGoals() {
		return homeGoals;
	}

	/**
	 * @param homeGoals the homeGoals to set
	 */
	public void setHomeGoals(int homeGoals) throws IllegalArgumentException {
		if (homeGoals >= 0 & homeGoals <= 15) {
			this.homeGoals = homeGoals;
		} else {

			throw new IllegalArgumentException("Home goals can't be less than zero or greater than 15");

		}
	}

	/**
	 * @return the awayGoals
	 */
	public int getAwayGoals() {
		return awayGoals;
	}

	/**
	 * @param awayGoals the awayGoals to set
	 */
	public void setAwayGoals(int awayGoals) throws IllegalArgumentException {
		if (awayGoals >= 0 & awayGoals <= 15) {
			this.awayGoals = awayGoals;
		} else {

			throw new IllegalArgumentException("Away goals can't be less than zero or greater than 15");

		}
	}

	/**
	 * @return the awayName
	 */
	public String getAwayName() {
		return awayName;
	}

	/**
	 * @param awayName the awayName to set
	 */
	public void setAwayName(String awayName) throws IllegalArgumentException {
		// set up char array to store awayName
		char[] ch = awayName.toCharArray();
		int letter = 0;

		// count the number of letters in a character array
		for (int i = 0; i < awayName.length(); i++) {
			// check if value held in char array is a char, if so append letter
			if (Character.isLetter(ch[i])) {
				letter++;
			}

		}
		// if count of letters is >=1 and <35 setCity else print error to screen
		if (letter >= 1 & letter < 35) {
			this.awayName = awayName;

		} else {
			throw new IllegalArgumentException("Away team name should be between 1 and 35 characters");
		}

	}

	/**
	 * @return the winCondition
	 */
	public String getWinCondition() {
		return winCondition;
	}

	/**
	 * @param winCondition the winCondition to set
	 */
	public void setWinCondition(String winCondition) throws IllegalArgumentException {
		if(winCondition.equals(" ") || winCondition.equals("ET") || winCondition.equals("AWP") || winCondition.equals("HWP")) {
		this.winCondition = winCondition;
	
	}else {
		throw new IllegalArgumentException("Win condition can only be blank, ET, AWP or HWP");
	}
	}

	/**
	 * @return the htHomeGoals
	 */
	public int getHtHomeGoals() {
		return htHomeGoals;
	}

	/**
	 * @param htHomeGoals the htHomeGoals to set
	 */
	public void setHtHomeGoals(int htHomeGoals) throws IllegalArgumentException {
		if (htHomeGoals >= 0 & htHomeGoals <= 15) {
			this.htHomeGoals = htHomeGoals;
		} else {
			throw new IllegalArgumentException("Half time home goals can't be less than zero or greater than 15");

		}
	}

	/**
	 * @return the htAwayGoals
	 */
	public int getHtAwayGoals() {
		return htAwayGoals;
	}

	/**
	 * @param htAwayGoals the htAwayGoals to set
	 */
	public void setHtAwayGoals(int htAwayGoals) throws IllegalArgumentException {
		if (htAwayGoals >= 0 & htAwayGoals <= 15) {
			this.htAwayGoals = htAwayGoals;
		} else {
			throw new IllegalArgumentException("Half time away goals can't be less than zero or greater than 15");
		}
	}

	/**
	 * @return the homeInitials
	 */
	public String getHomeInitials() {
		return homeInitials;
	}

	/**
	 * @param homeInitials the homeInitials to set
	 */
	public void setHomeInitials(String homeInitials) throws IllegalArgumentException {
		char[] ch = homeInitials.toCharArray();
		int letter = 0;

		// count the number of letters in a character array
		for (int i = 0; i < homeInitials.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			}

		}
		// if count of letters is >=1 and <35 setCity else print error to screen
		if (letter == 3) {
			this.homeInitials = homeInitials;

		} else {
			throw new IllegalArgumentException("Home initials should be three letters");
		}

	}

	/**
	 * @return the awayInitials
	 */
	public String getAwayInitials() {
		return awayInitials;
	}

	/**
	 * @param awayInitials the awayInitials to set
	 */
	public void setAwayInitials(String awayInitials) throws IllegalArgumentException {
		char[] ch = awayInitials.toCharArray();
		int letter = 0;

		// count the number of letters in a character array
		for (int i = 0; i < awayInitials.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			}

		}
		// if count of letters is >=1 and <35 setCity else print error to screen
		if (letter == 3) {
			this.awayInitials = awayInitials;

		} else {
			throw new IllegalArgumentException("Away initials should be three letters");
		}

	}

	@Override
	public String toString() {
		return "Match [year=" + year + ", host=" + host + ", stage=" + stage + ", stadium=" + stadium + ", city=" + city
				+ ", attendance=" + attendance + ", homeName=" + homeName + ", homeGoals=" + homeGoals + ", awayGoals="
				+ awayGoals + ", awayName=" + awayName + ", winCondition=" + winCondition + ", htHomeGoals="
				+ htHomeGoals + ", htAwayGoals=" + htAwayGoals + ", homeInitials=" + homeInitials + ", awayInitials="
				+ awayInitials + "]";
	}
}
