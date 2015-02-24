public class Person {

	String name;

	int age;
	int gold;

	int intel;
	int strength;

	public Person() {
		this.name = "John";
		this.age = 16;
		this.gold = 0;
		this.intel = 0;
		this.strength = 0;
	}

	public Person(String thename, int theage) {
		this.name = thename;
		this.age = theage;
		this.gold = 0;
		this.intel = 0;
		this.strength = 0;
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

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getGold() {
		return this.gold;
	}

}