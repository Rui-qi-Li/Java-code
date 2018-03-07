package prime;

public class isPrime{
	public static void main(String[]arg) {
		
		int n = 100;
		boolean result;
		
		//check a certain number
		result = isPrime1(n);
		
		//set a prime number array -- using boolean array
		result = isPrime2(n);
		
		//set a prime number array -- using int array
		result = isPrime3(n);
		
	}
	
	public static boolean isPrime1(int n) {
		if(n == 2 || n ==3)
			return true;
		else
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i == 0)
					return false;
			}
		return true;//all the sqrt(n) have been checked
	}
	public static boolean isPrime2(int n) {
		boolean[]isPrime2 = new boolean[100];
		for(int i=2;i<isPrime2.length;i++)
			isPrime2[i] = true;
		for(int i=2;i<isPrime2.length;i++) {
			if(isPrime2[i])
				for(int k=2;i*k<isPrime2.length;k++)
					isPrime2[i*k] = false;
		}
		
		return isPrime2[n];
	}
	
	public static boolean isPrime3(int n) {
		int[]prime = new int[n];//default: 0
		for(int i=2;i<Math.sqrt(100);i++)
			if(prime[i] == 0)
				for(int j=i*i ;j<100; j+=i)//标记：倍数关系的全为非质数
					prime[j] = 1;
		return prime[n] == 0;
	}
}