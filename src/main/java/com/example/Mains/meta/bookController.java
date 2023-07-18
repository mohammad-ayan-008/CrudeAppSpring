package com.example.Mains.meta;
import com.example.Mains.meta.book;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;

@Component
public class bookController{
   private static List<book> list= new ArrayList<>();
   static{
     list.add(new book(1,"Harry Porter"));
     list.add(new book(2,"Clean Code"));
     list.add(new book(3,"Mad Algorithm"));
   }
   public List<book> getBooks(){
     return list;
   }
   
   public book getbookById(int id){
     for (book b: list){
       if(b.getId()==id){
         return b;
       }
     }
     return null;
   }
   public book addBook(book b){
     this.list.add(b);
     return b;
   }
}