package essentials;

public class MovePattern {
	private int[][] patt;
	
	public MovePattern(int[] x, int[] y) 
	{
		if(x.length == y.length) 
		{
			patt = new int[x.length][2];
			for(int c = 0; c < x.length; c++) 
			{
				patt[c][0] = x[c];
				patt[c][1] = y[c];
			}
		}
	}
	
	public int[][] get()
	{
		return patt;
	}

	public int findMatch(int row, int column) 
	{
		for(int c = 0; c < patt.length; c++) 
		{
			for(int k = 1; k < 8; k++) 
			{
				if(patt[c][0]*k == row && patt[c][1]*k == column) 
				{
					return c;
				}
			}
		}
		return -1;
	}
	
	public int findAbsMatch(int row, int column) 
	{
		for(int c = 0; c < patt.length; c++) 
		{
			if(patt[c][0] == row && patt[c][1] == column)
			{
				return c;
			}
		}
		return -1;
	}
}
