package ChapterCollection.ChapterLInkedLIsst;

import java.util.*;

 class Book{
    int sno ;
    String book_name,Author_name ;
    double price;

    Book(int s,String bname,String Aname,double p){
        sno = s;
        book_name=bname;
        Author_name = Aname;
        price = p;
     }

   /* @Override
    public String  toString() {
        return  "Sno : " + this.sno+" BookName : "+this.book_name+" Author : "+this.Author_name+"  Price : "+this.price;
    }*/
}

