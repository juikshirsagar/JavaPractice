package javacaseinheritance.com;

public class AthleteApp {
	  public static void main(String[] args) {
		  FootballPlayer tom = new FootballPlayer("Tom Brady", "Tom Terrific", 1977, "Tampa Bay", 285, 9988, 6377);
	        FootballPlayer ed = new FootballPlayer("Ed Brady", "Ed Terrific", 1979, "New England Patriots", 265, 8988, 4377);

	        FootballPlayer[] footballPlayers = new FootballPlayer[2];
	        footballPlayers[0] = tom;
	        footballPlayers[1] = ed;

	        for (FootballPlayer footballPlayer : footballPlayers) {
	            System.out.println("-------------------------------------");
	            footballPlayer.getBio();
	        }
	  }
}
