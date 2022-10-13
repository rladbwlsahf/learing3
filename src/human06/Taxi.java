package human06;

public class Taxi extends Car{
	public Taxi() {
		super();
		System.out.println("Taxi 객체 생성");
	}
	public int getCharge() {
		int charge = 8000;	
		//평균적 대중 교통 요금 1300원
		System.out.printf("일반적인 요금 : %d \n", charge);
		return charge;
	}
}
