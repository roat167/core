package core.designpattern.factory;

import core.designpattern.builder.Weapon;

public class ArmorWalker extends Walker {
	private int id;
	private Weapon weapon = Weapon.GUN;

	public ArmorWalker(int id, int level, int damage, int health, int exp) {
		super(level, damage, health, exp);
		this.id = id;
	}

	@Override
	public int getId() {
		return this.id;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	@Override
	public String toString() {
		return String.format("ArmorWalker[ id: %d, level: %d, damage: %d, health: %d, exp: %d, weapon: %s]", this.id,
				this.getLevel(), this.getDamage(), this.getHealth(), this.getExp(), this.weapon.name());
	}

}
