package class_static_this_exercise;
import java.util.Scanner;
/**
 * show the use of the class, static, this
 * 
 * @author how2j.cn
 */
public class Hero
{	
	String Name;
	float HP;
	float Armor;
	int MoveSpeed;
	public static int itemCapacity = 8;//initialised the static class member
	static {
		itemCapacity = 6;//initialised the static class member in a static block
	}
	public Hero(String Name,float HP)
	{
		this.Name=Name;
		this.HP=HP;
	}
	//constructor can be overrided
	public Hero(String Name,float HP,float Armor,int MoveSpeed)
	{
		this(Name,HP);//CALL this constructor(2 para), must in another constructor
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
	
	//static method (class method), don't need a instance
	public static void battleWin(){
		System.out.println("Battle win!");
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
