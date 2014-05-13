package au.com.bookworld.app;

import java.util.Collections;
import java.util.List;

import au.com.bookworld.Comparator.SoccerTeamGoalDifferenceComparable;
import au.com.bookworld.io.SoccerDatFileReader;
import au.com.bookworld.pojo.SoccerTeam;

/**
 * @author ken
 *
 */
public class SoccerApp {
	
	public static void main(String[] args) {
		
		//Step1: get the soccers Teams from the dat file
		List<SoccerTeam> soccerTeams = SoccerDatFileReader.getSoccerTeamsFromDatFile("/football.dat");
		
		//Step2: sort the teams ordered by SoccerTeamGoalDifference
		Collections.sort(soccerTeams, new SoccerTeamGoalDifferenceComparable());
		
		//Step3: print the team name of the smallest difference in 'for' and 'against' goals 
		System.out.println("The team with the smallest difference in 'for' and 'against' goals is '" + soccerTeams.get(0).getTeamName() + "'!");
		
		//print all soccerTeam information on the screen
		System.out.println("Here are all the soccer team information order by the goal difference:");
		for(SoccerTeam soccerTeam:soccerTeams){
			System.out.println(soccerTeam);
		}

	}

}
