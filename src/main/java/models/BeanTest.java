package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeanTest {


    public static void main(String[] args) {
        Album album = new Album();
        Album anotherAlbum= new Album();
        Album thirdAlbum = new Album();


        Author author = new Author(1, "Bill", "Sampsonite");
        Author anotherAuthor= new Author(2, "Abe", "Lincoln");
        Author thirdAuthor = new Author(3, "Scooby", "Doo");


        Quote quote = new Quote(1, "Heres a quote", author);
        Quote anotherQuote= new Quote(2, "I said that?", anotherAuthor);
        Quote thirdQuote = new Quote(3, "Ruh roh", thirdAuthor);


        System.out.println("Quote 1 author= " + quote.getAuthor().getFirstName());

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote);
        quotes.add(anotherQuote);
        quotes.add(thirdQuote);


        
        for (Quote saying: quotes) {
            System.out.println(saying.getContent() + " - " + saying.getAuthor().getFirstName());
            System.out.println(saying.getAuthor().getLastName());

//            System.out.println(saying);
        }


        System.out.println(Arrays.asList(quotes) + " = asList");
    }
}
