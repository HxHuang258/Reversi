
public class State
{
	/*
	 * Integer state meanings
	 * 0 = empty
	 * 1 = black
	 * 2 = white
	 * */
	int state = 0;
	int row;
	int col;
	
	public State()
	{
		state = 0;
	}
	
	public void setEmpty()
	{
		BoardState.boardState[row][col].state = 0;
	}
	
	public void setBlack()
	{
		BoardState.boardState[row][col].state = 1;
	}
	
	public void setWhite()
	{
		BoardState.boardState[row][col].state = 2;
	}
}
