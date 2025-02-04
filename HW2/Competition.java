/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainteam;

/**
 *
 * @author User
 */
public class Competition {
   
    // instance variables
    private String nameCompetition;
    private String winningTeam;
    private String runnerUp;
    private int year;

    // Constructor
    public Competition(String nameCompetition, String winningTeam, String runnerUp, int year) {
        this.nameCompetition = nameCompetition;
        this.winningTeam = winningTeam;
        this.runnerUp = runnerUp;
        this.year = year;
    }
    
    // Mutator 
    public void setNameCompetition(String nameCompetition) {
        this.nameCompetition = nameCompetition;
    }
    public void setWinningGame(String winningTeam) {
        this.winningTeam = winningTeam;
    }
    public void setRunnerUp(String runnerUp) {
        this.runnerUp = runnerUp;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    // Accessor
    public String getNameCompetition() {
        return nameCompetition;
    }
    public String getWinningTeam() {
        return winningTeam;
    }
    public String getRunnerUp() {
        return runnerUp;
    }
    public int getYear() {
        return year;
    } 

    // Copy constructor
    public Competition(Competition other) {
        this.nameCompetition = other.getNameCompetition();
        this.winningTeam = other.getWinningTeam();
        this.runnerUp = other.getRunnerUp();
        this.year = other.getYear();
    }
    
}

    
