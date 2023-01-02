package simulateur;

import java.util.ArrayList;
import java.util.Random;

public class main {

	public static void main(String[] args) {

		//SimulationEntry sumE=new SimulationEntry(35,3,15,20,7);
		//SimulationEntry sumE=new SimulationEntry(50,3,15,20,7);
	    //SimulationEntry sumE=new SimulationEntry(35,4,15,20,7);
		SimulationEntry sumE=new SimulationEntry(700,3,15,20,7);
		SimulationUtility simulationUtility=new SimulationUtility();
		StatisticManager statisticManager=new StatisticManager();
		Simulation sm=new Simulation(sumE,statisticManager,simulationUtility);
		sm.simulate(sumE);


	}

}
