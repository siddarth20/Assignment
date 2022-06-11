import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		
		File obj = new File("Book.txt");
		try {
			if(obj.createNewFile()) {
				System.out.println("File Created "+obj.getName());
			}
			else {
				System.out.println("File already exists");
			}
			System.out.println("File path is "+obj.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Writing to a file");
		FileWriter writer = new FileWriter("Book.txt");
		writer.write("This is a good book!Stories about Harry Potter");
		writer.close();
		System.out.println("Reading from a file");
		Scanner reader = new Scanner(obj);
		if(reader.hasNextLine()) {
			System.out.println(reader.nextLine());
		}
		reader.close();
	}

}
