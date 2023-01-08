package simulateur;

public class Client {
	
	private int arriveTime;
	private int serviceStartTime;
	private int departureTime;
	private int patience;
	private int id;
	private int restTime;
	StatisticManager statisticManager;
	Queue que;
	Employee employe;
	//constructor
	public Client(int id,int arriveTime , int serviceStartTime , int departureTime,StatisticManager statisticManager,int restTime) {
     this.id=id;
     this.restTime=restTime;
	 this.arriveTime=arriveTime;
	 this.serviceStartTime=serviceStartTime;
	 this.departureTime=departureTime;
	 this.statisticManager=statisticManager;
	}

	public int getPatience() {
		return patience;
	}
	
	public void setPatience(int patience) {
		this.patience = patience;
	}
	
	
	public Employee getEmploye() {
		return employe;
	}

	public void setEmploye(Employee employe) {
		this.employe = employe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client() {}
	
	public int getArriveTime() {
		return arriveTime;
	}
	
	public int getServiceStartTime() {
		return serviceStartTime;
	}
	
	public int getDepartureTime() {
		return departureTime;
	}
	
	public void setArriveTime(int arriveTime) {
		this.arriveTime = arriveTime;
	}
	
	public void setServiceStartTime(int serviceStartTime) {
		this.serviceStartTime = serviceStartTime;
	}
	
	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	///fateh 

	@Override
	public String toString() {
		if(employe!=null)
		return  " "+id+"	 |	  "+arriveTime +"	  |		"+ serviceStartTime +"	   |	       "+departureTime +"		|	 "+ employe.getId()+"		|	"+patience+" unite"+" 	|		"+restTime+"          |";
		else 
		return  " "+id+"	 |	  "+arriveTime +"	  |	    non served	   |       non served	        |   	vide		|       "+patience+" unite"+" 	|		"+restTime+"          |";
	}

	

	
	
	
	
	
	
	
	
	
}
