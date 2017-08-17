package core.designpattern.builder;

public enum Profession {
	ASSUALT, BRUISER, HUNTER, SCOUT, SHOOTER, WARRIOR;

	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
