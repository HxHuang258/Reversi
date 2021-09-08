import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame implements ActionListener
{
	JPanel board;
	JButton button;
	BoardSquare[][] squares = new BoardSquare[8][8];
	
	
	public Frame (String title)
	{
		this.getContentPane().setLayout(new BorderLayout());
		this.setTitle(title); //set title equal to player1 or player2
		if (title == "Player1")
		{
			//set frame to the left
			this.setLocation((WIDTH/2) - 200, (HEIGHT/2));
		}
		else if (title == "Player2")
		{
			//set frame to the right
			this.setLocation((WIDTH/2) + 200, (HEIGHT/2));
		}
		//
		else
		{
			this.setLocation((WIDTH/2) + 400, (HEIGHT/2));
		}
		button = new JButton("AI");
		button.addActionListener(this);
		this.getContentPane().add(button, BorderLayout.SOUTH);
	}
	
	public void fillFrame(String player)
	{
		board = new JPanel();
		board.setLayout(new GridLayout(8, 8)); // 64 grid for the board
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				//check if boardState is empty 
				if (BoardState.boardState[i][j].state == 0)
				{
					squares[i][j] = new BoardSquare(i, j);
					squares[i][j].drawEmpty();
				}
				//check if boardState is black
				else if (BoardState.boardState[i][j].state == 1)
				{
					squares[i][j] = new BoardSquare(i, j);
					squares[i][j].drawBlack();
				}
				//check if boardState is white
				else if (BoardState.boardState[i][j].state == 2)
				{
					squares[i][j] = new BoardSquare(i, j);
					squares[i][j].drawWhite();
				}
				
				if (player == "Player1")
				{
					squares[i][j].player = 1;
				}
				else
				{
					squares[i][j].player = 2;
				}
				board.add(squares[i][j]);
			}
		}
		this.getContentPane().add(board, BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
	}
	
//	public void checkFrame()
//	{
//		board = new JPanel();
//		board.setLayout(new GridLayout(8, 8)); // 64 grid for the board
//		JButton[][] states = new JButton[8][8];
//		for (int i = 0; i < 8; i++)
//		{
//			for (int j = 0; j < 8; j++)
//			{
//				states[i][j] = new JButton();
//				if (BoardState.boardState[i][j].state == 1)
//				{
//					states[i][j].setText("black");
//				}
//				else if (BoardState.boardState[i][j].state == 2)
//				{
//					states[i][j].setText("white");
//				}
//				else
//				{
//					states[i][j].setText("empty");
//				}
//				board.add(states[i][j]);
//			}
//		}
//		this.getContentPane().add(board, BorderLayout.CENTER);
//		this.pack();
//		this.setVisible(true);
//	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
}
