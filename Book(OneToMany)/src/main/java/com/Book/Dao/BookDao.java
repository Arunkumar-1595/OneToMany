package com.Book.Dao;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Book.Entity.BookEntity;
import com.Book.Repository.BookRepository;

@Repository
public class BookDao {
	@Autowired
	BookRepository br;

	public String post(BookEntity a) {
		// TODO Auto-generated method stub
		br.save(a);
		return "Data saved";
	}

	public String postAll(List<BookEntity> b) {
		// TODO Auto-generated method stub
	    br.saveAll(b);
	    return "All data saved";
	}

	public BookEntity getObjById(int a) {
		// TODO Auto-generated method stub
		return br.findById(a).get();
	}

	/*public List<BookEntity> getObjById(String c, String d) {
		// TODO Auto-generated method stub
		return br.findAll();
	}*/

}
