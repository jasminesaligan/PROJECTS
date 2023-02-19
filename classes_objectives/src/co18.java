// Write a program that takes user input using Scanner 
// class to create an array of objects of class 'Movie'. 
// The Movie class should have title, director, and release year 
// as its attributes. The program should print out the details 
// of all the movies and sort them by release year.

import java.util.Scanner;
import java.util.Arrays;

class Movie implements Comparable<Movie> {
    private String title;
    private String director;
    private int releaseYear;

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String toString() {
        return title + " (" + releaseYear + ") - directed by " + director;
    }

    public int compareTo(Movie other) {
        return Integer.compare(this.releaseYear, other.releaseYear);
    }
}

public class co18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many movies do you want to enter? ");
        int n = input.nextInt();
        input.nextLine(); // consume the remaining newline

        Movie[] movies = new Movie[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for movie #" + (i+1) + ":");
            System.out.print("Title: ");
            String title = input.nextLine();
            System.out.print("Director: ");
            String director = input.nextLine();
            System.out.print("Release year: ");
            int releaseYear = input.nextInt();
            input.nextLine(); // consume the remaining newline

            movies[i] = new Movie(title, director, releaseYear);
        }

        Arrays.sort(movies);

        System.out.println("All movies:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
