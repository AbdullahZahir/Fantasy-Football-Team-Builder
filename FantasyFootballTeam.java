import java.util.ArrayList;

public class FantasyFootballTeam
{   
    private ArrayList<String> team; // User's team roster
    private ArrayList<String> availablePlayers; // Players to choose from
    public static final int MAX_TEAM_SIZE = 5; // User team size max
    
    public FantasyFootballTeam()
    {
        team = new ArrayList<String>();
        availablePlayers = new ArrayList<String>();

        // Adding available players. Feel free to add names
        // of your favorite players to this list! But make
        // sure you DON'T remove any players from it!
        availablePlayers.add("Josh Allen");
        availablePlayers.add("Jonathan Taylor");
        availablePlayers.add("Breece Hall");
        availablePlayers.add("Patrick Mahomes");
        availablePlayers.add("Saquon Barkley");
        availablePlayers.add("CeeDee Lamb");
        availablePlayers.add("AJ Brown");
        availablePlayers.add("Travis Kelce");
        availablePlayers.add("Baker Mayfield");
        availablePlayers.add("Marvin Harrison Jr.");
        availablePlayers.add("Justin Jefferson");
        availablePlayers.add("Jahmyr Gibbs");
        availablePlayers.add("Alvin Kamara");
        availablePlayers.add("Mike Evans");
        availablePlayers.add("Aaron Rodgers");
    }
    
    // Add player to team if team is less than max team size
    public void addPlayer(String player)
    {
        if (team.size() >= MAX_TEAM_SIZE) {
            System.out.println("Your team already has " + MAX_TEAM_SIZE + " players");
        }
        else {
            if (checkAvailability(player) == -1) {
                System.out.println(player + "is not available.");
            }
            else {
                team.add(player);
                availablePlayers.remove(player);
                System.out.println("Successfully added " + player + ".");
            }
        }
        
        
    }

    // Returns the index of an available player or -1 if the player is not available
    public int checkAvailability(String player)
    {
        for (int i = 0; i<availablePlayers.size(); i++) {
            if (availablePlayers.get(i).equals(player)) {
                return i;
            }
            
        }
        
       return -1; 
    }

    // Returns team size
    public int getTeamLength()
    {
        return team.size();
    }

    // Prints the team's roster
    public String toString()
    {
        String output = "";

        for (String player : team)
        {
            output += " * " + player + "\n";
        }

        return output;
    }
}
