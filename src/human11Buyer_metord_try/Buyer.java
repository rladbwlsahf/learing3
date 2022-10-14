package human11Buyer_metord_try;

public class Buyer {

	public int money;
	public Product[] cart = new Product[10];
	public int index;
	
	public Buyer(int money) {
		this.money = money;
		this.index = 0;
		// TODO Auto-generated constructor stub
	}

	public void buy(Product product) {
		// TODO Auto-generated method stub
		if(this.money - product.price<0) {
			System.out.printf("현재 잔액 : %d / 제품(%s) : %d \n"
					, this.money,product.name,product.price);
			return;	//위의 내용이 출력되는 경우는 현재 잔액보다 물건이 더 비쌀때
		}			//출력되는 내용
		else {
			this.money = this.money - product.price;
			this.add(product);
		}
	}

	private void add(Product product) {
		this.cart[index] = product;
		System.out.printf("cart[%d] : %s(%d) \n"
				,this.index,product.name,product.price);
		this.index = this.index +1;
	}
		// TODO Auto-generated method stub

	public void summary() {
		String itemList = "";
		int sum = 0;
		for(int i=0; i<cart.length; i++) {
			if(this.cart[i] == null) {
				break;
			}
			itemList = itemList + this.cart[i].name+", ";
			sum = sum + this.cart[i].price;
		}
		// TODO Auto-generated method stub
		System.out.printf("구입한 물건 : %s \n", itemList);
		System.out.printf("총사용 물건 : %s \n", sum);
		System.out.printf("현재 잔고 : %s \n", this.money);
		
	}
		
}





