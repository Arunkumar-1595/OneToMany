package com.Book.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Book.Entity.BookEntity;
import com.Book.Service.BookService;

@RestController
@RequestMapping(value = "/book")
public class BookController {
	@Autowired
	BookService bs;
	
    @PostMapping(value = "/post")
	public String post(@RequestBody BookEntity a) {
		return bs.post(a);
	}
    
    @PostMapping(value = "/postAll")
	public String postAll(@RequestBody List<BookEntity> b) {
		return bs.postAll(b);
	}
    
    @GetMapping(value = "/getObjById/{a}")
    public BookEntity getObjById(@PathVariable int a) {
    	return bs.getObjById(a);
    }
    
/*    @GetMapping(value = "/getObjById/{c}/{d}")
    public String getObjById(@PathVariable String c, @PathVariable String d) {
    	List<Book> books=bs.getObjById(c,d);
    	for(Book x: books) {
    		if(x.getName(c).getAutherName(d)) {
    		}
    	}
    }*/

}
