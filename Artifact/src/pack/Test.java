package pack;

public class Test {
	public static void main(String args[]) {
		Backpack bag = new Backpack(20, 100);
		Hero hero = new Hero("Geri The Mighty", 20, bag);
		
		bag.addArtifact(new Artifact("Basic Sword", 5, 0, 0, 2, Body.RIGHT_HAND));
		System.out.println(hero.toString());
		
		hero.equip(0);
		System.out.println(hero.toString());
	}
}
