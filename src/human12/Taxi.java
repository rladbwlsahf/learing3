package human12;

public class  Taxi extends Car {

	public Taxi(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speedUp() {
		this.currentSpeed += 5;
		//this.currentSpeed = this.crueentSpeed +5;
	}

	@Override
	public int getCharge() {
		System.out.println("νμμκΈ : 8000");
		return 8000;
		// TODO Auto-generated method stub
		
	}

}
