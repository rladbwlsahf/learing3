package human15_1;

public class ItEaxm {

	public static void main(String[] args) {
		Apple iPhone1 = new Apple("아이폰");
		iPhone1.use();
		iPhone1.takePic();
		
		Samsung Galaxy1 = new Samsung("갤럭시");
		Galaxy1.use();
		Galaxy1.takePic();
		System.out.println("-----------------");
		It smartPhone1 = new Apple("아이폰");
		It smartPhone2 = new Samsung("갤럭시");
		It smartPhone3 = new Sony("엑스페리아");
		
		smartPhone3.use();
		smartPhone3.takePic();
		System.out.println("-----------------");
		
		System.out.printf("smartPhone1 instanceof Apple : %s \n"
				,smartPhone1 instanceof Apple);
		if (smartPhone1 instanceof Apple) {
			Apple iPhone2 = (Apple) smartPhone1;
			iPhone1.takePic();
			
			
		System.out.println("-----------------");
	
		
		}
	}
}
