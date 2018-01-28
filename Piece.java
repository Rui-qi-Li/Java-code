public class Piece
{
	private String name;
	
	public Piece(){}
	
	public boolean isValidMove(Position newPos)
	{
		if(newPos.row >0 && newPos.row<8 newPos.column >0 && newPos.column<8)
			return true;
		else
			return false;
	}
}
