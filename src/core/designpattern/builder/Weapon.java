package core.designpattern.builder;

public enum Weapon {
	AXE, BAT, BOW, DAGGER, GUN, RIFLE, MACHINE_GUN, SWORD, OTHER;
	
	@Override
	public String toString() {	
		return this.name().toLowerCase();
	}
}
