package practice;

public class Basket <E extends Fruit>{
	private E elem;
	private final int basketPrice = 100;
	  public Basket(E e) {
	    elem = e;
	  }

	  public void replace(E e) {
	    elem = e;
	  }

	  public E get() {
	    return elem;
	  }

	  public void printName() {
	    // EはFruitのサブクラスなので、getNameが使えると保証されている
	    System.out.println("籠の中身は" + elem.getName() + "です");
	  }
	  
	  public void printTotalPrice() {
		  int totalPrice = elem.getPrice() + basketPrice;
		  System.out.println(elem.getName() + "の入った籠の値段は" + totalPrice + "円です");
	  }
}
