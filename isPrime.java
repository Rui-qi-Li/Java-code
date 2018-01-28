public class isPrime
{
	public static void main(String[] arg)
	{
		boolean[]isPrime=new boolean[100];
		for(int i=2;i<isPrime.length;i++)
		{
			isPrime[i]=true;//0,1 are not prime number,2 is the smallest prime number
		}
		for(int i=2;i<isPrime.length;i++)
		{
			if(isPrime[i])
			{
				for(int k=2;i*k<isPrime.length;k++)
				{
					isPrime[i*k]=false;
				}
			}
		}
		for(int i=0;i<isPrime.length;i++)
		{
			if(isPrime[i])
			{
				System.out.print(i+" ");
			}
		}
	}
}