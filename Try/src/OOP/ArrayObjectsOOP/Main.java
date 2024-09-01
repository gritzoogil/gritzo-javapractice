package ArrayObjectsOOP;

public class Main {

	public static void main(String[] args) {
		
		Food food1 = new Food("Egg");
		Food food2 = new Food("Chicken");
		Food food3 = new Food("Human hand");
		
		Food[] tray = {food1, food2, food3};
		
		System.out.println(tray[0]); // address of food1
		System.out.println(tray[0].name);
		System.out.println(tray[1]); // address of food2
		System.out.println(tray[1].name);
		System.out.println(tray[2]); // address of food3
		System.out.println(tray[2].name);
	}

}
