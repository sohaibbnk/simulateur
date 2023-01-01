package simulateur;

import java.util.ArrayList;
import java.util.Random;

public class Simulation {
	SimulationEntry simulationEntry;
	SimulationUtility simulationUtility;
	StatisticManager statisticManager;
    ArrayList<Client>listClient=new  ArrayList<>();
	Agency Ag;
	Queue que;
	Client cln;
	Random rand=new Random();
	int random,j;
	
	 //constructor
 public Simulation(SimulationEntry sumE,StatisticManager statisticManager,SimulationUtility simulationUtility) {
	  Ag=new Agency(sumE.getEmployeeCount());
	  this.simulationUtility=simulationUtility;
	  this.statisticManager=statisticManager;
}


public void simulate(SimulationEntry se){
	int chaque5unite=0;
	for(int i=0 ; i< se.getSimluationDuration() ; i++){
		
		Ag.qu.updateClientPatience();
	   
		if( i==chaque5unite+5) {
			chaque5unite=i;
			Client client=new Client( i , 0 , 0 , statisticManager);
			listClient.add(client);
			random=rand.nextInt(10,21);
			
			Ag.qu.addQueueLast(client);
			
               Employee EM=Ag.getEmployee();
                 
					if( EM.isFree() || EM.serviceFinished()) {
						
						if(EM.serviceFinished() &&  !EM.isFree()) {
							statisticManager.registerServedClient(EM.client);//get client de employee
							EM.client=null;
						}
						
						EM.serves(client, random);
					   break;
					}
				
			
		}
	  	
	}
}

 
}
