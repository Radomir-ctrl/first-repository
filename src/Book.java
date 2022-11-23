import java.util.Arrays;

public class Book implements Comparable<Book> {

    String author;
    String bookName;
    Integer countOfPages;
    String genre;
    Integer subsequence;

    public Book(String author, String bookName, Integer countOfPages, String genre, Integer subsequence) {
        this.author = author;
        this.bookName = bookName;
        this.countOfPages = countOfPages;
        this.genre = genre;
        this.subsequence = subsequence;

    }

    @Override
    public int compareTo(Book book) {
        int differenceName = this.bookName.compareTo(book.bookName);
        int differenceAuthor = this.author.compareTo(book.author);
        int differenceCountOfPages = this.countOfPages - book.countOfPages;
        int differenceGenre = this.genre.compareTo(book.genre);
        int differenceSubsequence = this.subsequence - book.subsequence;
        if(differenceName != 0){
            return differenceName;
        }
        /*if(differenceAuthor != 0){
            return differenceAuthor;
        }
        if(differenceCountOfPages != 0){
            return differenceCountOfPages;
        }*/
        /*if(differenceGenre != 0){
            return differenceGenre;
        }*/
        return differenceSubsequence;

    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", countOfPages=" + countOfPages +
                ", genre='" + genre + '\'' +
                ", subsequence='" + subsequence + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("Kristofer Paolini", "Brisingr", 867, "fantasy", 3),
                new Book("Kristofer Paolini", "Eldest", 867, "fantasy", 2),
                new Book("Kristofer Paolini", "Eragon", 627, "fantasy", 1),
                new Book("Kristofer Paolini", "Heritage", 980, "fantasy", 4),
                new Book("Kristofer Paolini", "Departure", 283, "fantasy", 5)
        };
        Arrays.sort(books);
        for(int i = 0; i < books.length; i++){
            System.out.println(books[i]);
        }
    }
}
