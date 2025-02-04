/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainteam;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class MainTeam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Ask user to enter data for Team a1
        System.out.println("Enter data for Team a1: ");
        System.out.print("Team name: ");
        String teamName = scanner.nextLine();
        System.out.print("Name of team member 1: ");
        String name1 = scanner.nextLine();
        System.out.print("Name of team member 2: ");
        String name2 = scanner.nextLine();
        System.out.print("Name of team member 3: ");
        String name3 = scanner.nextLine();
        System.out.print("Name of team member 4: ");
        String name4 = scanner.nextLine();
        System.out.print("Name of competition 1: ");
        String competitionName1 = scanner.nextLine();
        System.out.print("Winning team for competition 1: ");
        String winningTeam1 = scanner.nextLine();
        System.out.print("Runner-up for competition 1: ");
        String runnerUp1 = scanner.nextLine();
        System.out.print("Year of competition 1: ");
        int year1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name of competition 2: ");
        String competitionName2 = scanner.nextLine();
        System.out.print("Winning team for competition 2: ");
        String winningTeam2 = scanner.nextLine();
        System.out.print("Runner-up for competition 2: ");
        String runnerUp2 = scanner.nextLine();
        System.out.print("Year of competition 2: ");
        int year2 = scanner.nextInt();
        scanner.nextLine();

        // a1
        Competition competition1 = new Competition(competitionName1, winningTeam1, runnerUp1, year1);
        Competition competition2 = new Competition(competitionName2, winningTeam2, runnerUp2, year2);
        Team a1 = new Team(teamName, name1, name2, name3, name4, competition1, competition2); 
             
        System.out.println("Data for a1:");
        System.out.println(a1.toString());

        // Make a deep copy of a1 and store it in a2
        Team a2 = new Team(a1);

        // Ask user to change the name of a2 and name of competition 2 of team 2
        System.out.println("Enter new data for a2:");
        System.out.print("New team name: ");
        a2.setTeamName(scanner.nextLine());
        System.out.print("New name of competition 2: ");
        Competition competition2Copy = new Competition(a2.getCompetition2());
        competition2Copy.setNameCompetition(scanner.nextLine());
        a2.setCompetition2(competition2Copy);

        // a1 and a2
        System.out.println("Data for a1:");
        System.out.println(a1.toString());
        System.out.println("Data for a2:");
        System.out.println(a2.toString());
    }     
    }
    
    

