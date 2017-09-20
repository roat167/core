package core.designpattern.factory;

public class BurningWalker extends Walker {
	private int id;
	private int burningDamage;
	
	public BurningWalker(int id, int level, int damage, int health, int exp) {			
		super(level, 0, health, exp);
		this.id = id;
		this.burningDamage = damage;
	}

	@Override
	public int getId() {		
		return this.id;
	}

	public int getBurningDamage() {
		return this.burningDamage;
	}
	
	@Override
	public String toString() {
		return String.format("BurningWalker[ id: %d, level: %d, burningDamage: %d, health: %d, exp: %d]", this.id,
				this.getLevel(), this.burningDamage, this.getHealth(), this.getExp());
	}
}
