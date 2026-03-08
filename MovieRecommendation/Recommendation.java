public class Recommendation{
    public static recommendMovie(){
        ArrayList<List<String>> genreList = new ArrayList<>();

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

        genreList.add(comedy);
        genreList.add(action);
        genreList.add(drama);
        genreList.add(animation);

        for (genre : genreList){
            if genre == favoriteGenre{
                System.out.println("I would recommend" genre)
        }   else if genre == favoriteMovieGenre{
            System.out.println("I would recommend" genre)
        }   else return
        

    }

    }
}