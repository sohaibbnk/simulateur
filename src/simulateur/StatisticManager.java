package simulateur;

import java.util.ArrayList;

public class StatisticManager {
	ArrayList<Client> listServedClient = new ArrayList<>();
	ArrayList<Client> listNonServedClient = new ArrayList<>();
 public void registerServedClient(Client client) {
	 listServedClient.add(client);
 }
 
 public void registerNonServedClient(Client client) {
	 listNonServedClient.add(client);
 }
 
 
  




}
