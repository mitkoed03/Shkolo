package pack;

public class Attack_Spell implements Castable{
	int value = 0;
	
	public Attack_Spell(int v) {
		value = v;
	}
	
	public void cast(Hero h) {
		h.setAp(h.getAp() - value);
	}

}
