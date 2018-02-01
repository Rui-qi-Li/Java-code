package chessgame_exercise;

public class Bishop extends Piece
{
	public Bishop(){}
	
	public boolean isValidMove(Position newpos)//rewrite the method from super class
	{
		if(Math.abs(newpos.column - this.pos.column) == Math.abs(newpos.row - this.pos.row))
			return true;
		else
			return false;
	}
}