package pack;

public class Damage_Spell implements Castable{
	int value = 0;
	
	public Damage_Spell(int v) {
		value = v;
	}
	
	public void cast(Hero h) {
		h.setHp(h.getHp() - value);
	}

}
