package essentials;

import pieces.*;

public class Execute  {
	
	public static void main(String args[]) 
	{
		Queen q = new Queen(4,5, false);
		Officer o = new Officer(2,5, false);
		
		Board b = new Board(q, o);
		System.out.println(b.getContents());
		
		for(int c = 0; c < 8; c++) 
		{
			for(int i = 0; i < 8; i++) 
			{
				if(q.moveTo(c, i, b, false)) 
				{
					System.out.print("|X|");
				}
				else 
				{
					if(c == q.row() && i == q.column())
						System.out.print("|" + q.toString() + "|");
					else if(c == o.row() && i == o.column())
						System.out.print("|" + o.toString() + "|");
					else
						System.out.print("| |");
				}
			}
			System.out.println();
		}
	}
}
