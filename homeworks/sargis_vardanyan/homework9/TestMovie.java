package homework9;

/*
  The class Movie is started below. An instance of class Movie represents a film.
*/

public class TestMovie {

	public static void main(String[] args) {
		
		Movie movie1 = new Movie();
		Movie movie2 = new Movie("Casino Royale", "Eon Productions", "PG - 13");
		Movie movie3 = new Movie("Iron Man", "Marvel studios");
		
		System.out.print("Movies with the rationg of PG: ");	
		Movie.printMovies(Movie.getPG(movie1, movie2, movie3));
		
	}

}

class Movie {

	String title;
	String studio;
	String rating;
	
	Movie() {
		title = "unknown";
		studio = "unknown";
		rating = "unknown";
	}
	
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
	
	static Movie[] getPG(Movie ... movies) {
		int length = 0;
		
		for (int i = 0; i < movies.length; i++) {
			if (movies[i].rating.equals("PG")) {
				length++;
			}
		}
	
		Movie[] pgMovies = new Movie[length];
		
		for (int i = 0, j = 0; i < movies.length; i++) {
			if (movies[i].rating.equals("PG")) {
				pgMovies[j++] = movies[i]; 
			}
		}
		
		return pgMovies;
	}
	
	static void printMovies(Movie ... movies) {
		for (int i = 0; i < movies.length; i++){
			System.out.print(movies[i].title + ", ");
		}
		System.out.println();
	} 
	

}
