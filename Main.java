import java.util.Scanner;

public class Main {

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
