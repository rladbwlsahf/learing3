package human16;

public abstract class Notebook extends Computer {

	@Override
	public void display() {
		System.out.println("노트북 화면이 디스플레이 됩니다.");
		
	}

	@Override
	public abstract void typing();



}
