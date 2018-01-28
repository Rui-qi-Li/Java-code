public class IndexController
{
	public String getName()
	{
		return "Lucy";
	}
	public int getName(int i)
	{
		return i;
	}
	
	public static void main(String[] arg)
	{
		String name=new IndexController().getName();
		System.out.println(name);
		int name2=new IndexController().getName(6);
		System.out.println(name2);
		
		IndexController x=new IndexController();
		System.out.println(x.getName());
		System.out.println(x.getName(90));
		
		
	}
}