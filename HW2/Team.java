/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainteam;

/**
 *
 * @author User
 */
public class Team {
   
    // Instance variables
    private String teamName;
    private String name1;
    private String name2;
    private String name3;
    private String name4;
    private Competition competition1;
    private Competition competition2;

    // Constructor
    public Team(String teamName, String name1, String name2, String name3, String name4, Competition competition1, Competition competition2) {
        this.teamName = teamName;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.competition1 = competition1;
        this.competition2 = competition2;
    }

    // Deep copy constructor
    public Team(Team other) {
        this.teamName = other.getTeamName();
        this.name1 = other.getName1();
        this.name2 = other.getName2();
        this.name3 = other.getName3();
        this.name4 = other.getName4();
        this.competition1 = new Competition(other.getCompetition1());
        this.competition2 = new Competition(other.getCompetition2());
    }

    // Mutator
    public void setTeamName (String teamName) {
        this.teamName = teamName;
    }
    public void setName1(String name1) {
        this.name1 = name1;
    }
    public void setName2(String name2) {
        this.name2 = name2;
    }
    public void setName3(String name3) {
        this.name3 = name3;
    }
    public void setName4(String name4) {
        this.name4 = name4;
    }
    public void setCompetition1(Competition competition1) {
        this.competition1 = competition1;
    }
    public void setCompetition2(Competition competition2) {
        this.competition2 = competition2;
    }
    
    // Accessor
    public String getTeamName() {
        return teamName;
    }
    public String getName1() {
        return name1;
    }
    public String getName2() {
        return name2;
    }
    public String getName3() {
        return name3;
    }
    public String getName4() {
        return name4;
    }
    public Competition getCompetition1() {
        return competition1;
    }
    public Competition getCompetition2() {
        return competition2;
    }
  
    // Method for team information
    public void displayTeamInfo() {
       System.out.println("Team name: " + teamName);
       System.out.println("Team members: " + name1 + ", " + name2 + ", " + name3 + ", " + name4);
       System.out.println("Competition 1: " + competition1.getNameCompetition()+ ", " + competition1.getYear() + ", Winning team: " + competition1.getWinningTeam() + ", RunnerUp: " + competition1.getRunnerUp());
       System.out.println("Competition 2: " + competition2.getNameCompetition()+ ", " + competition2.getYear() + ", Winning team: " + competition2.getWinningTeam() + ", RunnerUp: " + competition2.getRunnerUp());
    }
}


