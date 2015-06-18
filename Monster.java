public class Monster {

	String name;		

	String mobtype;
	// Animal
	// Monster
	// Boss
	// Pest
	// Enemy
	int relationship;
	// 0 = neutral
	// 1 = friendly
	// 2 = agressive
	// 3 = owned

	public Monster() {
		this.name = "Mouse";
		this.mobtype = "Animal";
		this.relationship = 0;
	}

	public Monster(String thisname, String thismobtype) {
		this.name = thisname;
		this.mobtype = thismobtype;
		this.relationship = 0;
	}
}
