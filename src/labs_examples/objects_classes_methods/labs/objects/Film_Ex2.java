package labs_examples.objects_classes_methods.labs.objects;

public class Film_Ex2 {
    public static void main (String[] args){
        Movie myMovie = new Movie();
        myMovie.title = "Iron Man";
        myMovie.genre = "Action";
        myMovie.yearRel = 2008;

        myMovie.printMovie();

    }
}
class Genre {
    String genre;
    public Genre(String genre) {
        this.genre = genre;
    }
}
class Year {
    int yearRel;
    public Year(int yearRel) {
        this.yearRel = yearRel;
    }
}
class Movie{
    String title;
    String genre;
    int yearRel;
    public String printMovie(){
        System.out.println(this.title + " is a " + this.genre +
                " movie, released in " + this.yearRel + ".");
        return null;
    }

}