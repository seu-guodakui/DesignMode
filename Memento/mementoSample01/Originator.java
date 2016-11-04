package javatext;

public class Originator {
	//发起人
	private String status1="";
	private String status2="";
	
	public String getStatus1() {
		return status1;
	}
	public void setStatus1(String status1) {
		this.status1 = status1;
	}
	public String getStatus2() {
		return status2;
	}
	public void setStatus2(String status2) {
		this.status2 = status2;
	}
	
	public Memento createMemento() {
		return (new Memento(this.status1,this.status2));
		
	}
	
	public void setMemento(Memento memento){
		this.status1=memento.getStatus1();
		this.status2=memento.getStatus2();
	}
	
	public void show() {
		System.out.println("----------显示当前的状态-----------");
		System.out.println(this.status1+"  "+this.status2);
		
	}

}
