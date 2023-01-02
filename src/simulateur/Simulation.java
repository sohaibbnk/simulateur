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
	int [] monTableau = {5,10,15,20};
	int random,j;
	
	 //constructor
 public Simulation(SimulationEntry sumE,StatisticManager statisticManager,SimulationUtility simulationUtility) {
	  Ag=new Agency(sumE.getEmployeeCount());
	  this.simulationUtility=simulationUtility;
	  this.statisticManager=statisticManager;
}


public void simulate(SimulationEntry se){
	int chaque5unite=0,k,i,id=0;
	Employee EM;
	for( i=0 ; i< se.getSimluationDuration() ; i++){
		
		Ag.qu.updateClientPatience();
	     if(i==chaque5unite+5) {
			chaque5unite=i;
			Client client=new Client(++id , i , 0 , 0 , statisticManager);
			listClient.add(client);
			random=monTableau[(int) Math.floor(Math.random()*monTableau.length)];
			
			Ag.qu.addQueueLast(client);
			
			System.out.print("client"+client.getId()+" ");
			simulationUtility.printClientArrival(i);
               EM=Ag.getEmployee();
                 if(EM!=null) {
                	 
					if( EM.isFree() || EM.serviceFinished()) {
						if(!EM.isFree() && EM.serviceFinished()){
							statisticManager.registerServedClient(EM.client);//get client de employee
							EM.client=null;
						}
						Ag.qu.getQueueFirst().employe=EM;
						if(Ag.qu.cl.get(0).getServiceStartTime()<se.getSimluationDuration())
						EM.serves(Ag.qu.getQueueFirst(), random);
						System.out.print("client"+Ag.qu.getQueueFirst().getId()+" ");
						simulationUtility.printClientDeparteur(i);
						Ag.qu.getQueueFirst().setServiceStartTime(i);
						Ag.qu.getQueueFirst().setDepartureTime(i+random);
						//System.out.println("ssss "+Ag.qu.cl.get(0));
						System.out.println("random="+random+" "+Ag.qu.cl.get(0));
						Ag.qu.removeQueueFirst();
					}
	
		      }
		
	     }else {
	    	 for( k=0;k<Ag.em.size(); k++) {
					if(!Ag.em.get(k).isFree()){
						Ag.em.get(k).work();
						//int nouvelValeur=Ag.em.get(k).client.getDepartureTime();
						//Ag.em.get(k).client.setDepartureTime(nouvelValeur-5);	
						//EM.setRemainingServiceTime(nouvelValeur-5);
					}
				}	
	     }
	}
	for(k=0;k<Ag.em.size();k++) {//dernier client pour chaque employee apre fin des unités de temp
		if(Ag.em.get(k).client!=null)
	       statisticManager.listServedClient.add(Ag.em.get(k).client);
	}
    System.out.println("fin = file attent "+Ag.qu.cl.size()+" | les client sevrved "+statisticManager.listServedClient.size()+" | les client noServred "+statisticManager
    		.listNonServedClient.size()); 
    
    for(k=0;k<Ag.em.size();k++) {
    	
    	System.out.println("employe "+k+" have->"+Ag.em.get(k).getTotalTime()+" client");
    }
  }

}
