import java.util.Scanner;

public class MainActivity{

    public static void main(){


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favorite genre of movie? ");
        String favoriteGenre = scanner.nextLine();

        System.out.println("What is your favorite movie");
        String favoriteMovie = scanner.nextLine();

        Recommendation.recommendMovie(favoriteGenre, favoriteMovie);

        scanner.close();

    }

}