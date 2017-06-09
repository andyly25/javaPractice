import static java.lang.Math.pow;

public class j07_basicArithmetics
{
	public static void main(String[] args)
	{
		int i, j, k;
		double p = u = y = 0;
		i = 5;
		j = 3;
		k = 7;
		System.out.println("letters are : p = " + p + ", u = " + u + ", y = " + y +
			", i = " + i + ", j = " + j + ", k = " + k); 
			
		// just realized to the power is not **, need to use Math.pow so import the above
		p = Math.pow(i,j);
		u = k/j;
		y = k%j;
		i += 3;
		j *= 2;
		k -= 1;
		
		/* 
			Some things to note:
			i =- 3 means to set i = to negative 3
			i =+ 3 means to set i = to positive 3
			some tricks of i++ increments i by 1 and i-- decreases by 1
			you can even do p = u = y = 0 all at once
		*/
		
		System.out.println("letters are now: p = " + p + ", u = " + u + ", y = " + y +
			", i = " + i + ", j = " + j + ", k = " + k); 
	}
}