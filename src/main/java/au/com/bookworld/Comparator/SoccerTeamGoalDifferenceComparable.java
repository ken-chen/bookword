package au.com.bookworld.Comparator;

import java.util.Comparator;

import au.com.bookworld.pojo.SoccerTeam;

/**
 * @author ken
 * 
 */
public class SoccerTeamGoalDifferenceComparable implements Comparator<SoccerTeam> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(SoccerTeam soccerTeam1, SoccerTeam soccerTeam2) {
		if (soccerTeam1.getGoalDifference() < soccerTeam2.getGoalDifference()) {
			return -1;
		}
		if (soccerTeam1.getGoalDifference() > soccerTeam2.getGoalDifference()) {
			return 1;
		}
		return 0;
	}

}