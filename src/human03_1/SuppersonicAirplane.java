package human03_1;

public class SuppersonicAirplane extends Airplane  {
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
		
	public int flyMode = NOMAL;
	// 아래의 생성자는 생략가능
	public SuppersonicAirplane () {
		super();
		
	}
	@Override //언어 텐션을 붙여서 관리 (밑에 fly1을 했을때 
				//					원래 오류 안났는데
				//				오류 나는걸로 바뀜(상속 받는것 때문
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행 합니다.");

		} else {
			// 부모가 가지고 있는 일반 비행을 처리하고 싶음.
			super.fly();
		}
		
	}

}
