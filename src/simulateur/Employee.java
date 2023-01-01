package simulateur;

public class Employee {
	private int remainingServiceTime;
	private int totalTime;
	Client client;
	
	///constructeur
	public Employee(int time) {
	this.remainingServiceTime=time;
	}
	
	public void serves(Client client,int serviceTime) {
		this.client=client;
		this.remainingServiceTime=serviceTime;
		
		if(!isFree()) {
			
			while(!serviceFinished()){
				work();
				remainingServiceTime-=1;	
			}
		}
	}
	
	public boolean serviceFinished() {
		if(remainingServiceTime==0)
			return true;
		else return false;
	}
	
	public  boolean isFree() {
		if (client==null)
			return true;
		else return false;
	}
	
	public void work() {
		totalTime+=1;
	}
}
