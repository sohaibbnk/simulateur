package simulateur;

public class Simulation {
	SimulationEntry simulationEntry;
	SimulationUtility simulationUtility;
	StatisticManager statisticManager;
	
	
	
 
<<<<<<< HEAD
 //constructor
 public Simulation(SimulationEntry sumE) {
	 this.simluationDuration=sumE.getSimluationDuration();
	 Agency Ag=new Agency(sumE.getEmployeeCount());
}
 
public int getSimluationDuration() {
	return simluationDuration;
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

public void simulate(SimulationEntry se) {
	
	for(int i=0 ; i< se.getSimluationDuration() ; i++){
	  	
	}
}
=======
 
 public Simulation(SimulationEntry simulationEntry) {
		Agence agance = new Agence(this.simulationEntry.getEmployeeCount());
		
		
	}





//constructor
 public Simulation() {}
 

>>>>>>> 40b815da5012e6b9a776a7066eeff22fcecc3677
 
}
