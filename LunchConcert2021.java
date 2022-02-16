package I2021I;
import java.util.*;
import java.io.*;
public class LunchConcert 
{
	static int[][] f;
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		f = new int[n][3];
		int low = Integer.MAX_VALUE;
		int high = 0;
		for (int i = 0; i < n; i++)
		{
			StringTokenizer line = new StringTokenizer(in.readLine());
			f[i][0] = Integer.parseInt(line.nextToken());
			f[i][1] = Integer.parseInt(line.nextToken());
			f[i][2] = Integer.parseInt(line.nextToken());
			if (f[i][0] > high)
			{
				high = f[i][0];
			}
			if (f[i][0] < low)
			{
				low = f[i][0];
			}
		}
		int mid = 0;
		long s = 0;
		while (low <= high)
		{
			mid = (low + high) / 2;
			s = getScore(mid);
			long sLeft = getScore(mid - 1);
			long sRight = getScore(mid + 1);
			if (s < sRight && s < sLeft)
			{
				break;
			}
			if (s == sRight || s == sLeft)
			{
				break;
			}
			if (s < sRight)
			{
				high = mid -1;
			}
			else if (s < sLeft)
			{
				low = mid + 1;
			}
		}
		System.out.println(s);
	}
	public static long getScore(int p)
	{
		long out = 0;
		for (int[] i : f)
		{
			long walk = Math.abs(p-i[0]) - i[2];
			if (walk > 0)
			{
				out += walk * i[1];
			}
		}
		return out;
	}
}
