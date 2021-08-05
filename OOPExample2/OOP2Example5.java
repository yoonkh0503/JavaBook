package OOPExample2;

public class OOP2Example5 {

	public static void main(String[] args) {
		Car c1 = new Car("audi",2020,4);

		Sportage sportage = new Sportage("sportage",2021,6,"blue");
		
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.door);
		
		System.out.println(sportage.name);
		System.out.println(sportage.age);
		System.out.println(sportage.door);
		System.out.println(sportage.color);
	}

}

class Car {
	String name;
	int age;
	int door;
	
	Car(String name, int age, int door)
	{
		this.name = name;
		this.age = age;
		this.door = door;
	}
}

class Sportage extends Car{
	String color;
	
	Sportage(String name, int age, int door,String color)
	{
		/* this.name = name;
		this.age = age;
		this.door = door;
		*/
		super(name, age, door);
		this.color = color;
	}
}