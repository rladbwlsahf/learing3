package human02_2;

public class Main {

	public static void main(String[] args) {
		
		/*
		Car car1 = new Car();
		System.out.printf("speed ==> %d, oil ==> %d \n"
				,car1.speed,car1.oil);
		System.out.println("-------------------");
		Car car2 = new Car(50);
		System.out.printf("speed ==> %d, oil ==> %d \n"
				,car2.speed,car2.oil);
		System.out.println("-------------------");
		Car car3 = new Car(10,30);
		System.out.printf("speed ==> %d, oil ==> %d \n"
				,car3.speed,car3.oil);
		System.out.println("-------------------");
		*/
		
		Hybride h1 = new Hybride();
		System.out.println("-------------------");
		Hybride h2 = new Hybride(20);
		System.out.println("-------------------");
		Hybride h3 = new Hybride(50,10);
		System.out.println("-------------------");
		System.out.printf("speed ==> %d, oil ==> %d, elec ==>%d \n"
				,h3.speed,h3.oil,h3.elec);
		System.out.println("-------------------");
		Hybride h4 = new Hybride(50,10,100);
		System.out.printf("speed ==> %d, oil ==> %d, elec ==> %d \n"
				,h4.speed,h4.oil,h4.elec);
		System.out.println("-------------------");
	}

}
