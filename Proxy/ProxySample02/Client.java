
public class Client {
	public static void main(String[] temp){
		SchoolGirl schoolGirl = new SchoolGirl("С��");
		
		Pursuit pursuit = new Pursuit(schoolGirl);
		
		Proxy proxy = new Proxy();
		proxy.setPursuit(pursuit);
		
		pursuit.giveDolls();
		pursuit.giveFlowers();
		pursuit.giveChocolate();
	}
}
