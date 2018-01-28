import java.util.HashMap;
public class Testarraylist
{
		ArrayList names = new ArrayList(); 
		names.add = "james";
		names.add = "jay";
		names.add = "sophia";
		
		names.remove = "jay";
		
		String a = names.get(1);
		int num = names.size();
		
		names.clear();
		
		Stack<String> newsFeed = new Stack();
		newsFeed.push = "morning news";
		String breakingnews = newsFeed.pop();
		String breakingnews = newsFeed.peek();
		System.out.println(breakingnews);
		
		ArrayList<Media> playList = new ArrayList();
		Video someVideo = new Video();
		Audio someAudio = new Audio();
		
		playList.add(someVideo);
		playList.add(someAudio);
		
		Media media = playList.get(0);//don't need to cast it into certain type
		media.play();
		
		HashMap<String, Book> allBooks = new HashMap<String, Book>();
		Book specifiedBook = new Book();
		allBooks.put("9898989898",specifiedBook);
		Book book = allBooks.get("9898989898");s
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}