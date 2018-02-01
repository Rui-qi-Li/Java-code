package super_exercise;
public class City extends Country
{
	private String name;
	public void value()
	{
		name="Shanghai";
		super.value();//super class method
		System.out.println(name);
		System.out.println(super.name);//super class member
	}
	
}