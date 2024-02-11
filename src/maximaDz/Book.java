package maximaDz;

public class Book {
    private String nameBook;
    private Author author;
    private Integer year;

    public Book(String nameBook, Author author, Integer year) {
        this.nameBook = nameBook;
        this.author = author;
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {

        return "Наименование книги: " + nameBook +
                ". " + author +
                ". Год публикации: " + year;
        }

}
