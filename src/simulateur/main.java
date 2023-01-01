package simulateur;

<<<<<<< HEAD
import java.util.Random;

public class main {

	public static void main(String[] args) {

		SimulationEntry sumE=new SimulationEntry(200,3,10,20,7);
		SimulationUtility simulationUtility=new SimulationUtility();
		StatisticManager statisticManager=new StatisticManager();
		Simulation sm=new Simulation(sumE,statisticManager,simulationUtility);
		sm.simulate(sumE);
=======
public class Main {

	public static void main(String[] args) {
		
		SimulationEntry simulationEntry = new SimulationEntry(700, 3, 10, 20, 5);
		

>>>>>>> 4f4e3f73d73ae2612c8eb4333441477067fb5d75
	}
}
