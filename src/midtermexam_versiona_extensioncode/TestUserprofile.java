/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.*;

/**
 *
 * @author Eric Muir
 */
public class TestUserprofile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter in a Username: ");
        String name = input.nextLine();
        
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        
        for(int i = 0; i < genres.length; i++){
            System.out.println("Genre: " + genres[i]);
        }
        
        System.out.println("Pick your favourite movie genre: ");
        String favGenre = input.nextLine();
        
        UserProfile user = new UserProfile(name, favGenre);
        
        System.out.println("Your user profile was created! \nWelcome: " + name);
    }
}
