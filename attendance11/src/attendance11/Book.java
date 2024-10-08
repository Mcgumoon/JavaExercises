package attendance11;

import java.util.*;

public record Book(String tittle, String author, int year) implements Comparable<Book>{
	@Override
	public int compareTo(Book otherBook) {
		return Integer.compare(year, otherBook.year);
	}
	
	@Override
	public String toString() {
		return "Book: year = " + year;
	}
	public static void main(String[] args) {
		Book[] book = {new Book("tittle 1", "author 1", 2010), new Book("tittle2", " author2", 1901)};
		
		Arrays.sort(book);
		
		System.out.println(Arrays.toString(book));
	}
}
