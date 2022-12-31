package simulateur;

public class SimulationEntry {
	
	private int simluationDuration;
	 private int employeeCount;
	 private int minSeriveTime;
	 private int maxServiceTime;
	 private int clientArriveValInterval;
	public SimulationEntry(int simluationDuration, int employeeCount, int minSeriveTime, int maxServiceTime,
			int clientArriveValInterval) {
		
		this.simluationDuration = simluationDuration;
		this.employeeCount = employeeCount;
		this.minSeriveTime = minSeriveTime;
		this.maxServiceTime = maxServiceTime;
		this.clientArriveValInterval = clientArriveValInterval;
	}
	public int getSimluationDuration() {
		return simluationDuration;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public int getMinSeriveTime() {
		return minSeriveTime;
	}
	public int getMaxServiceTime() {
		return maxServiceTime;
	}
	public int getClientArriveValInterval() {
		return clientArriveValInterval;
	}
	public void setSimluationDuration(int simluationDuration) {
		this.simluationDuration = simluationDuration;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	public void setMinSeriveTime(int minSeriveTime) {
		this.minSeriveTime = minSeriveTime;
	}
	public void setMaxServiceTime(int maxServiceTime) {
		this.maxServiceTime = maxServiceTime;
	}
	public void setClientArriveValInterval(int clientArriveValInterval) {
		this.clientArriveValInterval = clientArriveValInterval;
	}
	 
	
	 
	 
	 
	 

}
