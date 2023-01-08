package simulateur;

  import  java.util.ArrayList;

public class Queue {
     Client client;
     int ArrivelTime;
     int PatienceClient;
     ArrayList<Employee> em;
	ArrayList<Client> cl = new ArrayList<>();
	
	public Queue(ArrayList<Employee> em,int ArrivelTime,int PatienceClient){
		this.em=em;
		this.PatienceClient=PatienceClient;
		this.ArrivelTime=ArrivelTime;
	}
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
				cl.get(i).setPatience(cl.get(i).getPatience()+1);
			
			}
			for(int i=0;i<cl.size();i++){
				if(cl.get(i).getPatience()==PatienceClient){
					System.out.println(cl.get(i));
					cl.get(i).setDepartureTime(cl.get(i).getArriveTime()+cl.get(i).getPatience());
					//System.out.println("////////// "+cl.get(i));
					cl.get(i).statisticManager.registerNonServedClient(cl.get(i));
					cl.remove(i);
				}
			}
		}	
		
	}
	
	public void updateEmployeePatience() {
		 for( int k=0;k<em.size(); k++) {
				if(!em.get(k).isFree()){
					em.get(k).work();
				}
			}
	}
	
	
	
	
	
	
	
	
	
	
    
}
