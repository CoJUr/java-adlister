package models;

import java.util.ArrayList;

public class BeanTest {


    public static void main(String[] args) {
        Album album = new Album();
        Album anotherAlbum= new Album();
        Album thirdAlbum = new Album();


        Author author = new Author();
        Author anotherAuthor= new Author();
        Author thirdAuthor = new Author();


        Quote quote = new Quote(1, "Heres a quote", author);
        Quote anotherQuote= new Quote(2, "I said that?", anotherAuthor);
        Quote thirdQuote = new Quote(3, "Ruh roh", thirdAuthor);



        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote);
        quotes.add(anotherQuote);
        quotes.add(thirdQuote);


        for (Quote saying: quotes) {
            System.out.println(saying.getContent() + " - " + saying.getAuthor());
            System.out.println(saying);
        }
    }
}
