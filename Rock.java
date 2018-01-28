public class Rock extends Piece
{
	public Rock(){}
	public boolean isValidMove(Position newpos)
	{
		super();//this will call the parent's constructor: public Piece(){}
		this.name = "Rock";
		
		//first call the parent's method to check for the board bounds
		if(!super.isValidMove(position))
			return false;
		
		//If we passed the first test then check for the specific rock movement
		if(newpos.column == this.column || newpos.row == this. row)
			return true;
		else
			return false;
	}
}
