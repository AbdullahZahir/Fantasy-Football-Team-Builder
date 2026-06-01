import java.util.Scanner;

public class FantasyFootballRunner 
{
    public static void main(String[] args)
    {
        FantasyFootballTeam team = new FantasyFootballTeam();
        
        Scanner input = new Scanner(System.in);
    
        // Continually get user input until user stops
        while(true)
        {
            // Get player name
            System.out.println("Enter name of player to add (type 'stop' to finish): ");
            String player = input.nextLine();

            // Exit if user types stop
            if (player.equals("stop"))
            {
                break;
            }

            // Try to add the player
            team.addPlayer(player);
        }

        System.out.println("\nFinal team roster:\n" + team);
    }
}
