package contact_exercise;

public class TestContact
{
	public static void main(String[] arg)
	{
		ContactManager m = new ContactManager();
		
		//default to something called "package public" 
		Contact James = new Contact();
		James.name = "James";
		James.phoneNumber = "001122223337";
		
		m.addFriends(James);
		
		//second friend: Cezanne
		Contact Cezanne = new Contact();
		Cezanne.name = "James";
		Cezanne.phoneNumber = "00888896666";
		
		m.addFriends(Cezanne);
		
		//search the number of a friend
		Contact result = m.searchFriends("James");
		System.out.println(result.phoneNumber);
		
		
		
	}
}