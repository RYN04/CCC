package I2021I;
import java.util.*;
import java.io.*;
public class GoodGroups
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] n = new int[3];
		n[0] = Integer.parseInt(in.readLine());
		ArrayList<ArrayList<String>> con1 = new ArrayList<>();
		if (n[0] > 0)
		{
			for (int i = 0; i < n[0]; i++)
			{
				con1.add(new ArrayList<>());
				StringTokenizer line1 = new StringTokenizer(in.readLine());
				con1.get(i).add(line1.nextToken());
				con1.get(i).add(line1.nextToken());
			}
		}
		n[1] = Integer.parseInt(in.readLine());
		ArrayList<ArrayList<String>> con2 = new ArrayList<>();
		if (n[1] > 0)
		{
			for (int i = 0; i < n[1]; i++)
			{
				con2.add(new ArrayList<>());
				StringTokenizer line2 = new StringTokenizer(in.readLine());
				con2.get(i).add(line2.nextToken());
				con2.get(i).add(line2.nextToken());
			}
		}
		n[2] = Integer.parseInt(in.readLine());
		ArrayList<ArrayList<String>> res = new ArrayList<>();
		for (int i = 0; i < n[2]; i++)
		{
			res.add(new ArrayList<>());
			StringTokenizer line3 = new StringTokenizer(in.readLine());
			res.get(i).add(line3.nextToken());
			res.get(i).add(line3.nextToken());
			res.get(i).add(line3.nextToken());
		}
		int count = 0;
		for (int i = 0; i < n[2]; i++)
		{
			for (int j = 0; j < con1.size(); j++)
			{
				if (res.get(i).contains(con1.get(j).get(0)))
				{
					if (res.get(i).contains(con1.get(j).get(1)))
					{

					}
					else
					{
						count++;
						con1.remove(j);
						j--;
					}
				}
				else if (res.get(i).contains(con1.get(j).get(1)))
				{
					if (res.get(i).contains(con1.get(j).get(0)))
					{

					}
					else
					{
						count++;
						con1.remove(j);
						j--;
					}
				}
			}
			for (int j = 0; j < con2.size(); j++)
			{
				if (res.get(i).contains(con2.get(j).get(0)))
				{
					if (res.get(i).contains(con2.get(j).get(1)))
					{
						count++;
						con2.remove(j);
						j--;
					}
				}
			}
		}
		System.out.println(count);
	}
}