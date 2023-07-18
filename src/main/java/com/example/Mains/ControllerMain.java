package com.example.Mains;
import com.example.Mains.meta.book;
import com.example.Mains.meta.bookController;
import com.example.Mains.Repositories.Repo;
import com.example.Mains.entities.users;
import java.lang.Iterable;
//import org.springframework.stereotype.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
@RestController
public class ControllerMain{
  //@RequestMapping(value="/book",method=RequestMethod.GET)
 // @ResponseBody
  private final Repo repository;
  @Autowired
  public ControllerMain(Repo repository){
    this.repository=repository;
  }
  @Autowired
  private bookController b_cont;
  
  @GetMapping("/books")
  public List<book> getPage(){
     book b= new book();
     b.setName("Harry Porter");
     b.setId(123);
     return this.b_cont.getBooks();
  }
  @GetMapping("/books/{id}")
  public book getById(@PathVariable("id")int id){
    return this.b_cont.getbookById(id);
  }
  @PostMapping("/add/book")
  public book add(@RequestBody book b){
   return this.b_cont.addBook(b);
  }
  @GetMapping("/database")
  public List<users> getList(){
    return this.repository.fetchAll();
  }
  @PostMapping("/database/add")
  public users addUser(@RequestBody users u){
     this.repository.save(u);
     return u;
  }
  @GetMapping ("/database/delete/{id}")
  public String delete(@PathVariable("id") int id){
    this.repository.deleteById(id);
    return "Success";
  }
 @GetMapping ("/database/Get/{name}")
  public List<users> Get(@PathVariable("name") String name){
    return this.repository.findByName(name);
  }
  
}