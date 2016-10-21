
public abstract class Builder {
	protected Product product = new Product();
	public abstract void buildPartA();
	public abstract void buildPartB();
	
	public Product getProduct(){
		return this.product;
	}

}
