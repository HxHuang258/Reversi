import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main
{
	//player variables
	Player player1;
	Player player2;
	//BoardState
	BoardState board;
	//Rules
	Rules rules = new Rules();
	
	public void startGame()
	{
		//initialize boardstate
		board = new BoardState();
		board.initialiseBoard();
		//initialize players
		player1 = new BlackPlayer();
		player2 = new WhitePlayer();
		//add a frame to see how boardState changes
//		Frame state = new Frame("BoardState");
//		state.checkFrame();
		
		//at the end 
	}
	
	public static void main(String[] args)
	{
		Main game = new Main();
		game.startGame();
	}

}
