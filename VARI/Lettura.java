import java.util.*;
import java.io.*;

public class Lettura {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("Input.txt")).useDelimiter("\\s*;\\s*");
			PrintWriter out = new PrintWriter(new File("Output.txt"));
		
			out.println(in.next());
			out.println(in.next());
			out.println(in.next());
			
			in.close();
			out.close();
		} catch ( FileNotFoundException e ) {
			System.out.println("File non trovato..");
		}
	}
}
