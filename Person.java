public class Person {

	String name;

	int age;		//stat 0

	int gold;		//stat 20
	int health;		//stat 21
	int energy;		//stat 22

	int intel;		//stat 31
	int strength;	//stat 32


	public Person() {
		this.name = "John";
		this.age = 16;

		//day to day usage
		this.energy = 10;

		//inventory
		this.gold = 0;

		// Personal skills
		this.health = 10;
		this.intel = 0;
		this.strength = 0;
	}

	public Person(String thename, int theage) {
		super();
		this.name = thename;
		this.age = theage;
	}

	public String basicInfo() {
		String info;
		info = ("I'm " + this.name + " and I'm " + this.age + " years old.");
		return info;
	}

	public void setName(String thename) {
		this.name = thename;
	}

	public void setAge(int theage) {
		this.age = theage;
	}

	public void setGold(int thegold) {
		this.gold = thegold;
	}

	public void setHealth(int thehealth) {
		this.health = thehealth;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getGold() {
		return this.gold;
	}

	public int getHealth() {
		return this.health;
	}

}