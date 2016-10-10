
public class Proxy implements GiveGift {

	private Pursuit pursuit;
	
	void setPursuit(Pursuit pursuit){
		this.pursuit=pursuit;
	}
	
	public void giveDolls() {
		// TODO Auto-generated method stub
		pursuit.giveDolls();
	}

	
	public void giveFlowers() {
		// TODO Auto-generated method stub
		pursuit.giveFlowers();
	}

	
	public void giveChocolate() {
		// TODO Auto-generated method stub
		pursuit.giveChocolate();
	}

}
