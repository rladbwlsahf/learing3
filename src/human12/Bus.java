package human12;

public class Bus extends Car {

	public Bus(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speedUp() {
		currentSpeed++;	//속도 1씩 증가
		
	}

	@Override
	public int getCharge() {
		System.out.println("버스요금 : 1450");
		return 1450;
		
	}

}
