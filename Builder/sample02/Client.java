
public class Client {
	public static void main(String[] str) throws InstantiationException, IllegalAccessException{
		Director director = new Director();
		
		try {
			Class c = Class.forName("BuilderA");
			Builder builder =(Builder) c.newInstance();
			director.constract(builder);
			
			Product product = builder.getProduct();
			product.show();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
