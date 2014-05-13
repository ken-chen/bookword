package au.com.bookworld.pojo;

/**
 * @author ken
 *  POJO for SoccerTeam
 */
public class SoccerTeam {

	// stand for Team in the .dat file
	private String teamName;
	// stand for P in the .dat file
	private int gamesPlayed;
	// stand for W in the .dat file
	private int gamesWined;
	// stand for L in the .dat file
	private int gamesLost;
	// stand for D in the .dat file
	private int gamesDrawed;
	// stand for F in the .dat file
	private int forGoalsScored;
	// stand for A in the .dat file
	private int againstGoalsConceded;
	// 'F' minus 'A' or 'A' minus 'F'
	private int goalDifference;
	// stand for Pts in the .dat file
	private int totalPoints;

	public SoccerTeam(String teamName, int gamesPlayed, int gamesWined,
			int gamesLost, int gamesDrawed, int forGoalsScored,
			int againstGoalsConceded, int totalPoints) {
		super();
		this.teamName = teamName;
		this.gamesPlayed = gamesPlayed;
		this.gamesWined = gamesWined;
		this.gamesLost = gamesLost;
		this.gamesDrawed = gamesDrawed;
		this.forGoalsScored = forGoalsScored;
		this.againstGoalsConceded = againstGoalsConceded;
		this.totalPoints = totalPoints;

		if (forGoalsScored >= againstGoalsConceded) {
			this.goalDifference = forGoalsScored - againstGoalsConceded;
		} else {
			this.goalDifference = againstGoalsConceded - forGoalsScored;
		}
	}

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public int getGamesWined() {
		return gamesWined;
	}

	public void setGamesWined(int gamesWined) {
		this.gamesWined = gamesWined;
	}

	public int getGamesLost() {
		return gamesLost;
	}

	public void setGamesLost(int gamesLost) {
		this.gamesLost = gamesLost;
	}

	public int getGamesDrawed() {
		return gamesDrawed;
	}

	public void setGamesDrawed(int gamesDrawed) {
		this.gamesDrawed = gamesDrawed;
	}

	public int getForGoalsScored() {
		return forGoalsScored;
	}

	public void setForGoalsScored(int forGoalsScored) {
		this.forGoalsScored = forGoalsScored;
	}

	public int getAgainstGoalsConceded() {
		return againstGoalsConceded;
	}

	public void setAgainstGoalsConceded(int againstGoalsConceded) {
		this.againstGoalsConceded = againstGoalsConceded;
	}

	public int getGoalDifference() {
		return goalDifference;
	}

	public void setGoalDifference(int goalDifference) {
		this.goalDifference = goalDifference;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "SoccerTeam [teamName=" + teamName + ", gamesPlayed="
				+ gamesPlayed + ", gamesWined=" + gamesWined + ", gamesLost="
				+ gamesLost + ", gamesDrawed=" + gamesDrawed
				+ ", forGoalsScored=" + forGoalsScored
				+ ", againstGoalsConceded=" + againstGoalsConceded
				+ ", goalDifference=" + goalDifference + ", totalPoints="
				+ totalPoints + "]";
	}

}
