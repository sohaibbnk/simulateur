package simulateur;

public class SimulationEntry {
<<<<<<< HEAD
	 private int simluationDuration;
	 private int employeeCount;
	 private int minSeriveTime;
	 private int ServiceTime;
	 private int clientArriveValInterval;
	 
	 public SimulationEntry(int simluationDuration,int employeeCount,int minSeriveTime,int ServiceTime,int clientArriveValInterval) {
		 
	 this.simluationDuration=simluationDuration;
	 this.employeeCount=employeeCount;
	 this.minSeriveTime=minSeriveTime;
	 this.ServiceTime=ServiceTime;
	 this.clientArriveValInterval=clientArriveValInterval;
	 }
	 
	 public int getSimluationDuration() {
			return simluationDuration;
		}
=======
	
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
	 
	
	 
	 
	 
	 
>>>>>>> 40b815da5012e6b9a776a7066eeff22fcecc3677

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

		@Override
		public String toString() {
			return "SimulationEntry [simluationDuration=" + simluationDuration + ", employeeCount=" + employeeCount
					+ ", minSeriveTime=" + minSeriveTime + ", ServiceTime=" + ServiceTime + ", clientArriveValInterval="
					+ clientArriveValInterval + "]";
		}
		
}
