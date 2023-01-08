package simulateur;

public class SimulationEntry {
	
	 private int simluationDuration;
	 private int employeeCount;
	 private int minSeriveTime;
	 private int ServiceTime;
	 private int clientArriveValInterval;
	 private int maxServiceTime;
	 private int patienceClient;
	 
	 public SimulationEntry(int simluationDuration,int employeeCount,int minSeriveTime,int maxSeriveTime,int clientArriveValInterval,int patienceClient) {
		 
	 this.simluationDuration=simluationDuration;
	 this.employeeCount=employeeCount;
	 this.minSeriveTime=minSeriveTime;
	 this.maxServiceTime=maxSeriveTime;
	 this.clientArriveValInterval=clientArriveValInterval;
	 this.patienceClient=patienceClient;
	 this.ServiceTime=ServiceTime;
	 this.clientArriveValInterval=clientArriveValInterval;
	 }
	 
	 public int getMaxServiceTime() {
		return maxServiceTime;
	}

	public void setMaxServiceTime(int maxServiceTime) {
		this.maxServiceTime = maxServiceTime;
	}

	public int getSimluationDuration() {
			return simluationDuration;
		}
	

		public int getPatienceClient() {
		return patienceClient;
	}

	public void setPatienceClient(int patienceClient) {
		this.patienceClient = patienceClient;
	}

		public void setSimluationDuration(int simluationDuration) {
			this.simluationDuration = simluationDuration;
		}

		public int getEmployeeCount() {
			return employeeCount;
		}

		public void setEmployeeCount(int employeeCount) {
			this.employeeCount = employeeCount;
		}

		public int getMinSeriveTime() {
			return minSeriveTime;
		}

		public void setMinSeriveTime(int minSeriveTime) {
			this.minSeriveTime = minSeriveTime;
		}

		public int getServiceTime() {
			return ServiceTime;
		}

		public void setServiceTime(int serviceTime) {
			ServiceTime = serviceTime;
		}

		public int getClientArriveValInterval() {
			return clientArriveValInterval;
		}

		public void setClientArriveValInterval(int clientArriveValInterval) {
			this.clientArriveValInterval = clientArriveValInterval;
		}

		
}
