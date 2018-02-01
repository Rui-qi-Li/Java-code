package chessgame_exercise;

public class Rock extends Piece
{
	public Rock(){
		super();//this will call the parent's constructor: public Piece(){}
		        //and must be the first line of the constructor
	}
	public boolean isValidMove(Position newpos)
	{
	
		this.name = "Rock";
		
		//first call the parent's method to check for the board bounds
		if(!super.isValidMove(newpos))
			return false;
		
		//If we passed the first test then check for the specific rock movement
		if(newpos.column == this.pos.column || newpos.row == this.pos.row)
			return true;
		else
			return false;
	}
}
