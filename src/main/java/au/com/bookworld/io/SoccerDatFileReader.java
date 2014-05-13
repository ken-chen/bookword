package au.com.bookworld.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import au.com.bookworld.pojo.SoccerTeam;

/**
 * @author ken
 * Create the soccerTeam list from the dat file
 *
 */
public class SoccerDatFileReader {
	/**
	 * @param fileIn
	 * @return read the soccer teams data from the dat file
	 */
	public static List<SoccerTeam> getSoccerTeamsFromDatFile(String fileIn) {
		List<SoccerTeam> soccerTeams =  new ArrayList<SoccerTeam>();
		try {

			InputStream in = SoccerDatFileReader.class.getResourceAsStream(fileIn);
			// create bufferreader to wrap the InputStream
			BufferedReader inputStream = new BufferedReader(new InputStreamReader(in));
		
			String temp = inputStream.readLine();
			boolean firstLine = true;
			while (temp != null) {
				//skip the first line of the file which contains titles
				if (firstLine){
					firstLine= false;
					temp = inputStream.readLine();
					continue;
				}
				
				//^_+ : any sequence of spaces at the beginning of the string
				//_+$ : any sequence of spaces at the end of the string
				//(_)+ : any sequence of spaces that matches none of the above, meaning it's in the middle
				//Match and replace with $1, which captures a single space
				String fileContent = temp.replaceAll("^ +| +$|( )+", "$1");
				
				String[] teamRecord = fileContent.split(" ");
				
				if(teamRecord !=null && teamRecord.length > 8){
					SoccerTeam scSoccerTeam =  
							new SoccerTeam(teamRecord[1].replaceAll("_", " "), 					
									Integer.parseInt(teamRecord[2]), 
									Integer.parseInt(teamRecord[3]), 
									Integer.parseInt(teamRecord[4]), 
									Integer.parseInt(teamRecord[5]), 
									Integer.parseInt(teamRecord[6]), 
									Integer.parseInt(teamRecord[8]), 
									Integer.parseInt(teamRecord[9]));
					soccerTeams.add(scSoccerTeam);
				}
				
				temp = inputStream.readLine();
			}
			inputStream.close();

		}catch (Exception e) {
			//logger the exception
			throw new IllegalArgumentException("There was a problem reading the file with name " + fileIn + "detail: " +e.getMessage());
		}
		return soccerTeams;
	}
}
