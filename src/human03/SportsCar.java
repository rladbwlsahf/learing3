package human03;

public class SportsCar extends Car{

	public SportsCar(int currentSpeed) {
		super(currentSpeed);
		// 아래 코드는 할 필요없음
		// this.currentSpeed = currentSpeed;
	}
	public void speedUp() {
		// 메서드 오버라이딩 override
		// 부모가 가지고 있는 기능을  새로이 정의해서 쓰고 싶음
		this.currentSpeed = this.currentSpeed + 10;
		
	}
}

