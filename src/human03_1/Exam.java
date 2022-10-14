package human03_1;

public class Exam {

	public static void main(String[] args) {
		SuppersonicAirplane sAirplane 
		= new SuppersonicAirplane();
	sAirplane.takeOff();
	sAirplane.fly();
	sAirplane.flyMode = SuppersonicAirplane.SUPERSONIC;
	// SUPERSONIC 변수는 static이므로 객체가 아닌 클래스 기반이므로
	// 접근 가능.
	sAirplane.fly();
	sAirplane.flyMode = SuppersonicAirplane.NOMAL;
	sAirplane.fly();
	sAirplane.land();
	}

}
 