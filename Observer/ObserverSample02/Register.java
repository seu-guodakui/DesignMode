
public class Register {
	public void myregister(){
		MySubject mySubject = new MySubject();
		
		Observer1 observer1 = new Observer1();
		Observer2 observer2 = new Observer2();
		
		mySubject.attach(observer1);
		mySubject.attach(observer2);
		
		mySubject.change();
	}
	
	public static void main(String a[]){
		new Register().myregister();
	}
}
