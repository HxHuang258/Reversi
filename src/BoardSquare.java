import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BoardSquare extends JButton implements ActionListener
{
	Icon black = new ImageIcon("E:\\editicon.PNG");
	Icon white = new ImageIcon("E:\\editicon.PNG");
	int player;
	int row;
	int col;
	public BoardSquare(int i, int j)
	{
		this.setPreferredSize(new Dimension(40, 40));
		this.setBackground(Color.green);
		this.setOpaque(true);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.addActionListener(this);
		row = i;
		col = j;
	}
	

	public void drawEmpty()
	{
		this.setIcon(null);
	}
	
	public void drawBlack()
	{
		this.setIcon(black);
		this.setText("black");
	}
	
	public void drawWhite()
	{
		this.setIcon(white);
		this.setText("white");
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// when you click on the button on it's player1 (black) for ex.
		// the square should turn to black
		if (player == 1)
		{
			BoardState.boardState[row][col].setBlack();
			if (BoardState.boardState[row][col].state == 1)
			{
				this.drawBlack();
			}
		}
		else
		{
			BoardState.boardState[row][col].setWhite();
			if (BoardState.boardState[row][col].state == 2)
			{
				this.drawWhite();
			}
		}
	}
}
