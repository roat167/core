package core.designpattern.builder;

/**
 * Simple class for Walking Dead Hero
 * 
 */
public class Hero {
	private final String name;
	private final Profession profession;
	private final Armor armor;
	private final Weapon weapon;

	// private constructor
	private Hero(Builder builder) {
		this.profession = builder.profession;
		this.name = builder.name;
		this.weapon = builder.weapon;
		this.armor = builder.armor;
	}

	public String getName() {
		return name;
	}

	public Profession getProfession() {
		return profession;
	}

	public Armor getArmor() {
		return armor;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	@Override
	public String toString() {
		return String.format("Name: %s, Prof: %s, Amor: %s, Weapon: %s", this.name, this.profession, this.armor,
				this.weapon);
	}

	public static class Builder {
		private final String name; // required field
		private final Profession profession; // required field
		private Armor armor;
		private Weapon weapon;

		public Builder(String name, Profession profession) {
			this.name = name;
			this.profession = profession;
		}

		public Builder withArmor(Armor armor) {
			this.armor = armor;
			return this;
		}

		public Builder withWeapon(Weapon weapon) {
			this.weapon = weapon;
			return this;
		}

		// compact to Hero object
		public Hero build() {
			return new Hero(this);
		}
	}
}
