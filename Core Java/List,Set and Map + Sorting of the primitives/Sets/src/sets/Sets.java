package sets;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet; //TreeSet maintains a sorting order and therefore class has to implement Comparable Interface

class Book implements Comparable<Book>
{
	private String name;
	private int id;
	private String author;
	
	Book(int id,String name,String author)
	{
		this.id = id;
		this.name = name;
		this.author = author;
	}

	@Override
	public int compareTo(Book o) { //sorting the Set in ascending order according to author name
		if(author.compareTo(o.author)>0) {
			return 1;
		}
		else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + ", author=" + author + "]";
	}
	
}

public class Sets {

	public static void main(String[] args) {
		Set<Book> books = new TreeSet<Book>();
        books.add(new Book(1,"Java","ABC"));
        books.add(new Book(2,"Python","GHI"));
        books.add(new Book(3,"C++","DEF"));
        
        Iterator<Book> iterator = books.iterator();
        while(iterator.hasNext())
        {
        	Book b = iterator.next();
        	System.out.println(b);
        }
        
	}

}
