import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
class Movie_Details {
	String movie_Name;
	String Hero;
	String Villain;
	String Genre;

	public Movie_Details(String movie_Name, String hero, String villain, String genre) {
		super();
		this.movie_Name = movie_Name;
		Hero = hero;
		Villain = villain;
		Genre = genre;
	}

	public String getMovie_Name() {
		return movie_Name;
	}

	public void setMovie_Name(String movie_Name) {
		this.movie_Name = movie_Name;
	}

	public String getHero() {
		return Hero;
	}

	public void setHero(String hero) {
		Hero = hero;
	}

	public String getVillain() {
		return Villain;
	}

	public void setVillain(String villain) {
		Villain = villain;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	@Override
	public String toString() {
		return "Movie_Details [movie_Name=" + movie_Name + ", Hero=" + Hero + ", Villain=" + Villain + ", Genre="
				+ Genre + "]";
	}

}

public class Movie 
{
	public static void main(String[] args) {

		List<Movie_Details> movie = Arrays.asList(new Movie_Details("Mast", "chichore", "jack", "Action"),
				new Movie_Details("frozen", "alien", "kitty", "thriller"));
				
		Collections.sort(movie, new Comparator<Movie_Details>() {

			@Override
			public int compare(Movie_Details o1, Movie_Details o2) {
				return o1.movie_Name.compareTo(o2.movie_Name);

			}

		});

		printallmovie(movie);
		remove_movie(movie, "Mersal");

	}

	private static void printallmovie(List<Movie_Details> movie) {
		for (Movie_Details p : movie)
			System.out.println(p);
	}

	public static void remove_movie(List<Movie_Details> movie, String name) {
		movie.remove(name);
	}

}

	

