package semana_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reads_a_file {

	public static void main(String[] args) {
		new Reads_a_file();
	}
	
	public Reads_a_file() {
		super();
		File file = new File("../ciber_security.txt");
		
		try (Scanner reader = new Scanner(file)) {
			int nbr = 0;
			while (reader.hasNextLine()) {
				System.out.println(String.format("%04d - %S", ++nbr, reader.nextLine()));
			}
		} catch (FileNotFoundException e) {
			System.out.println(String.format("File not found: %s.",file.getName()));
			
		}
		
	}

}
