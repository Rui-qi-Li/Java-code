package class_static_this_exercise;

public class Person
{
	private String Name;
	private String SSN;
	
	//private method--helper method
	private String getId()
	{
		return SSN + "-" + Name;
	}
	
	public String getName()
	{
		return Name;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	
	public boolean isSamePerson(Person p)
	{
		if(p.getId().equals(this.getId()))
			return true;
		else
			return false;
	}
}