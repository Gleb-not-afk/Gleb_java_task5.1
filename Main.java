import java.util.Scanner;

public class Main {
    public static class Book{
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

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги:");
        String title = scanner.nextLine();

        System.out.println("Введите год выпуска:");
        int releaseYear = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите автора:");
        String author = scanner.nextLine();

        System.out.println("Введите количество страниц:");
        int pages = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите слово:");
        String word = scanner.nextLine();

        Book book = new Book(title, releaseYear, author, pages);

        System.out.println("Является ли книга большой? " + Book.isBig(pages));
        System.out.println("Содержит ли книга введённое слово? " + Book.matches(title, word));
        System.out.println("Цена книги в рублях:  " + Book.estimatePrice(pages));
    }
}
