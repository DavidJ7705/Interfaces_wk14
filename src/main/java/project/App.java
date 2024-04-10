package project;

import ie.atu.*;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // ArrayList of Songs objects
        ArrayList<Songs> musicArray = new ArrayList<>();

        // Music items
        musicArray.add(new Songs("What", "David"));
        musicArray.add(new Songs("another song", "david"));
        // add more music items here if needed

        // Displaying details
        for (Songs music : musicArray) {
            System.out.println("\nSong Name: " + music.getName());
            System.out.println("Artist: " + music.getArtist());
        }
    }
}