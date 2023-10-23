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

    
    private final String teamName;
    private final List<Person> teamMembers;

    public Team(String teamName, List<Person> teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Person> getTeamMembers() {
        return teamMembers;
    }
}
