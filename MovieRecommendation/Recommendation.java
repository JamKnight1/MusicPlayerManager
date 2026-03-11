import java.util.ArrayList;

public class Recommendation{

    public static void recommendMovie(String favoriteGenre, String favoriteMovie){
        
        ArrayList<String> genres = new ArrayList<>();
        genres.add("comedy");
        genres.add("action");
        genres.add("drama");
        genres.add("animation");

        ArrayList<String> comedy = new ArrayList<String>();
        comedy.add("Monty Python and the Holy Grail");
        comedy.add("The Truman Show");
        comedy.add("Airplane");

        ArrayList<String> action = new ArrayList<String>();
        action.add("Terminator 2: Judgement Day");
        action.add("Predator");
        action.add("John Wick");

        ArrayList<String> drama = new ArrayList<String>();
        drama.add("Marty Supreme");
        drama.add("Titanic");
        drama.add("All Quiet on the Western Front");

        ArrayList<String> animation = new ArrayList<String>();
        animation.add("Spider-man: Into the Spiderverse");
        animation.add("Princess Mononoke");
        animation.add("Soul");

        ArrayList<ArrayList<String>> genreList = new ArrayList<>();
        genreList.add(comedy);
        genreList.add(action);
        genreList.add(drama);
        genreList.add(animation);

        int genreIndex = -1;

      
        for(int i = 0; i < genres.size(); i++) {
            if (genres.get(i).equalsIgnoreCase(favoriteGenre)){
                genreIndex = i;
                break;
            }
        }
        if (genreIndex == -1){
            System.out.println("Sorry, I don't recognize that genre. ");
            return;
        }

        ArrayList<String> movies = genreList.get(genreIndex);

        for (String movie : movies) {
            if (!movie.equalsIgnoreCase(favoriteMovie)){
                System.out.println("I recommend: " + movie);
                return;
            }
        }
        System.out.println("You already like all the movies in this genre.");
        

    }

}