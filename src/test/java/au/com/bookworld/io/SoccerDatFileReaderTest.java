package au.com.bookworld.io;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import au.com.bookworld.pojo.SoccerTeam;

/**
 * @author ken
 *
 */
public class SoccerDatFileReaderTest {
	
		
	@Test 
	public void TestSoccerDatFileReader(){
		List<SoccerTeam> soccerTeams = SoccerDatFileReader.getSoccerTeamsFromDatFile("/football.dat");
		
		assertNotNull(soccerTeams);	
		assertTrue(soccerTeams.size() > 1);	
		
		for(SoccerTeam soccerTeam:soccerTeams){
			assertNotNull(soccerTeam);	
			assertNotNull(soccerTeam.getGoalDifference());
			assertNotNull(soccerTeam.getTeamName());
			assertNotNull(soccerTeam.getTotalPoints());
		}
		
	}

	
	@Test(expected = IllegalArgumentException.class)
	public void testSoccerDatFileReaderWithNonExistingfile(){
		SoccerDatFileReader.getSoccerTeamsFromDatFile("testfileName.bat");
	}
	
}
