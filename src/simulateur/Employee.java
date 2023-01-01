package simulateur;

public class Employee {
	private int remainingServiceTime;
	private int totalTime;
	Client client;
	
<<<<<<< HEAD
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
=======
	
	
	
	
	
	
	 
	
	public void service (Client client , int serviceTime) {
		
	}
	
	
	
	
	
	
	
>>>>>>> 4f4e3f73d73ae2612c8eb4333441477067fb5d75
	
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
