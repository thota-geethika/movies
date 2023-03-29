
import java.util.ArrayList;

class movie {

    private final String title;
    private final String studio;
    private final String rating;

    movie(String title, String studio, String rating)
    {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    movie(String title, String studio)
    {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

    ArrayList<String> getPg(ArrayList<movie> moviesInstances)
    {
        ArrayList<String> movieNames = new ArrayList<>();
        for(movie iterator : moviesInstances)
        {
            if(iterator.rating.equals("PG"))
            {
                movieNames.add(iterator.title);
            }
        }
        return movieNames;
    }

}

public class Movies {
    public static void main(String[] args) {
        movie film1 = new movie("Casino Royale","Eon Productions", "PG-13");
    }
}