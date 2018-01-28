import java.util.Scanner;

public class Hero
{	
	String Name;
	float HP;
	float Armor;
	int MoveSpeed;
	public Hero(String Name,float HP)
	{
		this.Name=Name;
		this.HP=HP;
	}
	public Hero(String Name,float HP,float Armor,int MoveSpeed)
	{
		this(Name,HP);//CALL this method
		this.Armor=Armor;
		this.MoveSpeed=MoveSpeed;
	}
	public Hero()
	{
		Name="Lucy";
		HP=500.0f;
		Armor=3.0f;
		MoveSpeed=20;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public String getName()
	{
		return Name;
	}
	public void setHP(float HP)
	{
		this.HP=HP;
	}
	public void setHP2(Hero hero, int damage)
	{
		hero.HP-=damage;//the result will be a float number.
	}
	public void Show(Hero obj)
	{
		System.out.println(obj.Name+obj.HP+obj.Armor+obj.MoveSpeed);
	}
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		Hero x=new Hero();
		Hero y=new Hero("y",383);
		System.out.println(x.Name);// you can access those attribute in the same class
		y.setHP2(x,100);
	}
}
/*
// you must write TestHero in a independent java file.

public class TestHero
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		Hero x=new Hero();
		System.out.println(x.getName());
	}
}*/

