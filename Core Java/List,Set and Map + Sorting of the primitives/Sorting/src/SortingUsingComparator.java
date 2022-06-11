import java.util.Comparator; //Sort collections on the basis of multiple elements
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class Book<K,V> //using generics
{
	private K key;
	private V value;
	public Book(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Book [key=" + key + ", value=" + value + "]";
	}
	
}
public class SortingUsingComparator {

	public static void main(String[] args) {
		Comparator<Book<Integer,String>> COMPARE_KEY = new Comparator<Book<Integer,String>>()
				{

					@Override
					public int compare(Book<Integer, String> o1, Book<Integer, String> o2) {
						if(o1.getKey()>o2.getKey())
						{
							return 1;
						}
						else if(o2.getKey()>o1.getKey())
						{
							return -1;
						}
						else
						{
							return 0;
						}
					}
			
				};

				
			Map<Book<Integer,String>,String> map = new TreeMap<>(COMPARE_KEY);
			map.put(new Book(2,"Harry Potter Chamber"),"JK Rowling");
			map.put(new Book(5,"Harry Potter Phoenix"),"JK Rowling");
			map.put(new Book(4,"Harry Potter Goblet"),"JK Rowling");
			map.put(new Book(3,"Harry Potter Azkaban"),"JK Rowling");
			map.put(new Book(1,"Harry Potter Stone"),"JK Rowling");
			for(Map.Entry<Book<Integer, String>, String> e:map.entrySet())
			{
				System.out.println(e.getKey()+" "+e.getValue());
			}
	}

}
