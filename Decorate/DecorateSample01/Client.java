
public class Client {
	public static void main(String[] a) {
		PersonComponent xiaoming = new PersonComponent();
		
		Jacket jacket = new Jacket();
		Panes panes = new Panes();
		Shoes shoes = new Shoes();
		
		jacket.setComponent(xiaoming);
		panes.setComponent(jacket);
		shoes.setComponent(panes);
		
		shoes.operator();
		
	}
}
