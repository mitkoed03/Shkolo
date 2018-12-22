package pack;

public enum Body {
	HEAD,
	CHEST,
	RIGHT_HAND,
	LEFT_HAND,
	LEGS;
	
	public String toString() {
		return name().charAt(0) + name().substring(1).toLowerCase().replace('_', ' ');
	}
}
