public class Bishop
{
	public Bishop(){}
	
	public boolean isValidMove(Position newpos)
	{
		if(Math.abs(newpos.column - this.column) == Math.abs(newpos.row - this.row))
			return true;
		else
			return false;
	}
}