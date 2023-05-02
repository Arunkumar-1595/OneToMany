package com.Book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Book.Entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

}
