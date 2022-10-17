package human15;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog1 = new Dog("포유류");
		dog1.breathe();
		dog1.sound();
		
		Cat cat1 = new Cat("포유류");
		cat1.sound();
		System.out.println("-----------------");
		Animal animal1 = new Dog("포유류");	//뒤만 바뀌어도 되는 다형성
		// 상속관계에서 자동 타입 변환.
		animal1.breathe();
		animal1.sound();
		System.out.println("-----------------");
		Animal animal2 = new Cat("포유류");
		animal2.breathe();
		animal2.sound();
		System.out.println("-----------------");
		//아래는 강제 타입 변환 실습.
		System.out.printf("animal1 instanceof Cat : %b \n"
				,animal2 instanceof Cat);
			
		if(animal1 instanceof Cat) {
			Cat cat2 = (Cat) animal2;
			cat2.sound();
		}
		System.out.printf("animal2 instanceof Dog : %b \n"
				, animal1 instanceof Dog);
		if (animal1 instanceof Cat) {
			Dog dog2 = (Dog) animal1;
			dog2.sound();
		}
		
		animalSound(new Dog("포유류"));
		// 아래와 같은 코드
//		Dog dog3 = new Dog("포유류");
//		animalsound(dog3);
		animalSound(new Cat("포유류"));
		
//		Animal animal = new Cat("포유류");
		
	}

	private static void animalSound(Dog dog) {
		dog.sound();
		
	}

	private static void animalSound(Cat cat) {
		cat.sound();
		
	}
}


