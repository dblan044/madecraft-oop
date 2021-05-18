package examples;

public class Character {

	private String name;
	private String species;
	private int age;
	private boolean alive = true;

	public Character(String name, String species, int age, boolean alive){
		this.name = name;
		this.species = species;
		this.age = age;
		this.alive = alive;
	}
	
	public static void main(String[] arga){
		Character char1 = new Character("Sylvanas", "Blood Elf", 2800, false);
		Character char2 = new Character("Anduin", "Human", 18, true);
		Character char3 = new Character("Thrall", "Orc", 30, true);
	}
}
