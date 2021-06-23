import java.io.*;
class Result
{
	static int addNumbers(float x, float y)
	{
		// code
		return (int)(x+y);
	}
}

public class Add_2f_result{
public static void main(String[] args) throws Exception
{
	BufferedReader obj = 
	new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 2 Numbers :");
	float a = Float.parseFloat(obj.readLine() ); // 10
	float b = Float.parseFloat(obj.readLine() );  // 20
	int c = Result.addNumbers( a,  b);
	System.out.println("Sum = "+ c);
} }
