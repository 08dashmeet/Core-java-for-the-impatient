package ChapterCollection.ChapterLInkedLIsst;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedl {

    public static void main(String args[]) {

        LinkedList<Book> li = new LinkedList<>();
        Book b1 = new Book(001, "Harry Potter1", "J.K Roling", 345.78);
        Book b2 = new Book(002, "Harry Potter2", "J.K Roling", 450.43);
        Book b3 = new Book(003, "Harry Potter3", "J.K Roling", 500.56);
        Book b4 = new Book(004, "Harry Potter4", "J.K Roling", 600.456);

        li.add(b1);
        li.add(b2);
        li.add(b3);
        li.add(b4);


        Iterator<Book> b = li.iterator();
        while (b.hasNext()) {

            Book d = b.next();
            System.out.println(d.sno+" "+d.Author_name+" "+d.book_name+" "+d.price);
        }

        int l = b1.hashCode();
        System.out.println(l);
    }
}