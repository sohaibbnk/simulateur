package simulateur;

import java.util.ArrayList;

public class Simulation {
	SimulationEntry simulationEntry;
	SimulationUtility simulationUtility;
	StatisticManager statisticManager;
	Agence agance;
	ArrayList<Client> listClients = new ArrayList<>(); //tous les clients creat par le simulateure 
	
	
 
 
 public Simulation(SimulationEntry simulationEntry) {
		 agance = new Agence(this.simulationEntry.getEmployeeCount());
		
		
	}





//constructor
 public Simulation() {}
 

 
}
