package simulateur;

public class main {

	public static void main(String[] args) {
		SimulationEntry sumE=new SimulationEntry(700,3,10,20,7);
		Simulation sm=new Simulation(sumE);
		sm.simulate(sumE);
	}

}
