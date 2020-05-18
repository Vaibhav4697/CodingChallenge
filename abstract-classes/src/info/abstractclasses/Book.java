package info.abstractclasses;

public abstract class Book {

	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	abstract void display();

}
