package pack;

public class Artifact {
		private String name;
		private Body place;
		private int weight, ap, dp, minLvl;
	
	public Artifact(String n, int a, int d, int lvl, int w, Body b) {
		place = b;
		name = n;
		weight = w;
		ap = a;
		dp = d;
		minLvl = lvl;
	}
	
	public Artifact(Artifact copy) {
		place = copy.getPLace();
		name = copy.getName();
		weight = copy.getWeight();
		ap = copy.getAp();
		dp = copy.getDp();
		minLvl = copy.getMinLvl();
	}
	
	public String toString() {
		String s = "==========================================\n"
				+ "Name: " + this.getName()
				+ "\nAttack strength: " + (this.getAp() == 0 ? "None" : this.getAp())
				+ "\nDefence strength: " + (this.getDp() == 0 ? "None" : this.getDp())
				+ "\nWeight: " + this.getWeight() + " kg"
				+ "\nTo be put on: " + this.getPLace().toString()
				+ "\nLevel Required: " + this.getMinLvl();
		
		return s;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setWeight(int w) {
		weight = w;
	}
	
	public void setAp(int a) {
		ap = a;
	}
	
	public void setDp(int d) {
		dp = d;
	}

	public void setMinLvl(int l) {
		minLvl = l;
	}
	
	public void setPlace(Body b) {
		place = b;
	}

	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getAp() {
		return ap;
	}
	
	public int getDp() {
		return dp;
	}
	
	public int getMinLvl(){
		return minLvl;
	}
	
	public Body getPLace() {
		return place;
	}
}
