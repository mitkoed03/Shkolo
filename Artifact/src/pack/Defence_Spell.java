package pack;

public class Defence_Spell implements Castable{
	int value = 0;
	
	public Defence_Spell(int v) {
		value = v;
	}
	
	public void cast(Hero h) {
		h.setAp(h.getAp() - value);
	}

}