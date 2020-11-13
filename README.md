# Programming-Module-Java-
Year 1 programming module - Java


World Cup Stats analyser application
Instructions:
Submission : 9:00 Friday 28th August 2020 (via Canvas) – to enable transfer to MSc Year 2 (PT) September 2020
Or 9:00 Monday 7th December 2020.
You have been given a data file (WorldCupMatches.csv) that contains various details for each FIFA World Cup match from 1930 until 2014. You are tasked with writing an OOP based Java application that will enable the reading and searching of the data.
Create a project solution (named PGCert<your student id> e.g. PGCert2048201). Create a package named wc. Add WorldCupMatches.csv to the project. Ensure your name and student number are placed in the Javadoc comments of all the classes you write to support the application.
Part 1 – 50%
Using your knowledge of OOP:
  
1. Create a class Match.java that will represent each match detail. The class should have all the properties for each data point (attribute) of the match. Each attribute with appropriate validation rule is detailed below.
Return an appropriate exception with an appropriate exception message e.g. “Invalid Home Goals”, “Invalid team name format” etc. if an attempt is made to set outside a range or allowable values.

2. You should fully unit test this class.


Part 2 - Searches - 50%
Create a Stats.java class is designed to support the system for searching. It should have the application’s main method and then a series of methods calls.
Methods required:

1. Read each match detail from the csv, creating an instance of the Match class (from Part 1) for each match and populate this arraylist : (which should be created with the Stats class.)
public static ArrayList<Match> matches = new ArrayList<Match>(); Acting on this populated ArrayList then perform the following operations matching the format of the
example outputs...
  
2. Output to screen all details of all matches e.g.
Match [year=2002, host=South Korea/Japan, stage=Group F, stadium=Saitama Stadium 2002, city=Saitama , attendance=52721, homeTeamName=England, homeTeamGoals=1, awayTeamGoals=1, awayTeamName=Sweden, winConditions= , halfTimeHomeGoals=1, halfTimeAwayGoals=0, homeTeamInitials=ENG, awayTeamInitials=SWE]

3. Output to screen the total attendances of all matches and the average attendance (to two decimal points) for WC matches.
Total attendances in all WCs : Average attendances:

4. Output to screen the results of any searched for WC year. Eg. Searching for 1998 would output :
All matches in WC France 1998 Brazil 2 : Scotland 1
Morocco 2 : Norway 2
Italy 2 : Chile 2
Etc...

5. Output to screen the results of any searched for country that has played in the WC e.g. Searching for Spain would output :
Matches Spain have played in the WC Spain 3 : Brazil 1
Italy 1 : Spain 1
Italy 1 : Spain 0
Spain 3 : USA 1 Etc...
 
6. Output to screen the following details for all WC final matches
1930 Uruguay
Uruguay 4 : Argentina 2
1934 Italy
Italy 2 : Czechoslovakia 1
1938 France
Italy 4 : Hungary 2
Etc...

7. Output to screen the total number of goals scored in all WC matches and the average goals per game (to
two decimal places).
Total goals in all WCs : Average goals per game :

8. Output the details for the matches with the smallest attendance and also the largest attendance.
Attendances
Smallest attendance 2000
Uruguay 1930 Estadio Centenario Uruguay CHI vs FRA
Largest attendance etc...

9. Output to screen the details of each match that went to extra time (i.e. Win Condition being set as ET) e.g.
ET games
1934 Italy Preliminary round Austria 3 : France 2
1934 Italy Final
Italy 2 : Czechoslovakia 1 Etc...

10. Output to screen the details of each match that went to penalties. Win conditions either HWP or AWP e.g.
Games that went to penalties 1990 Italy Semi-finals
ITA 1 : ARG 1
Winner : ARG
Etc...

11. Output to screen the percentage of games won by the team that were leading at half time.
