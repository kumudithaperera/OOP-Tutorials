package tut2;

public class Test {


    public static void main(String[] args) {
        // Test constructor
        Director director = new Director("James", "Cameron");

        Date dob = new Date(16, 8, 1954);
        director.setDateOfBirth(dob);
        director.setNumberOfMoviesDirected(23);
        //System.out.println(director); // toString()
        System.out.println("name is: " + director.getName());
        System.out.println("surname is: " + director.getSurName());
        System.out.println("dob is: " + director.getDateOfBirth().getDate());
        System.out.println("number of directed movies is: " +
                director.getNumberOfMoviesDirected());

        //System.out.println(director);

        Movie movie = new Movie("Avatar", "Fantasy",director);
        //System.out.println(movie); // Movie's toString()
        // Test Setters and Getters
        movie.setNumberOfAwards(23);
        //System.out.println(movie); // Book's toString()
        System.out.println("title is: " + movie.getTitle());
        System.out.println("category is: " + movie.getCategory ());
        System.out.println("name of director is: " + movie.getDirector().getName());
        System.out.println("surname of director is: " + movie.getDirector().getSurName());
        System.out.println("number of awards is " + movie.getNumberOfAwards());

        //System.out.println(movie);

        int x=5;
        //System.out.println(x);
        //System.out.println(-x);
    }
}
