package mongodbexample.controller;

import mongodbexample.models.Book;
import mongodbexample.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepo;
@PostMapping("/addbook")
    public  String saveBook(@RequestBody Book book){
        bookRepo.save(book);
        return "Added book with id:"+book.getId();
    }

    @GetMapping("/findAllBooks")
    public List<Book> getBooks(){
    return bookRepo.findAll();
    }
    @PutMapping("/update/{id}")
    public String editBook(@PathVariable int id,@RequestBody Book book){
        bookRepo.save(book);
        return "book got updated:"+book.getId();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
    bookRepo.deleteById(id);
    return "book got deleted:"+id;
    }





}
