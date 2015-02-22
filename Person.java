public class Person {

	String name;

	int age;
	int gold;

	public Person(String thename, int theage) {
		this.name = thename;
		this.age = theage;
		this.gold = 0;
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