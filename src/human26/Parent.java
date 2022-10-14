package human26;

public class Parent {
	public int currentSpeed;
	
	public Parent(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public void speedUp() {
		this.currentSpeed = this.currentSpeed ++;
	}
}

