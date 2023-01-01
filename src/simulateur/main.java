package simulateur;

import java.util.Random;

public class main {

	public static void main(String[] args) {

		SimulationEntry sumE=new SimulationEntry(200,3,10,20,7);
		SimulationUtility simulationUtility=new SimulationUtility();
		StatisticManager statisticManager=new StatisticManager();
		Simulation sm=new Simulation(sumE,statisticManager,simulationUtility);
		sm.simulate(sumE);
	}
}
