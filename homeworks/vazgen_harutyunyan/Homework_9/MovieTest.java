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
        rating = "PG";
    }
    Movie[] getPG(Movie[] movie) {
        int countOfPG = 0;
        for(int i = 0; i < movie.length; i++) {
            if(movie[i].rating.equals("PG")) {
                countOfPG++;
            }
        }
        Movie[] movieWithPG = new Movie[countOfPG];
        int index = 0;
        for(int i = 0; i < movie.length; i++) {
            if(movie[i].rating.equals("PG")) {
                movieWithPG[index] = movie[i];
                index++;
            }
        }
        return movieWithPG;
    }
}

public class MovieTest {
    public static void main(String[] args) {
        Movie movie = new Movie("Casino Royal", "Eon Productions", "PG 13");

    }
}