package simulateur;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.BiConsumer;

public class Simulation {
	SimulationEntry simulationEntry;
	SimulationUtility simulationUtility;
	StatisticManager statisticManager;
    ArrayList<Client>listClient=new  ArrayList<>();
	Agency Ag;
	double average;
	Queue que;
	Client cln;
	Random rand=new Random();
	//int [] monTableau = {5,10,15,20};
	int random,j;
	
	 //constructor
 public Simulation(SimulationEntry sumE,StatisticManager statisticManager,SimulationUtility simulationUtility) {
	  Ag=new Agency(sumE.getEmployeeCount() ,sumE.getClientArriveValInterval(),sumE.getPatienceClient());
	  this.simulationUtility=simulationUtility;
	  this.statisticManager=statisticManager;
	  this.simulationEntry=sumE;
}


public void simulate(SimulationEntry se){
	int chaque5unite=0,k,i,id=0;
	Employee EM;
for( i=0 ; i< se.getSimluationDuration() ; i++){
		
		Ag.qu.updateClientPatience();
		Ag.qu.updateEmployeePatience();

		
	     if(i==chaque5unite+simulationEntry.getClientArriveValInterval()) {
			chaque5unite=i;
			random=rand.nextInt(simulationEntry.getMinSeriveTime(),simulationEntry.getMaxServiceTime()+1);
			Client client=new Client(++id , i , 0 , 0 , statisticManager,random);
			listClient.add(client);
			//random=monTableau[(int) Math.floor(Math.random()*monTableau.length)];
			Ag.qu.addQueueLast(client);	
			//System.out.print("client"+client.getId()+" ");
			
			//simulationUtility.printClientArrival(client.getId());
	        
	     }
	          if(Ag.qu.cl.size()!=0) {
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
						//System.out.print("client"+Ag.qu.getQueueFirst().getId()+" ");
						
						//simulationUtility.printClientDeparteur(Ag.qu.getQueueFirst().getId());
						
						Ag.qu.getQueueFirst().setServiceStartTime(i);
						Ag.qu.getQueueFirst().setDepartureTime(i+random);
						//System.out.println("ssss "+Ag.qu.cl.get(0));
						System.out.println(Ag.qu.cl.get(0));
						Ag.qu.removeQueueFirst();
					}
		      }
          }
		
	     
	}
	for(k=0;k<Ag.em.size();k++) {//dernier client pour chaque employee apre fin des unités de temp
		if(Ag.em.get(k).client!=null)
	       statisticManager.listServedClient.add(Ag.em.get(k).client);
	}

  }

 public String simulationResultate() {
	 
	 average=statisticManager.calculateAverageEmployOccupationRate(simulationEntry.getEmployeeCount());
	 
	 return "\nDuree de simulation : "+simulationEntry.getSimluationDuration()+"\n"+
            "Nombre de clients servis : "+statisticManager.listServedClient.size()+"\n"+
            "Temps d'attente moyen des clients : "+statisticManager.moyenTempDesClient()+"\n"+
            "Temps moyen de service client : "+statisticManager.moyenTempServiceClient()+"\n"+
            "Taux d'occupation employe : "+Math.floor(statisticManager.occupationDesOmployee(average,simulationEntry.getSimluationDuration()))+" %\n"+
            "Nombre de clients non servis : "+statisticManager.listNonServedClient.size()+"\n";
 }

}
