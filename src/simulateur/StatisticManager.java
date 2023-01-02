package simulateur;

import java.util.ArrayList;

public class StatisticManager {
	ArrayList<Client> listServedClient = new ArrayList<>();
	ArrayList<Client> listNonServedClient = new ArrayList<>();
	public StatisticManager() {
		// TODO Auto-generated constructor stub
	}
	
	
 public void registerServedClient(Client client) {
	 listServedClient.add(client);
 }
 
 public void registerNonServedClient(Client client) {
	 listNonServedClient.add(client);
 }


@Override
public String toString() {
	return "StatisticManager[listNonServedClient=" + listNonServedClient
			+ "]";
}

}
