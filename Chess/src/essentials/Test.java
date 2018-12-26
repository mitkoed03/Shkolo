package essentials;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Test extends JFrame{
	
	public static void main(String args[])
	{
		Test fr = new Test();
		
		fr.setSize(700, 700);
		fr.setLayout(new FlowLayout());
		fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Board b = new Board();
		b.setPreferredSize(new Dimension(640,640));
		fr.add(b);
		
		fr.setVisible(true);
	}

}
