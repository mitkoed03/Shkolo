package pack;

public class Backpack {
	private Artifact[] contents;
	private int itemCount, weight, weightLimit;
	
	public Backpack(int slots, int w) {
		contents = new Artifact[slots];
		weightLimit = w;
	}
	
	public Backpack(Backpack b) {
		contents = null;
		weightLimit = 0;
	}
	
	public String toString() {
		String s = "";
		for(Artifact a : contents) {
			if(a != null) {
				s += a.toString() + "\n";
			}
		}
		return s;
	}

	public boolean addArtifact(Artifact a) {
		if(itemCount < contents.length && weight + a.getWeight() <= this.getWeightLimit()) {
			contents[itemCount] = a;
			itemCount++;
			weight += a.getWeight();
			return true;
		}else {
			return false;
		}
	}
	
	public void setWeightLimit(int w) {
		weightLimit = w;
	}
	
	public int getWeightLimit() {
		return weightLimit;
	}
	
	public Artifact[] getContents() {
		Artifact[] copy = new Artifact[contents.length];
		for(int c = 0; c < contents.length; c++) {
			if(contents[c] != null) {
				copy[c] = new Artifact(contents[c]);
			}else {
				copy[c] = null;
			}
		}
		return copy;
	}
}
