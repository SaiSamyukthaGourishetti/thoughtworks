import java.util.*;

public class Movie {
    private String title;
    private String studio;
    private String rating;
    public Movie(String title,String studio,String rating)
    {
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    public Movie(String title,String studio)
    {
        this.title=title;
        this.studio=studio;
        rating="PG";
    }
    public Movie[] getPG(Movie arrayOfMovies[])
    {
        ArrayList<Movie> ratingPG=new ArrayList<>();
        for(Movie movie:arrayOfMovies)
            if (movie.rating.startsWith("PG"))
                ratingPG.add(movie);
            return ratingPG.toArray(new Movie[0]);
    }
    public static void main(String args[])
    {
        Movie movie1=new Movie("Casino Royale","Eon Productions","PG-13");
        Movie movie2=new Movie("Daddy","Geetha Arts","PG");
        Movie movie3=new Movie("Turbo","DreamWorks Animation","xxx");
        Movie movie4=new Movie("Notebook","Cine1 Studios");
        Movie arrayOfMovies[]={movie1,movie2,movie3,movie4};
        Movie[]pgMovies=movie1.getPG(arrayOfMovies);
        for(Movie m:pgMovies)
            System.out.println(m.title+"-"+m.rating);

    }

}

