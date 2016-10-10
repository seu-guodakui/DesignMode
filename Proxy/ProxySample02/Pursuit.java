
public class Pursuit implements GiveGift {
	private SchoolGirl girl;
	
	public Pursuit(SchoolGirl girl) {
		// TODO Auto-generated constructor stub
		this.girl=girl;
	}

	public void giveDolls() {
		// TODO Auto-generated method stub
		System.out.println("送给"+girl.getName()+"洋娃娃");

	}


	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println("送给"+girl.getName()+"鲜花");

	}


	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println("送给"+girl.getName()+"巧克力");
	}

}
