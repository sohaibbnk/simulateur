package simulateur;

import java.io.InputStreamReader;

public class Employee {
	private int id;
	private int remainingServiceTime;
	private int totalTime;
	Client client;
	
	///constructeur
	public Employee(int time) {
	this.remainingServiceTime=time;
	}
	
	public void serves(Client client,int serviceTime){
		totalTime+=5;
		this.client=client;
		this.remainingServiceTime=serviceTime;
		//client.setDepartureTime(serviceTime-5);
	}
	
	public boolean serviceFinished() {
		if(remainingServiceTime==0 || remainingServiceTime<0) {
			return true;
		}
		else return false;
	}
	
	public  boolean isFree() {
		if (client==null)
			return true;
		else return false;
	}
	
	public void work() {
		remainingServiceTime-=1;
	}

	public int getRemainingServiceTime() {
		return remainingServiceTime;
	}

	public void setRemainingServiceTime(int remainingServiceTime) {
		this.remainingServiceTime = remainingServiceTime;
	}

	public int getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
