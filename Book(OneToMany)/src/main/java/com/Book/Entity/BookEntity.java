package com.Book.Entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="book_details")
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	private int rate;
	@OneToMany(targetEntity = StoryEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "bookId", referencedColumnName = "id")
	private List<StoryEntity> stories;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public List<StoryEntity> getStories() {
		return stories;
	}
	public void setStories(List<StoryEntity> stories) {
		this.stories = stories;
	}

}
