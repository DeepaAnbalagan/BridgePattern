package bridgepattern;

public class BridgeDemoSample{
    public static void main(String args[]){

        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setDuration("2.15");
        movie.setYear("2014");
        PrintFormatter formatter = new PrintFormatter();
        MoviePrinter moviePrinter = new MoviePrinter(movie);
        String printMaterial = moviePrinter.print(formatter);
        System.out.println(printMaterial);

    }
}