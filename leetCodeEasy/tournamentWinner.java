import java.util.*;


class Program {


  public int HOME_TEAM_WON = 1;
  
  public String tournamentWinner(
   ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

    String currenBestTeam =  "";
    HashMap<String, Integer> scores = new HashMap <String, Integer>();
    scores.put(currenBestTeam,0);


    for(int i  = 0; i < competitions.size(); i++) {
      ArrayList<String> competition = competitions.get(i);
      int result = results.get(i);

      String homeTeam = competition.get(0);
      String awayTeam = competition.get(1);

      String winningTeam = (result == HOME_TEAM_WON) ? homeTeam : awayTeam;

      updateScores(winningTeam,3,scores);

      if(scores.get(winningTeam) > scores.get(currenBestTeam)) {
        currenBestTeam = winningTeam;
      }
    }
    return currenBestTeam;
  }


  public void updateScores(String team, int points, HashMap<String,Integer> scores) {
    if(!scores.containsKey(team)) {
      scores.put(team,0);
    }
    scores.put(team,scores.get(team)+points);
  }
}
