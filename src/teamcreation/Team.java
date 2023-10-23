/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamcreation;

import java.util.List;

/**
 *
 * @author hrfre
 */
public class Team {

    //The team's name and the list of team members.
    private final String teamName;
    private final List<Person> teamMembers;

    //Constructor to initialize the team with a name and a list of members.
    public Team(String teamName, List<Person> teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    //Getter method to retrieve the team's name.
    public String getTeamName() {
        return teamName;
    }

    //Getter method to retrieve the list of team members.
    public List<Person> getTeamMembers() {
        return teamMembers;
    }
}
