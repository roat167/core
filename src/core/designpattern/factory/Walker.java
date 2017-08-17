package core.designpattern.factory;

/**
 * Super class
 *
 */
public abstract class Walker {
	private int level;
	private int damage;
	private int health;
	private int exp;	

	public Walker(int level, int damage, int health, int exp) {
		this.level = level;
		this.damage = damage;
		this.health = health;
		this.exp = exp;		
	}

	public abstract int getId();

	public int getLevel() {
		return this.level;
	}	

	public int getDamage() {
		return this.damage;
	}
	
	public int getHealth() {
		return this.health;
	}

	public int getExp() {
		return this.exp;
	}
}
