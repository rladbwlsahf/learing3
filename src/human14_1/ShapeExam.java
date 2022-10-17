package human14_1;

public class ShapeExam {

	public static void main(String[] args) {
		Shape circle = new Circle(5.0);
		System.out.printf("원의 넒이는 %f입니다. \n",circle.calcArea());
		
		Shape rect = new Rectangel(3,4);
		System.out.printf("사각형의 넒이는 %f입니다. \n",rect.calcArea());

	}

}
