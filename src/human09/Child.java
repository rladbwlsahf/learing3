	package human09;

public class Child extends Parent {
	private String name;
		
	public Child() {
		//super(); 하면 안되는게 밑에서 이미 호출을 했기때문
		//teacher :이는 생략된것이 아닌 아예 없는것임.
		//생략된것 이라고 한다면 this를 통해 다른 생성자에서
		//super가 호출될 것인데. 그러면 2번 super가 호출되는
		//효과가 있어서 문법적인 로직에 어긋남.
		this("홍길동");
		System.out.println("Child() 호출");
	}

	public Child(String string) {
//		super();	//생략된 것임.
		this.name = name;
		System.out.println("Child(name) 호출");
	}


}
