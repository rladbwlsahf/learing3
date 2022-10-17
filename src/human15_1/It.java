package human15_1;

public abstract class It {
	public String kind;
	//하위 브랜드 에 대한 분류
	public It(String kind) {
		this.kind = kind;
	}
	public void use() {
		System.out.println("사용자가");
	}
	public abstract void takePic();

}
