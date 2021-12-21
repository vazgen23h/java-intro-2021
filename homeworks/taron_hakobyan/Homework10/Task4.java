
class Movie {
    String title;
    String studio;
    String rating;

    Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
}

public class Task4 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Tor", "Marvel", "4.3");
        Movie movie2 = new Movie("Casino Royale", "Eon Productions", "PG - 13");
        Movie movie3 = new Movie("Iron Man", "Marvel", "");
    }
}