
public class BoardState extends State
{
	//static variable since only one boardState is needed for the whole game
	static State[][] boardState = new State[8][8];
	public BoardState()
	{
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				boardState[i][j] = new State();
			}
		}
	}
	
	public void initialiseBoard()
	{
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				boardState[i][j].row = i;
				boardState[i][j].col = j;
				if (i == 3 && j == 3 || i == 4 && j == 4)
				{
					boardState[i][j].setBlack();
				}
				else if (i == 4 && j == 3 || i == 3 && j== 4)
				{
					boardState[i][j].setWhite();
				}
				else
				{
					boardState[i][j].setEmpty();
				}
			}
		}
	}
}
