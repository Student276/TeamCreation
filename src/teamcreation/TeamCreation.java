/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teamcreation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author hrfre
 */
public class TeamCreation {
    
   public static void main(String[] args) {
        List<Person> people = readData("Hugo.csv");
        List<Team> teams = createTeams(people, 20, 5);
        printTeams(teams);
    }
   //Method to read data from the file and create a list of people
    public static List<Person> readData(String fileName) {
        List<Person> people = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Person person = new Person(Integer.parseInt(data[0]), data[1], data[2], data[3]);
                people.add(person);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }
     //Method to create teams
    public static List<Team> createTeams(List<Person> people, int numTeams, int teamSize) {
        List<Team> teams = new ArrayList<>();
        Set<Integer> usedIds = new HashSet<>();
        Random random = new Random();
        
        //Loop to create teams
        for (int i = 0; i < numTeams; i++) {
            TeamNames teamName = TeamNames.values()[i];
            List<Person> teamMembers = new ArrayList<>();
            while (teamMembers.size() < teamSize) {
                Person person = people.get(random.nextInt(people.size()));
                if (!usedIds.contains(person.getId())) {
                    teamMembers.add(person);
                    usedIds.add(person.getId());
                }
            }
            teams.add(new Team(teamName.toString(), teamMembers));
        }
        return teams;
    }
    
    //This method prints the details of each team, including the team name and its members.
    public static void printTeams(List<Team> teams) {
        for (Team team : teams) {
            System.out.println("Team Name: " + team.getTeamName());
            System.out.println("Members: ");
            for (Person person : team.getTeamMembers()) {
                System.out.println(person.getFullName());
            }
            System.out.println();
        }
    }
}
