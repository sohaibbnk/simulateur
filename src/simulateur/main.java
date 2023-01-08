package simulateur;

import java.util.ArrayList;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		//SimulationEntry sumE=new SimulationEntry(35,3,10,25,5,7);
		//SimulationEntry sumE=new SimulationEntry(50,3,10,25,5,7);
	    //SimulationEntry sumE=new SimulationEntry(35,4,10,25,5,7);
		SimulationEntry sumE=new SimulationEntry(700,3,10,25,5,7);
		SimulationUtility simulationUtility=new SimulationUtility();
		StatisticManager statisticManager=new StatisticManager();
		Simulation sm=new Simulation(sumE,statisticManager,simulationUtility);				
		System.out.println("ID CLIENT|   ARRIVE TIME  |	SERVICE START TIME|	DEPARTEUR TIME 	        |       EMPLOYEE 	|      PATIENCE         |             TEMP RESR     |");
		System.out.println("_ _ _ _ _|_ _ _ _ _ _ _ _ | _ _ _ _ _ _ _ _ _ _ _ _|_ _ _ _ _ _ _ _ _ _  _ _ _ _|_ _ _ _ _ _ _ _ _ _ _ _| _ _ _ _ _ _ _ _ _ _ _ |_ _ _ _ _ _ _ _ _ _ _  _ _ |");
		sm.simulate(sumE);
		System.out.println("_ _ _ _ _|_ _ _ _ _ _ _ _ | _ _ _ _ _ _ _ _ _ _ _ _|_ _ _ _ _ _ _ _ _ _  _ _ _ _|_ _ _ _ _ _ _ _ _ _ _ _| _ _ _ _ _ _ _ _ _ _ _ |_ _ _ _ _ _ _ _ _ _ _  _ _ |");
		System.out.println(sm.simulationResultate());
		


	}

}
