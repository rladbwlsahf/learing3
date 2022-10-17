package human13;

public class CarExam {

	public static void main(String[] args) {
//		Car car = new Car(100);
//		추상 클래스는 객체 생성 불가,부모 클래스로만 존재함
		SportsCar sCar = new SportsCar(100);
		sCar.drive();
		sCar.speedUp();
		sCar.showInfo();
		sCar.stop();
		
		
	}

}
