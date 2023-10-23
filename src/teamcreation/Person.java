/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamcreation;

/**
 *
 * @author hrfre
 */
public class Person {
    
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String email;
    
    //Constructor to initialize a person with an ID, first name, last name, and email.
    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    //Getter method to retrieve the person's ID.
    public int getId() {
        return id;
    }
    
    //Getter method to retrieve the person's full name.
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
