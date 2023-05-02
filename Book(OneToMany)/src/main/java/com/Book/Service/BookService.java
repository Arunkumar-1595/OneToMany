package com.Book.Service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Book.Dao.BookDao;
import com.Book.Entity.BookEntity;

@Service
public class BookService {
	@Autowired
	BookDao bd;

	public String post(BookEntity a) {
		// TODO Auto-generated method stub
		return bd.post(a);
	}

	public String postAll(List<BookEntity> b) {
		// TODO Auto-generated method stub
		return bd.postAll(b);
	}

	public BookEntity getObjById(int a) {
		// TODO Auto-generated method stub
		return bd.getObjById(a);
	}

//	public List<BookEntity> getObjById(String c, String d) {
//		// TODO Auto-generated method stub
//		return bd.getObjById(c,d);
//	}

}
