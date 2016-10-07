import java.util.ArrayList;
import java.util.EventObject;

public abstract class Subject {
	protected ArrayList<Object> observerlist = new ArrayList<Object>();
	
	public void attach(Observer observer){
		observerlist.add(observer);
	}
	
	public void detach(Observer observer){
		observerlist.remove(observer);
	}
	
	public void mynotify(){
		for (Object obj : observerlist) {
			((Observer)obj).reponse();
		}
	}
	
	public abstract void change();
}
