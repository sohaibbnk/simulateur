package simulateur;

import java.util.ArrayList;

public class Queue {
    Client cl;
    ArrayList<Client> client=new ArrayList<>();
    
	public boolean isEmpty() {
		if(client.size()==0)
			return true;
		else return false;
	}
	
	public void addQueueFirst(Client client) {
	}
	
	public Client getQueueFirst() {
		return client.get(0);
	}
}
