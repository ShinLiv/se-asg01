import java.io.*;

public class nhap
{
	public static void main(String[] ars) throws Exception
	{
		BufferedReader inra = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name:\t");
		String name;
		name = inra.readLine();
		System.out.println("Hello, "+name);
	}
}