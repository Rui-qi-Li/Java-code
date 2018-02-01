package chessgame_exercise;

public class TestChess
{
	public static void main(String[] arg)
	{
		Queen queen = new Queen();
		Position testpos = new Position(3,10);
		if(queen.isValidMove(testpos))
			System.out.println("Yes, I can move there.");
		else
			System.out.println("No, I can't move there.");
	}
}