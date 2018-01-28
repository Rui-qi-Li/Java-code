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
	
	public void isSamePerson(Person p)
	{
		if(p.getId().equals(this.getId))
			return true;
		else
			return false;
	}
}