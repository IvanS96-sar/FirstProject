package maximaDz;

public class Library {
    public static void main(String[] args) {
        Author author = new Author("Айн","Рэнд");
        Author author2 = new Author("Фил","Найт");
        Book book = new Book("Атлант расправил плечи",author,1957);
        Book book2 = new Book("Продавец обуви",author2,2016);
        System.out.println(author);
        System.out.println(author2);
        System.out.println();
        System.out.println(book);
        System.out.println(book2);
        book.setYear(2010);
        System.out.println(book);
    }
}
