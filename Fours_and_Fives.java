package I2021I;
import java.util.*;
import java.io.*;
public class Fours_and_Fives 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		System.out.println(check(n));
	}
	private static int check(int n)
	{
		int count = 0;
		int x = n / 5;
		for (int i = 0; i < x + 1; i++)
		{
			if (((n - (5 * i)) % 4 == 0))
			{
				count++;
			}
		}
		return count;
	}
}