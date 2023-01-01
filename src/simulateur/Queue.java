package simulateur;

  import  java.util.ArrayList;

public class Queue {
     Client client;
<<<<<<< HEAD
	ArrayList<Client> cl = new ArrayList<>();
=======
	ArrayList<Client> queue = new ArrayList<>(); /// les clients arrive dans le simulateur 
	
	public Queue() {}
>>>>>>> 4f4e3f73d73ae2612c8eb4333441477067fb5d75
	
	public boolean isEmpty() {
		if(cl.size()==0) {
			return true;
		}else {
			return false;
		}
	}
	public void addQueueLast(Client client) {
		cl.add(client);
	}
	
	public Client getQueueFirst() {
		return cl.get(0);		
	}
	
	public void updateClientPatience() {
		if(cl.size()!=0) {
			
			for(int i=0;i<cl.size();i++) {
				//cl.get(i).setPatience(cl.get(i).getPatience()+1);
				cl.get(i).setServiceStartTime(cl.get(i).getServiceStartTime()+1);
			
			}
			for(int i=0;i<cl.size();i++) {
				if(cl.get(i).getServiceStartTime()==7) {
					cl.get(i).statisticManager.registerNonServedClient(client);
					cl.remove(i);
				}
			}
		}	
		
	}
	
	
	
	
	
	
	
	
	
	
    
}
