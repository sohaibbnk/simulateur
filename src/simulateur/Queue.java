package simulateur;

  import  java.util.ArrayList;

public class Queue {
     Client client;
	ArrayList<Client> cl = new ArrayList<>();
	
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
	
	public void removeQueueFirst() {
		if(cl!=null)
			cl.remove(0);
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
			for(int i=0;i<cl.size();i++){
				if(cl.get(i).getServiceStartTime()==7){
					System.out.println("////////// "+cl.get(i).getId());
					cl.get(i).statisticManager.registerNonServedClient(client);
					cl.remove(i);
				}
			}
		}	
		
	}
	
	
	
	
	
	
	
	
	
	
    
}
