package bg.smg;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book();
        book.setTitle("Title1");


        Price price = new Price();
        price.setValue(35.5);
        price.setCurrency(PriceCurrency.BGN);

        book.setPrice(price);

        Author author = new Author();
        author.setName("Ime1");

        book.setAuthor(author);
Book book2=(Book) book.clone();

    }
}
