package contact_exercise;

public class ContactManager
{
	
	//default friendly members
	private Contact [] friends;
	private int friendsCount;
	
	public ContactManager()
	{
		this.friends = new Contact[500]; 
		this.friendsCount = 0;
	}
	
	
	//i : an object
	public void addFriends(Contact i)
	{
		friends[friendsCount] = i;
		friendsCount++;
	}
	
	public Contact searchFriends(String str)
	{
		for(int i=0;i<friendsCount;i++)
		{
			//each friends[i] is an object
			if(friends[i].name.equals(str))
				return friends[i];
		}
		return null;
	}
	
}