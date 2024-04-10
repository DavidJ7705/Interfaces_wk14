package project;

import ie.atu.*;

public class App {
    public static void main(String[] args) {
        // array of Music objects
        Music[] musicArray = new Music[]{
                // Music items
                new Songs("What", "David"),
                new Songs("racism", "david"),
                // add more music items here if needed
        };

        // Displaying details
        for (Music music : musicArray) {
            // printing out the name and artist for each music item
            System.out.println("\nSong Name: " + music.getName());
            System.out.println("Artist: " + music.getArtist());
        }
    }
}