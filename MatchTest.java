/**
 * 
 */
package wc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author kylemoffett
 *
 */

class MatchTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * Test method for {@link wc.Match#getYear()}.
	 */
	@Test
	void testGetYear() {
		Match match = new Match();
		match.setYear(1934);

		assertEquals(1934, match.getYear());
	}

	/**
	 * Test method for {@link wc.Match#setYear(int)}.
	 */
	@Test
	void testSetYearInvalid() {
		Match match = new Match();

		IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
			// year set to 1929, required argument is >= 1930. Test Exception thrown.

			match.setYear(1929);
		});
		assertEquals("Please enter a year from 1930 onwards", illegalArgumentException.getMessage());
	}

	/**
	 * Test method for {@link wc.Match#getHost()}.
	 */
	@Test
	void testGetHost() {
		Match match = new Match();
		match.setHost("Brazil");

		assertEquals("Brazil", match.getHost());

	}

	/**
	 * Test method for {@link wc.Match#setHost(java.lang.String)}.
	 */
	@Test
	void testSetHostInvalid() {
		Match match = new Match();

		// host name set to 123, required argument is between 1 & 30 characters. Test
		// Exception thrown.
		IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
			match.setHost("123");
		});
		assertEquals("Host name should be between 1 and 30 characters", illegalArgumentException.getMessage());

		// host name set to 52 characters, required argument is between 1 & 30
		// characters. Test Exception thrown.
		IllegalArgumentException illegalArgumentExceptionInvalidUpperLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					match.setHost("abcdefghijklmnopqrstuvwxyzabcdefghigklmnopqrstuvwxyz");
				});

		assertEquals("Host name should be between 1 and 30 characters",
				illegalArgumentExceptionInvalidUpperLimit.getMessage());

		// host name set to 0 characters, required argument is between 1 & 30
		// characters. Test Exception thrown.
		IllegalArgumentException illegalArgumentExceptionInvalidLowerLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					match.setHost("");
				});

		assertEquals("Host name should be between 1 and 30 characters",
				illegalArgumentExceptionInvalidLowerLimit.getMessage());
	}

	/**
	 * Test method for {@link wc.Match#getStage()}.
	 */
	@Test
	void testGetStage() {
		Match match = new Match();
		match.setStage("Group 1");

		assertEquals("Group 1", match.getStage());
	}

	/**
	 * Test method for {@link wc.Match#setStage(java.lang.String)}.
	 */
	@Test
	void testSetStageInvalid() {
		Match match = new Match();

		IllegalArgumentException illegalArgumentExceptionInvalidType = assertThrows(IllegalArgumentException.class,
				() -> {
					// stage name set to 123, required argument is between 1 & 50 characters. Test
					// Exception thrown.
					match.setStage("123");
				});
		assertEquals("Stage name should be between 1 and 50 characters",
				illegalArgumentExceptionInvalidType.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidUpperLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// stage name set to 52 characters, required argument is between 1 & 50
					// characters. Test Exception thrown.
					match.setStage("abcdefghijklmnopqrstuvwxyzabcdefghigklmnopqrstuvwxyz");
				});

		assertEquals("Stage name should be between 1 and 50 characters",
				illegalArgumentExceptionInvalidUpperLimit.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidLowerLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// stage name set to 0 characters, required argument is between 1 & 50
					// characters. Test Exception thrown.
					match.setStage("");
				});

		assertEquals("Stage name should be between 1 and 50 characters",
				illegalArgumentExceptionInvalidLowerLimit.getMessage());
	}

	/**
	 * Test method for {@link wc.Match#getStadium()}.
	 */
	@Test
	void testGetStadium() {
		Match match = new Match();
		match.setStadium("Maracani");

		assertEquals("Maracani", match.getStadium());
	}

	/**
	 * Test method for {@link wc.Match#setStadium(java.lang.String)}.
	 */
	@Test
	void testSetStadium() {
		Match match = new Match();

		IllegalArgumentException illegalArgumentExceptionInvalidType = assertThrows(IllegalArgumentException.class,
				() -> {
					// stage name set to 123, required argument is between 1 & 80 characters. Test
					// Exception thrown.
					match.setStadium("123");
				});
		assertEquals("Stadium name should be between 1 and 80 characters",
				illegalArgumentExceptionInvalidType.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidUpperLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// stage name set to 104 characters, required argument is between 1 & 80
					// characters. Test Exception thrown.
					match.setStadium(
							"abcdefghijklmnopqrstuvwxyzabcdefghigklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghigklmnopqrstuvwxyz");
				});

		assertEquals("Stadium name should be between 1 and 80 characters",
				illegalArgumentExceptionInvalidUpperLimit.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidLowerLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// stage name set to 0 characters, required argument is between 1 & 80
					// characters. Test Exception thrown.
					match.setStadium("");
				});

		assertEquals("Stadium name should be between 1 and 80 characters",
				illegalArgumentExceptionInvalidLowerLimit.getMessage());
	}

	/**
	 * Test method for {@link wc.Match#getCity()}.
	 */
	@Test
	void testGetCity() {
		Match match = new Match();
		match.setCity("Rio De Janeiro");

		assertEquals("Rio De Janeiro", match.getCity());
	}

	/**
	 * Test method for {@link wc.Match#setCity(java.lang.String)}.
	 */
	@Test
	void testSetCity() {
		Match match = new Match();

		IllegalArgumentException illegalArgumentExceptionInvalidType = assertThrows(IllegalArgumentException.class,
				() -> {
					// city name set to 123, required argument is between 1 & 40 characters. Test
					// Exception thrown.
					match.setCity("123");
				});
		assertEquals("City name should be between 1 and 40 characters",
				illegalArgumentExceptionInvalidType.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidUpperLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// city name set to 104 characters, required argument is between 1 & 40
					// characters. Test Exception thrown.
					match.setCity(
							"abcdefghijklmnopqrstuvwxyzabcdefghigklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghigklmnopqrstuvwxyz");
				});

		assertEquals("City name should be between 1 and 40 characters",
				illegalArgumentExceptionInvalidUpperLimit.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidLowerLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// city name set to 0 characters, required argument is between 1 & 40
					// characters. Test Exception thrown.
					match.setCity("");
				});

		assertEquals("City name should be between 1 and 40 characters",
				illegalArgumentExceptionInvalidLowerLimit.getMessage());
	}

	/**
	 * Test method for {@link wc.Match#getAttendance()}.
	 */
	@Test
	void testGetAttendance() {
		Match match = new Match();
		match.setAttendance(20000);

		assertEquals(20000, match.getAttendance());
	}

	/**
	 * Test method for {@link wc.Match#setAttendance(int)}.
	 */
	@Test
	void testSetAttendance() {
		Match match = new Match();

		IllegalArgumentException illegalArgumentExceptionInvalidUpperLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// Attendance set to 200100, requirement between 0 and 200k exclusive
					// Test exception thrown
					match.setAttendance(200100);
				});

		assertEquals("Attendance can't be less than zero or greater than 200k",
				illegalArgumentExceptionInvalidUpperLimit.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidLowerLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// Attendance set to -1, requirement between 0 and 200k exclusive
					// Test exception thrown
					match.setAttendance(-1);
				});

		assertEquals("Attendance can't be less than zero or greater than 200k",
				illegalArgumentExceptionInvalidLowerLimit.getMessage());
	}

	/**
	 * Test method for {@link wc.Match#getHomeName()}.
	 */
	@Test
	void testGetHomeName() {
		Match match = new Match();
		match.setHomeName("Italy");

		assertEquals("Italy", match.getHomeName());
	}

	/**
	 * Test method for {@link wc.Match#setHomeName(java.lang.String)}.
	 */
	@Test
	void testSetHomeName() {
		Match match = new Match();

		IllegalArgumentException illegalArgumentExceptionInvalidType = assertThrows(IllegalArgumentException.class,
				() -> {
					// homeName set to 123, required argument is between 1 & 35 characters. Test
					// Exception thrown.
					match.setHomeName("123");
				});
		assertEquals("Home team name should be between 1 and 35 characters",
				illegalArgumentExceptionInvalidType.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidUpperLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// homeName set to 104 characters, required argument is between 1 & 35
					// characters. Test Exception thrown.
					match.setHomeName(
							"abcdefghijklmnopqrstuvwxyzabcdefghigklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghigklmnopqrstuvwxyz");
				});

		assertEquals("Home team name should be between 1 and 35 characters",
				illegalArgumentExceptionInvalidUpperLimit.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidLowerLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// homeName set to 0 characters, required argument is between 1 & 35
					// characters. Test Exception thrown.
					match.setHomeName("");
				});

		assertEquals("Home team name should be between 1 and 35 characters",
				illegalArgumentExceptionInvalidLowerLimit.getMessage());

	}

	/**
	 * Test method for {@link wc.Match#getHomeGoals()}.
	 */
	@Test
	void testGetHomeGoals() {
		Match match = new Match();
		match.setHomeGoals(4);

		assertEquals(4, match.getHomeGoals());
	}

	/**
	 * Test method for {@link wc.Match#setHomeGoals(int)}.
	 */
	@Test
	void testSetHomeGoals() {
		Match match = new Match();

		IllegalArgumentException illegalArgumentExceptionInvalidUpperLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// homeGoals set to 16, requirement between 0 and 15 exclusive
					// Test exception thrown
					match.setHomeGoals(16);
				});

		assertEquals("Home goals can't be less than zero or greater than 15",
				illegalArgumentExceptionInvalidUpperLimit.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidLowerLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// homeGoals set to -1, requirement between 0 and 200k exclusive
					// Test exception thrown
					match.setHomeGoals(-1);
				});

		assertEquals("Home goals can't be less than zero or greater than 15",
				illegalArgumentExceptionInvalidLowerLimit.getMessage());
	}
//	}

	/**
	 * Test method for {@link wc.Match#getAwayGoals()}.
	 */
	@Test
	void testGetAwayGoals() {
		Match match = new Match();
		match.setAwayGoals(4);

		assertEquals(4, match.getAwayGoals());
	}

	/**
	 * Test method for {@link wc.Match#setAwayGoals(int)}.
	 */
	@Test
	void testSetAwayGoals() {
		Match match = new Match();

		IllegalArgumentException illegalArgumentExceptionInvalidUpperLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// awayGoals set to 16, requirement between 0 and 15 exclusive
					// Test exception thrown
					match.setAwayGoals(16);
				});

		assertEquals("Away goals can't be less than zero or greater than 15",
				illegalArgumentExceptionInvalidUpperLimit.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidLowerLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// awayGoals set to -1, requirement between 0 and 200k exclusive
					// Test exception thrown
					match.setAwayGoals(-1);
				});

		assertEquals("Away goals can't be less than zero or greater than 15",
				illegalArgumentExceptionInvalidLowerLimit.getMessage());
	}

	/**
	 * Test method for {@link wc.Match#getAwayName()}.
	 */
	@Test
	void testGetAwayName() {
		Match match = new Match();
		match.setAwayName("England");

		assertEquals("England", match.getAwayName());
	}

	/**
	 * Test method for {@link wc.Match#setAwayName(java.lang.String)}.
	 */
	@Test
	void testSetAwayName() {
		Match match = new Match();

		IllegalArgumentException illegalArgumentExceptionInvalidType = assertThrows(IllegalArgumentException.class,
				() -> {
					// awayName set to 123, required argument is between 1 & 35 characters. Test
					// Exception thrown.
					match.setAwayName("123");
				});
		assertEquals("Away team name should be between 1 and 35 characters",
				illegalArgumentExceptionInvalidType.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidUpperLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// awayName set to 104 characters, required argument is between 1 & 35
					// characters. Test Exception thrown.
					match.setAwayName(
							"abcdefghijklmnopqrstuvwxyzabcdefghigklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghigklmnopqrstuvwxyz");
				});

		assertEquals("Away team name should be between 1 and 35 characters",
				illegalArgumentExceptionInvalidUpperLimit.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidLowerLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// awayName set to 0 characters, required argument is between 1 & 35
					// characters. Test Exception thrown.
					match.setAwayName("");
				});

		assertEquals("Away team name should be between 1 and 35 characters",
				illegalArgumentExceptionInvalidLowerLimit.getMessage());
	}

	/**
	 * Test method for {@link wc.Match#getWinCondition()}.
	 */
	@Test
	void testGetWinCondition() {
		Match match = new Match();
		match.setWinCondition("ET");

		assertEquals("ET", match.getWinCondition());
	}

	/**
	 * Test method for {@link wc.Match#setWinCondition(java.lang.String)}.
	 */
	@Test
	void testSetWinCondition() {
		Match match = new Match();

		IllegalArgumentException illegalArgumentExceptionInvalidType = assertThrows(IllegalArgumentException.class,
				() -> {
					// WinCondition set to 123, required argument can only be blank, ET, AWP or HWP.
					// Test Exception thrown.
					match.setWinCondition("123");
				});
		assertEquals("Win condition can only be blank, ET, AWP or HWP",
				illegalArgumentExceptionInvalidType.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidCharacters = assertThrows(
				IllegalArgumentException.class, () -> {
					// WinCondition set to yes, required argument can only be blank, ET, AWP or HWP.
					// Test Exception thrown.
					match.setWinCondition("yes");
				});

		assertEquals("Win condition can only be blank, ET, AWP or HWP",
				illegalArgumentExceptionInvalidCharacters.getMessage());

	}

	/**
	 * Test method for {@link wc.Match#getHtHomeGoals()}.
	 */
	@Test
	void testGetHtHomeGoals() {
		Match match = new Match();
		match.setHtHomeGoals(4);

		assertEquals(4, match.getHtHomeGoals());
	}

	/**
	 * Test method for {@link wc.Match#setHtHomeGoals(int)}.
	 */
	@Test
	void testSetHtHomeGoals() {
		Match match = new Match();

		IllegalArgumentException illegalArgumentExceptionInvalidUpperLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// homeHtGoals set to 16, requirement between 0 and 15 exclusive
					// Test exception thrown
					match.setHtHomeGoals(16);
				});

		assertEquals("Half time home goals can't be less than zero or greater than 15",
				illegalArgumentExceptionInvalidUpperLimit.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidLowerLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// homeHtGoals set to -1, requirement between 0 and 200k exclusive
					// Test exception thrown
					match.setHtHomeGoals(-1);
				});

		assertEquals("Half time home goals can't be less than zero or greater than 15",
				illegalArgumentExceptionInvalidLowerLimit.getMessage());
	}

	/**
	 * Test method for {@link wc.Match#getHtAwayGoals()}.
	 */
	@Test
	void testGetHtAwayGoals() {
		Match match = new Match();
		match.setHtAwayGoals(8);

		assertEquals(8, match.getHtAwayGoals());
	}

	/**
	 * Test method for {@link wc.Match#setHtAwayGoals(int)}.
	 */
	@Test
	void testSetHtAwayGoals() {
		Match match = new Match();

		IllegalArgumentException illegalArgumentExceptionInvalidUpperLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// AwayHtGoals set to 16, requirement between 0 and 15 exclusive
					// Test exception thrown
					match.setHtAwayGoals(16);
				});

		assertEquals("Half time away goals can't be less than zero or greater than 15",
				illegalArgumentExceptionInvalidUpperLimit.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidLowerLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// AwayHtGoals set to -1, requirement between 0 and 15 exclusive
					// Test exception thrown
					match.setHtAwayGoals(-1);
				});

		assertEquals("Half time away goals can't be less than zero or greater than 15",
				illegalArgumentExceptionInvalidLowerLimit.getMessage());
	}

	/**
	 * Test method for {@link wc.Match#getHomeInitials()}.
	 */
	@Test
	void testGetHomeInitials() {
		Match match = new Match();
		match.setHomeInitials("ARG");

		assertEquals("ARG", match.getHomeInitials());
	}

	/**
	 * Test method for {@link wc.Match#setHomeInitials(java.lang.String)}.
	 */
	@Test
	void testSetHomeInitials() {
		Match match = new Match();

		IllegalArgumentException illegalArgumentExceptionInvalidType = assertThrows(IllegalArgumentException.class,
				() -> {
					// homeInitials set to 123, required argument is 3 characters
					// Exception thrown.
					match.setHomeInitials("123");
				});
		assertEquals("Home initials should be three letters", illegalArgumentExceptionInvalidType.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidUpperLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// homeInitials set to 4 characters, required argument is 3 characters
					// Test Exception thrown.
					match.setHomeInitials("abcd");
				});

		assertEquals("Home initials should be three letters", illegalArgumentExceptionInvalidUpperLimit.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidLowerLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// homeInitials set to 2 characters, required argument is 3 characters
					// characters. Test Exception thrown.
					match.setHomeInitials("ab");
				});

		assertEquals("Home initials should be three letters", illegalArgumentExceptionInvalidLowerLimit.getMessage());
	}

	/**
	 * Test method for {@link wc.Match#getAwayInitials()}.
	 */
	@Test
	void testGetAwayInitials() {
		Match match = new Match();
		match.setAwayInitials("BEL");

		assertEquals("BEL", match.getAwayInitials());
	}

	/**
	 * Test method for {@link wc.Match#setAwayInitials(java.lang.String)}.
	 */
	@Test
	void testSetAwayInitials() {
		Match match = new Match();

		IllegalArgumentException illegalArgumentExceptionInvalidType = assertThrows(IllegalArgumentException.class,
				() -> {
					// awayInitials set to 123, required argument is 3 characters
					// Exception thrown.
					match.setAwayInitials("123");
				});
		assertEquals("Away initials should be three letters", illegalArgumentExceptionInvalidType.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidUpperLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// awayInitials set to 4 characters, required argument is 3 characters
					// Test Exception thrown.
					match.setAwayInitials("abcd");
				});

		assertEquals("Away initials should be three letters", illegalArgumentExceptionInvalidUpperLimit.getMessage());

		IllegalArgumentException illegalArgumentExceptionInvalidLowerLimit = assertThrows(
				IllegalArgumentException.class, () -> {
					// awayInitials set to 2 characters, required argument is 3 characters
					// characters. Test Exception thrown.
					match.setAwayInitials("ab");
				});

		assertEquals("Away initials should be three letters", illegalArgumentExceptionInvalidLowerLimit.getMessage());
	}

}