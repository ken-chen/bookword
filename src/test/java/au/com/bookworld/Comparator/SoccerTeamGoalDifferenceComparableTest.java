package au.com.bookworld.Comparator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import au.com.bookworld.io.SoccerDatFileReader;
import au.com.bookworld.pojo.SoccerTeam;

/**
 * @author ken
 *
 */
public class SoccerTeamGoalDifferenceComparableTest {
	List<SoccerTeam> soccerTeams;

	@Before
	public void setUp() {
		soccerTeams = SoccerDatFileReader
				.getSoccerTeamsFromDatFile("/football.dat");
		Collections.sort(soccerTeams, new SoccerTeamGoalDifferenceComparable());
	}

	@Test
	public void testSmallestGoalDifferenceSoccerTeam() {
		
		String expectedTeamName = "Aston Villa";
		assertEquals(expectedTeamName, soccerTeams.get(0).getTeamName());
		
		// smallest difference in 'for' and 'against' goals
		int smallestDoalDifference = soccerTeams.get(0).getGoalDifference();
		
		for(SoccerTeam soccerTeam: soccerTeams){
			if (soccerTeam.getGoalDifference() <  smallestDoalDifference){
				fail("the smallest doal difference team is not " + expectedTeamName);
			}
			
		}
	}
}
