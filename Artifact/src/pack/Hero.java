package pack;

import java.util.ArrayList;

public class Hero {
	private String name;
	private int lvl, xp, ap, dp, hp;
	private Backpack bag;
	private Artifact HEAD, CHEST, LEFT_HAND, RIGHT_HAND, LEGS;
	private ArrayList<Castable> spells = new ArrayList<Castable>();
	
	
	public Hero(String n, int h, Backpack b) {
		name = n;
		hp = h;
		bag = b;
		
		lvl = 0; xp = 0;
		ap = 0; dp = 0;
		HEAD = null; CHEST = null; LEFT_HAND = null; RIGHT_HAND = null; LEGS = null;
	}
	
	public Hero(Hero h) {
		name = h.getName();
		hp = h.getHp();
		bag = h.getBag();
		
		lvl = 0; xp = 0;
		ap = 0; dp = 0;
		HEAD = null; CHEST = null; LEFT_HAND = null; RIGHT_HAND = null; LEGS = null; 
	}
	
	public void equip(int c) {
		Artifact equipAt;
		
		switch(this.getBag().getContents()[c].getPLace()) {
			case HEAD:
				equipAt = HEAD;
				break;
			case CHEST:
				equipAt = CHEST;
				break;
			case RIGHT_HAND:
				equipAt = RIGHT_HAND;
				break;
			case LEFT_HAND:
				equipAt = LEFT_HAND;
				break;
			case LEGS:
				equipAt = LEGS;
				break;
			default:
				equipAt = LEGS;
				break;
		}
		
		Artifact current = new Artifact(equipAt);
		
		equipAt = this.getBag().getContents()[c];
		
		if(current != null) {
			this.getBag().addArtifact(current);
		}
	}
	
	public String toString() {
		String s = 
		"Hero Name: " + name +
		"\nLevel: " + lvl +
		"\nExperience: " + xp +
		"\nAttack strength: " + ap +
		"\nDefence strength: " + dp +
		"\nEquipment:" +
		"\n\tHead: " + (HEAD == null ? "None" : HEAD.getName()) +
		"\n\tChest: " + (CHEST == null ? "None" : CHEST.getName()) +
		"\n\tLeft hand: " + (LEFT_HAND == null ? "None" : LEFT_HAND.getName()) +
		"\n\tRight hand: " + (RIGHT_HAND == null ? "None" : RIGHT_HAND.getName()) +
		"\n\tLegs: " + (LEGS == null ? "None" : LEGS.getName()) +
		"\n" + bag.toString();
		
		return s;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setBag(Backpack b) {
		bag = b;
	}
	
	public void setHp(int h) {
		hp = h;
	}
	
	public void setAp(int a) {
		ap = a;
	}
	
	public void setDp(int d) {
		dp = d;
	}

	public void setLvl(int l) {
		lvl = l;
	}
	
	public void setXp(int x) {
		xp = x;
	}

	public String getName() {
		return name;
	}
	
	public Backpack getBag() {
		return bag;
	}
	
	public int getAp() {
		return ap;
	}
	
	public int getDp() {
		return dp;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getLvl(){
		return lvl;
	}
	
	public int getXp() {
		return xp;
	}
}
