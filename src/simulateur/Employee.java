package simulateur;

public class Employee {
	private int remainingServiceTime;
	
	///constructeur
	public Employee(int time) {
	this.remainingServiceTime=time;
	}
	
public int getRemainingServiceTime() {
	return remainingServiceTime;
}
public void setRemainingServiceTime(int remainingServiceTime) {
	this.remainingServiceTime = remainingServiceTime;
}
 
public boolean isFree() {
	return true;
}
public boolean serviceFinished() {
	return false;
}
public void work() {
	
}

}
