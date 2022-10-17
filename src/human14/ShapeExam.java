package human14;

public class ShapeExam {

	public static void main(String[] args) {
		Shape circle = new Circle(5.0);
		System.out.printf("원의 넒이는 %f입니다. \n",circle.calcArea());
		
		Shape rect = new Rectangle(3,4);
		System.out.printf("사각형의 넒이는 %f입니다. \n",rect.calcArea());
		
		Shape c1 = new Circle(5.5);
		System.out.printf("원1의 넒이는 %f입니다. \n",c1.calcArea());
		
		Shape rect1 = new Rectangle(7,5);
		System.out.printf("사각형1의 넒이는 %f입니다. \n",rect1.calcArea());
	}

}
