public class Book{
    String title;
    int releaseYear;
    String author;
    int pages;

    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public static boolean isBig(int pages){
        if (pages > 500){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean matches(String title, String word){
        if (title.contains(word)){
            return true;
        }
        else{
            return false;
        }
    }
    public static int estimatePrice(int pages){
        if (pages * 3 < 250){
            return 250;
        }
        else{
            return (pages * 3);
        }
    }
}
