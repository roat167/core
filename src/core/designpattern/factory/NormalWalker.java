package io.kapp.core.designpattern.factory;

public class NormalWalker extends Walker {
	private int id;
	
	public NormalWalker(int id, int level, int damage, int health, int exp) {			
		super(level, damage, health, exp);
		this.id = id;
	}

	@Override
	public int getId() {		
		return this.id;
	}
	
	@Override
	public String toString() {
		return String.format("NormalWalker[ id: %d, level: %d, damage: %d, health: %d, exp: %d]", this.id,
				this.getLevel(), this.getDamage(), this.getHealth(), this.getExp());
	}	
}
