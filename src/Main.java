import java.util.*;

public class Main {

    public static void main(String[] args){
        Movies movies = new Movies();

        char[] movie = new char[movies.movies.length];
        GetTheMovie getTheMovie = new GetTheMovie();
        movie = getTheMovie.gettingMovie();
        int movieLength = getTheMovie.size;
        String realMovie = getTheMovie.s;
        int life =10;
        Scanner input = new Scanner(System.in);
        System.out.println(movie);
        String wrongLetter ="";
        while(life>0){
            System.out.print("You are guessing: ");
            char userInput = input.next().charAt(0);
            boolean check =false;
            for(int i=0;i<movieLength;i++){
                if(userInput == realMovie.charAt(i)){
                    movie[i] = userInput;
                    check =true;
                }
            }
            System.out.println(movie);
            if(!check){
                boolean contain = false;
                for(int i=0;i<wrongLetter.length();i++){
                    if(wrongLetter.charAt(i)==userInput){
                        contain=true;
                    }
                }
                if(!contain){
                    wrongLetter+=(" " + userInput);
                    life--;
                }
            }
            boolean win = true;
            for(int i=0;i<movieLength;i++){
                if(movie[i] == '_'){
                    win =false;
                }
            }
            if(win){
                System.out.println("You Win");
                return;
            }
            System.out.println("You have guessed (" + (10-life) + ") wrong letters: " + wrongLetter);
        }
        System.out.println("You Loose 😔😔😔");
    }


}
