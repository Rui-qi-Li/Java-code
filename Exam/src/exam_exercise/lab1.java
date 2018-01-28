/*Lab 1 Solution - Luhn's Algorithm 
行用卡问题
1. the rightmost digit is the check digit -- "x"

2. Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits 
to get a single-digit number (or subtract by 9)
4 * 2 = 8
1 * 2 = 2
6 * 2 = 12 (1 + 2 = 3 or 12 - 9 =3)

3. Now add all single-digit numbers from Step 2.
4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37

4. add the result and the check digit.

5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is invalid.
*/
package exam_exercise;
import java.util.*;
public class lab1 {
	public static void mian(String[]arg)throws Exception {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int total = 0;
		
		//double every second digit, from rightmost.
		//the rightmost digit is check digit
		for(int i =0;i<n.length()-1;i++) {//排除最右的长度
			int d = Integer.parseInt(""+n.charAt(n.length()-2-i));//[0]: length-2, i:递减用
			if(i%2==0)//every second 0,2,4...
				d *= 2;
			if(d > 9)
				d -= 9;
			total+=d;
		}
		//add the right most check digit 
		if(total+Integer.parseInt(""+n.charAt(n.length()-1))%10==0)
			System.out.println("VALID");
		else
			System.out.println("INVALID");
		
	}
}