package human11Buyer_metord_try;

public class BuyerExam {

	public static void main(String[] args) {
		int tvPrice = 100;
		int computerPrice = 200;
		int audioPrice = 50;

		Buyer buyer1 = new Buyer(1000);
	
		Tv tv = new Tv(tvPrice,"TV");
		Computer computer = new Computer(computerPrice,"COMPUTER");
		Audio audio = new Audio(audioPrice,"AUDIO");
		
		buyer1.buy(tv);
		buyer1.buy(computer);
		buyer1.buy(tv);
		buyer1.buy(audio);
		buyer1.buy(computer);
		buyer1.buy(computer);
		buyer1.buy(tv);
		
		
		System.out.println("-----------------");
		buyer1.summary();
		System.out.println("-----------------");
		
	}

}
