package simulateur;

  import  java.util.ArrayList;

public class Queue {
     Client client;
	ArrayList<Client> queue = new ArrayList<>();
	
	public boolean isEmpty() {
		if(queue.size()==0) {
			return true;
		}else {
			return false;
		}
	}
	public void addQueueLast(Client client) {
		queue.add(client);
	}
	
	public Client getQueueFirst() {
		return queue.get(0);		
	}
	
	public void updateClientPatience() {
		for(int i=0;i<queue.size();i++) {
			queue.get(i).setPatience(queue.get(i).getPatience()+1);
		}
		for(int i=0;i<queue.size();i++) {
			if(queue.get(i).getPatience()==7) {
				queue.get(i).statisticManager.registerNonServedClient(client);
			    queue.remove(i);
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
    
}
