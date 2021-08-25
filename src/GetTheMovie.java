import java.util.Random;

public class GetTheMovie {
    public Movies movie = new Movies();
    public Random number = new Random();
    public String s;
    public int randomNumber = number.nextInt(movie.movies.length);
    int size = movie.movies[randomNumber].length();

    public char[] gettingMovie(){
//        System.out.println(randomNumber);
        char[] ans = new char[size];
        s = movie.movies[randomNumber];
        for(int i=0;i<size;i++){
            if(s.charAt(i)!=' '){
                ans[i] = '_';
            }
            else{
                ans[i]=' ';
            }
        }
        return ans;
    }
    public int movieLength(){
        int size = movie.movies[randomNumber].length();
        return size;
    }



}
