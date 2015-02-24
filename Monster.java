public class Monster {

	String name;

	String mobtype;
	int relationship;

	public Monster(){
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
