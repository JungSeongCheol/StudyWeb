import java.io.*;

public class InstanceApp{
	
	public static void main(String[] args) throws IOException {
		
		PrintWriter p1 = new PrintWriter("result1.text");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.text");
		p2.write("Hello 2");
		p2.close();
		System.out.println(p1.toString());
		p2.toString();
		p2.write("Hello 2");
		
//		PrintWriter.writer("result1.txt", "Hello 1");
//		PrintWriter.writer("result2.txt", "Hello 2");
	}
	
}