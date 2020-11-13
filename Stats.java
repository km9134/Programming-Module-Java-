/**
 * 
 */
package wc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author kylemoffett
 *
 */
public class Stats {

	public static ArrayList<Match> matches = new ArrayList<Match>();

	/**
	 * Start point for application
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		fileRead();
		printAllMatches();
		attendanceTotal();
		searchYear();
		searchTeam();
		finalResults();
		numberOfGoalsScored();
		attendanceResult();
		etGames();
		penalties();
		htWinners();
	}

	/**
	 * Reads a csv file and populates it to an ArrayList
	 */
	public static void fileRead() {
		File file = new File("WorldCupMatches.csv");

		FileReader fileReader;
		BufferedReader bufferedreader;
		String matchInfo;
		String[] stats;

		try {
			fileReader = new FileReader(file);
			bufferedreader = new BufferedReader(fileReader);

			matchInfo = bufferedreader.readLine();
			// first line can be ignored as its header values
			matchInfo = bufferedreader.readLine();

			do {
				// create a match and add the stats
				Match match = new Match();
				stats = matchInfo.split(",");

				// parse match info into parts
				match.setYear(Integer.parseInt(stats[0]));
				match.setHost(stats[1]);
				match.setStage(stats[2]);
				match.setStadium(stats[3]);
				match.setCity(stats[4]);
				match.setAttendance(Integer.parseInt(stats[5]));
				match.setHomeName(stats[6]);
				match.setHomeGoals(Integer.parseInt(stats[7]));
				match.setAwayGoals(Integer.parseInt(stats[8]));
				match.setAwayName(stats[9]);
				match.setWinCondition(stats[10]);
				match.setHtHomeGoals(Integer.parseInt(stats[11]));
				match.setHtAwayGoals(Integer.parseInt(stats[12]));
				match.setHomeInitials(stats[13]);
				match.setAwayInitials(stats[14]);

				// add to arraylist of matches
				matches.add(match);

				// read the next line
				matchInfo = bufferedreader.readLine();
			} while (matchInfo != null);

			// close all
			fileReader.close();
			bufferedreader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Prints all matches stored in the arraylist to console
	 */
	public static void printAllMatches() {
		// show all matches
		for (Match match : matches) {
			// System.out.println(match.toString());
			System.out.println(match.toString());
		}
	}

	/**
	 * prints total attendance of all matches and average attendance to 2 d.p to the
	 * console
	 */
	public static void attendanceTotal() {
		// declare variables
		int total = 0;
		double gamesPlayed = 0;
		double average = 0;

		// enhanced for loop
		for (Match match : matches) {
			// add to the total each iteration of the loop
			total += match.getAttendance();
			// add to the count of gamesPlayed each iteration of the loop
			gamesPlayed++;
		}
		// calculate average
		average = total / gamesPlayed;
		// print total attendance to console
		System.out.println(total);
		// use printf to output average to console and round to 2d.p
		System.out.printf("Average attendance at each match is: %.2f \n", average);
	}

	/**
	 * Output to screen the results of any searched for world cup year
	 */
	public static void searchYear() {
		// declare variable and enter search year
		int searchYear = 1930;

		// print header
		System.out.println("All matches in WC " + searchYear + " " + "Uruguay");

		// blank line for formatting
		System.out.println();

		// enhanced for loop
		for (Match match : matches) {
			// use getter and check if equal to searchYear
			if (match.getYear() == searchYear) {
				// for all values that are equal to searchYear output to console
				System.out.println(match.getHomeName() + " " + match.getHomeGoals() + " " + match.getAwayGoals() + " "
						+ match.getAwayName());
			}

		}
	}

	/**
	 * Output to screen the results of any searched for country that has played in
	 * the WC e.g. Searching for Spain would output :
	 */
	public static void searchTeam() {
		// declare variable and enter search team
		String searchTeam = "Spain";

		// enhanced for loop
		for (Match match : matches) {
			// use getter and check if homeTeam or awayTeam equals searchTeam
			if (match.getHomeName().equals(searchTeam) || match.getAwayName().equals(searchTeam)) {
				// for all values that are equal to searchTeam output to console
				System.out.println(match.getHomeName() + " " + match.getHomeGoals() + " " + match.getAwayGoals() + " "
						+ match.getAwayName());
			}
		}
	}

	/**
	 * Output to screen the following details for all World Cup final matches
	 */
	public static void finalResults() {
		String searchStage = "Final";

		// enhanced for loop
		for (Match match : matches) {
			// use getter and check if homeTeam or awayTeam equals searchTeam
			if (match.getStage().equals(searchStage)) {
				// for all values that are equal to searchTeam output to console
				System.out.println(match.getYear() + " " + match.getHost());
				System.out.println(match.getHomeName() + " " + match.getHomeGoals() + " " + match.getAwayGoals() + " "
						+ match.getAwayName());
				System.out.println();
			}
		}
	}

	/**
	 * Output to screen the total number of goals scored in all World cup matches
	 * and the average goals per game (to two decimal places).
	 */
	public static void numberOfGoalsScored() {

		// declare variables
		int total = 0;
		double gamesPlayed = 0;
		double average = 0;

		// enhanced for loop
		for (Match match : matches) {
			// add to the total each iteration of the loop
			total += (match.getHomeGoals() + match.getAwayGoals());
			// add to the count of gamesPlayed each iteration of the loop
			gamesPlayed++;
		}
		// calculate average
		average = total / gamesPlayed;
		// print total attendance to console
		System.out.println(total);
		// use printf to output average to console and round to 2d.p
		System.out.printf("Average goals scored at each match is: %.2f \n", average);

	}

	/**
	 * Output the details for the matches with the smallest attendance and also the
	 * largest attendance.
	 */
	public static void attendanceResult() {
		// Use a comparator with Collections.max() to check which is greater in
		// comparison
		Match highest = Collections.max(matches, Comparator.comparingInt(Match::getAttendance));

		// retrieve the highest attendance
		int maxAttendance = highest.getAttendance();

		System.out.println("Attendances");
		// blank println for formatting
		System.out.println();

		// print largest attendance and value
		System.out.println("Largest attendance " + maxAttendance);

		// print host, year, stadium, host, home initials "vs" away initials as per
		// assignment document
		System.out.println(highest.getHost() + " " + highest.getYear() + " " + highest.getStadium() + " "
				+ highest.getHost() + " " + highest.getHomeInitials() + " " + "vs" + " " + highest.getAwayInitials());

		// Use a comparator with Collections.min() to check which is less in
		// comparison
		Match lowest = Collections.min(matches, Comparator.comparingInt(Match::getAttendance));

		// retrieve the lowest attendance
		int minAttendance = lowest.getAttendance();

		// blank println for formatting
		System.out.println();

		// print lowest attendance and value
		System.out.println("Lowest attendance " + minAttendance);

		// print host, year, stadium, host, home initials "vs" away initials as per
		// assignment document
		System.out.println(lowest.getHost() + " " + lowest.getYear() + " " + lowest.getStadium() + " "
				+ lowest.getHost() + " " + lowest.getHomeInitials() + " " + "vs" + " " + lowest.getAwayInitials());

	}

	/**
	 * Output to screen the details of each match that went to extra time
	 */
	public static void etGames() {
		System.out.println("ET games");
		
		// blank line for formatting
		System.out.println();

		// enhanced for loop
		for (Match match : matches) {
			// use getter and check if equal to "ET"
			if (match.getWinCondition().equals("ET")) {
				// for all values that are equal to ET output to console
				System.out.println(match.getYear() + " " + match.getHost() + " " + match.getStage());
				System.out.println(match.getHomeName() + " " + match.getHomeGoals() + " : " + match.getAwayName() + " "
						+ match.getAwayGoals());

			}
		}
	}

	/**
	 * Output to screen the details of each match that went to penalties. Win
	 * conditions either HWP or AWP
	 */
	public static void penalties() {
		System.out.println("Games that went to penalties");
		// blank print line for formatting
		System.out.println();

		// enhanced for loop
		for (Match match : matches) {
			// use getter and check if equal to "ET"
			if (match.getWinCondition().equals("HWP") || match.getWinCondition().equals("AWP")) {
				// for all values that are equal to HWP or AWP output to console
				System.out.println(match.getYear() + " " + match.getHost() + " " + match.getStage());
				System.out.println(match.getHomeInitials() + " " + match.getHomeGoals() + " : "
						+ match.getAwayInitials() + " " + match.getAwayGoals());
				if (match.getWinCondition().equals("HWP")) {
					System.out.println("Winner: " + match.getHomeInitials());
					// blank print line for formatting
					System.out.println();
				} else if (match.getWinCondition().equals("AWP")) {
					System.out.println("Winner: " + match.getAwayInitials());
					// blank print line for formatting
					System.out.println();
				}
			}
		}
	}

	/**
	 * Output to screen the percentage of games won by the team that were leading at
	 * half time.
	 */
	public static void htWinners() {

		// define variables needed to calculate percentage
		double htLeaderCount = 0;
		// use .size() to get number of rows of array list
		double totalPlayed = matches.size();
		double percentageWon = 0;

		// enhanced for loop
		for (Match match : matches) {
			// check if home team was winning at HT and winning at FT, if so append
			if (match.getHtHomeGoals() > match.getHtAwayGoals() && match.getHomeGoals() > match.getAwayGoals()) {
				htLeaderCount++;
				// check if away team was winning at HT and FT, if so append
			} else if (match.getHtAwayGoals() > match.getHtHomeGoals() && match.getAwayGoals() > match.getHomeGoals()) {
				htLeaderCount++;
			}

		}
		// calculate % and print to console
		percentageWon = (htLeaderCount / totalPlayed) * 100;
		System.out.printf("Percentage of games leading at half time that ended up winning the match was: %.2f%%",
				percentageWon);
	}

}
