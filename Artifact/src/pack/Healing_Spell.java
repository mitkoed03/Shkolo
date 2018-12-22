package pack;

public class Healing_Spell implements Castable{
	int value = 0;
	
	public Healing_Spell(int v) {
		value = v;
	}
	
	public void cast(Hero h) {
		h.setHp(h.getHp() + value);
	}

}