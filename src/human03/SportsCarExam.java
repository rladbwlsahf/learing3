package human03;

public class SportsCarExam {

	public static void main(String[] args) {
		SportsCar sCar1 = new SportsCar(100);
		sCar1.speedUp();
		
		System.out.printf("sCar1 현재속도 => %d", sCar1.currentSpeed);

	}

}
