
public class Pursuit implements GiveGift {
	private SchoolGirl girl;
	
	public Pursuit(SchoolGirl girl) {
		// TODO Auto-generated constructor stub
		this.girl=girl;
	}

	public void giveDolls() {
		// TODO Auto-generated method stub
		System.out.println("�͸�"+girl.getName()+"������");

	}


	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println("�͸�"+girl.getName()+"�ʻ�");

	}


	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println("�͸�"+girl.getName()+"�ɿ���");
	}

}
