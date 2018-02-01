package enum_exercise;

public class showSeason{
	public static void main(String[]arg) {
		Season season = Season.SPRING;
		
		switch(season) {
		case SPRING:
			System.out.println("spring");
			break;
		case SUMMER:
			System.out.println("summer");
			break;
		}
		
		for(Season s : Season.values())
			System.out.println(s);
	}
}