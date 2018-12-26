package essentials;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Execute extends JFrame {
	private static Board board;
	private static ChessPiece selected;
	
	public static void main(String args[]) 
	{
		Execute frame = new Execute();
		frame.setVisible(true);
		
		JButton b = new JButton("Move");
		b.setSize(100, 20);
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				board.get(7, 1).moveTo(5, 0, board, true);
			}
			
		});
	}
	
	public Execute() {
		board = new Board();
		
		setLayout(new FlowLayout());
		setSize(new Dimension(520,717));
		setResizable(false);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		board.setPreferredSize(new Dimension(480,480));
		add(board);
		
		board.addMouseListener(new MouseAdapter() {
			
			public void mouseReleased(MouseEvent e) 
			{
				if(e.getButton() == MouseEvent.BUTTON1) 
				{
					selected = board.get(e.getY()/60, e.getX()/60);
				}
				
				if(e.getButton() == MouseEvent.BUTTON3) 
				{
					if(selected.moveTo(e.getY()/60, e.getX()/60, board, true)) 
					{
						board.remove(e.getY()/60, e.getX()/60, !selected.color());
						selected = null;
					}
				}
			}
		});
		
		JButton b = new JButton("Move");
		b.setPreferredSize(new Dimension(100, 20));
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				board.get(7, 1).moveTo(5, 0, board, true);
			}
			
		});
		add(b);
	}
	
}
