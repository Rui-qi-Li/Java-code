public class City extends Country
{
	private String name;
	public void value()
	{
		name="Shanghai";
		super.value();
		System.out.println(name);
		System.out.println(super.name);
	}
	
}