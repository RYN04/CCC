package I2020I;
import java.util.*;
import java.io.*;
public class S1 
{
	static int[][]f;
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		f = new int[n][2];
		for (int i = 0; i < n; i++)
		{
			StringTokenizer line = new StringTokenizer(in.readLine());
			f[i][0] = Integer.parseInt(line.nextToken());
			f[i][1] = Integer.parseInt(line.nextToken());
		}
		java.util.Arrays.sort(f, (int[] a, int[] b) -> Integer.compare(a[0], b[0]));
		double mS = 0;
		for (int i = 1; i < f.length; i++)
		{
			double k = (1.0 * (Math.abs(f[i][1] - f[i-1][1]))) / (1.0 * (f[i][0] - f[i-1][0]));
			if (k > mS) mS = k;
		}
		System.out.print(mS);
	}
}
