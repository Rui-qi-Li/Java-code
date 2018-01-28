import java.util.Scanner;

public class how2j
{
	public static void main(String [] arg)
	{
		int a=5;
		long b=6;
		int c= (int)(a+b);//a+b will be in type long, so have to transfer into tyep int
		long d=a+b;
		
		byte e=1;
		byte f=2;
		byte g= (byte)(e+f);// byte<int, but the result of calculation will be int
		
		int n=5;
		System.out.println(n++);// print: 5
		System.out.println(n);//print: 6
		
		int m=5;
		System.out.println(++m);//print: 6
		System.out.println(m);//print: 6
		
		Scanner sc=new Scanner(System.in);
		float tall=sc.nextFloat();
		System.out.println("The float number you enter is : "+tall);
		
		int aa=1;
		int bb=++aa + aa++ + ++aa + aa++ + aa++;//2+2+4+4+5=17
		System.out.println(bb);
		
		int ii=2;
		System.out.println(ii==1 & ii++==2);//no matter the result, both side will be calculated.
		System.out.println(ii);// print: 3
		
		ii=1;
		boolean h= !(ii++==3) ^ (ii++==2) && (ii++==3);// !(1==3)^(2==2)&&...
		System.out.println(h);// false
		System.out.println(ii); // 3
		
		int k=5;
		int o=6;
		String l=(Integer.toBinaryString(k));//the binary of 5 is 101
		l=Integer.toBinaryString(o);//the binary of 6 is 110 
		System.out.println(k|o);//binary calculation for every bit of 5|6 --> 111 -->7
	    System.out.println(k&o);//5&6 --> 100 -->4
		
		e=5;
		System.out.println(Integer.toBinaryString(e));
		System.out.println(~e);//5 --> 00000101 --> 111
		
		int p=3;// 11
		int q=2;// 10
		l=Integer.toBinaryString(p);
		l=Integer.toBinaryString(q);
		int result=((p|q)^(p&q));// (11^10) --> 01
		System.out.println(result);
		
		int r=1;
		r+= ++r;//r=r+(++r) --> 1+2 --> 3 (from left to right)
		System.out.println(r);
		
		p=5;
		q=6;
		k= p<q ? 99:98;
		System.out.println("k is: "+k);
		
		System.out.println("please enter a day: ");
		int day=sc.nextInt();
		// Integer.parseInt(String s);   transfrom from s to int
		// String.valueOf(int i);     transfrom from int to s
		System.out.println(a>=1 || a<=7 ? (a<=5 ? "weekdays":"weekend"):"error!");
		// (  ?  :  )will return a value back, so it can be print directly out.
		
		System.out.println("enter a number: ");
		ii=sc.nextInt();
		System.out.println("your input: "+ii);
		System.out.println("enter a string: ");
		l=sc.nextLine(); //use: take "\r\n" away
		l=sc.nextLine();
		System.out.println("your input: "+l);
		
		float f2=54.432f; // turn a double(64) into float(32),keep "f" together with the number
		String name="rachel"; // double quote
		char t='c'; // single quote
		
		char u='A';
		short s=80;
		u=(char)s; // cast to right type.
		
		long L=50;
		int S=50;
		L=S; // automatically
		
		short v1=1;
		short v2=2;
		int e2=(v1+v2); // Java will calculate both smaller type in int
		
		int class5 =5;//valid identifier
		
		int a_;
		//2. int a@;
		int a3;
		//4. int 8@;
		//5. int 9_;
		int X$_;
		int y;
		int _$_;
		int $_$;
		//10. int $*$;
		int $1$;
		int _1_;
		//13. int _@_;
		//14. int a#;
		//15. int a";
		//16. int 123a";
		//17. int 123a_;
		int $123b_;
		
		final int ff=5; // ff can only be assigned a value once
		
		System.out.println("enter your weight: ");
		int x=sc.nextInt();
		if(x<18.5)
			System.out.println("too light");
		else if (x<24)
		// it is a not-essential step to enter previous condition, since you have checked it
			System.out.println("you are in normal range.");
		else if(x<30)
			System.out.println("a little bit fat");
		else
			System.out.println("other possibility.");
		
		System.out.println("enter your month: ");
		int month=sc.nextInt();
		switch(month){
			case 1:
			case 2:
			case 3:System.out.println("Spring");break;
			case 4:
			case 5:
			case 6:System.out.println("Summer");break;
			case 7:
			case 8:
			case 9:System.out.println("Aunumn");break;
			case 10:
			case 11:
			case 12:System.out.println("Winter");break;
			default: System.out.println("worry");
			
		}
		
		int wege=0;
		for(int i=0;i<10;i++)
		{
			wege+=(int)(Math.pow(2,i));//Math.pow(double 1, double 2)
		}
		
		//print odd numbers
		for(int i=0;i<10;i++)
		{
			if(0==i%2)
				continue;// if meet with a even number, continue the loop
			System.out.println(i);
		}
		
		for(int i=1;i<=100;i++)
		{
			if(0==i%3 || 0==i%5)
				continue;// if meet with a even number, continue the loop
			System.out.println(i);
		}
		
		int money=12000;
		double rate=1.05;
		for(int i=0;i<100;i++)
		{
			double qq=Math.pow(rate,i);
			double F=money*qq;
			if(F/1000000==1)
			{
				System.out.println("you have saved 1 million.");
				break;
			}
		}
		
		boolean breakout=false;// termination mark
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.println(i+":"+j);
				if(j%2==0)
				{breakout=true;break;}
			}if(breakout)//breakout==true, it will terminate the outside loop
				break;
		}
		
		outloop: //termination mark
		for(int i=0;i<10;i++)
		{
			for (int j=0;j<10;j++)
			{
				System.out.println(i+":"+j);
				if(j%2==0)
					break outloop; //it will terminate the outside loop
			}
		}
		
		
		
	}
	/*public void method1(final int j)
	{
		j=5;
	}
	error: cannot assign the value to j.
	*/
}