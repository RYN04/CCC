package I2021I;
import java.util.*;
import java.io.*;
public class CrazyFencing2021
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int[] x = new int[n+1];
		int[] y = new int[n];
		StringTokenizer line1 = new StringTokenizer(in.readLine());
		StringTokenizer line2 = new StringTokenizer(in.readLine());
		for (int i = 0; i < x.length; i++)
		{
			x[i] = Integer.parseInt(line1.nextToken());
			if (i < y.length)
			{
				y[i] = Integer.parseInt(line2.nextToken());
			}
		}
		double sum = 0;
		for (int i = 0; i < y.length; i++)
		{
			sum += y[i] * (x[i] + x[i+1]) / 2.0;
		}
		System.out.println(sum);
	}
}
