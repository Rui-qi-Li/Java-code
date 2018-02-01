package chessgame_exercise;

public class Piece
{
	public String name;
	public Position pos;
	
	public Piece(){
		pos.row = 99;
		pos.column = 99;
	}
	
	public boolean isValidMove(Position newPos)
	{
		if(newPos.row >0 && newPos.row<8 && newPos.column >0 && newPos.column<8)
			return true;
		else
			return false;
	}
	public void setMove(Position newPos) {
		pos.row = newPos.row;
		pos.column = newPos.column;
	}
}
