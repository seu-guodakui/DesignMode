package javatext;

public class Client {
	public static void main(String str[]) {
		Originator originator = new Originator();
		originator.setStatus1("hello");
		originator.setStatus2("world");
		originator.show();
		
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());
		
		originator.setStatus2("coding");
		originator.show();
		
		originator.setMemento(caretaker.getMemento());
		originator.show();
	}
	
}
