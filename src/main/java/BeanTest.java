import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {

        Album album1 = new Album("Beyonce", "Lemonade",2013, 13.5f, "pop");

        Album album2=new Album("kodak black", "lil big pac",2015, 10.2f, "rap");

        ArrayList<Album> albums= new ArrayList<>(List.of(album1,album2));

//        Author author1= new Author("Reginald", "Graham");

//        Author author2 = new Author("Reggie","Gram");

        Quote quote1 = new Quote(new ArrayList<>(List.of(new Author("Reginald","Graham"))),"to be or not to be");

        Quote quote2 = new Quote(new ArrayList<>(List.of(new Author("Reggie","Gram"))),"a man without purpose distracts himself with pleasure");

        ArrayList<Quote> quotes=new ArrayList<>(List.of(quote1,quote2));

        for (Quote quote : quotes){
            for(Author author: quote.getAuthors()){
                System.out.println("the author is "+ author.getFirstName() +" "+ author.getLastname() +" the quote is " + quote.getContent());
            }
        }

        for (Album album : albums) {
            System.out.println(album.getName());
        }

    }
}
