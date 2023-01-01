package simulateur;

import java.util.ArrayList;

public class StatisticManager {
	ArrayList<Client> listServedClient = new ArrayList<>();
	ArrayList<Client> listNonServedClient = new ArrayList<>();
<<<<<<< HEAD
	public StatisticManager() {
		// TODO Auto-generated constructor stub
	}
	
	
 public void registerServedClient(Client client) {
=======
 
	public void registerServedClient(Client client) {
>>>>>>> 4f4e3f73d73ae2612c8eb4333441477067fb5d75
	 listServedClient.add(client);
 }
 
 public void registerNonServedClient(Client client) {
	 listNonServedClient.add(client);
 }
<<<<<<< HEAD
=======
 
 public double calculateAverageEmployOccupationRate(int nbrEmlpoyee) {
	 int occupationTime=0;
	 for(int i=0;i<listServedClient.size();i++) {
		 occupationTime = occupationTime + listServedClient.get(i).getServiceTime();
		  
	 }
	 return (double) occupationTime/nbrEmlpoyee;
 }
 
 
  

>>>>>>> 4f4e3f73d73ae2612c8eb4333441477067fb5d75


@Override
public String toString() {
	return "StatisticManager [listServedClient=" + listServedClient + ", listNonServedClient=" + listNonServedClient
			+ "]";
}

}
