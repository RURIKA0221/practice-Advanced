package practice;

public class Chapter6_1 {

	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ",200));
		System.out.println(appleBasket.get().getName());
		appleBasket.printName();
		appleBasket.printTotalPrice();
		Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃",300));
		System.out.println(peachBasket.get().getName());
		peachBasket.printName();
		peachBasket.printTotalPrice();

	}

}
