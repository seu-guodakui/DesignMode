
public class MySubject extends Subject {

	@Override
	public void change() {
		System.out.println("in mysubject change");
		
		mynotify();
	}

}
