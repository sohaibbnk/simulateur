package simulateur;

public class Client {
	
	private int arriveTime;
	private int serviceStartTime;
	private int departureTime;
	private int patience;
	private int id;
	StatisticManager statisticManager;
	Queue que;
	Employee employe;
	//constructor
	public Client(int id,int arriveTime , int serviceStartTime , int departureTime,StatisticManager statisticManager) {
     this.id=id;
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
		return "Client [arriveTime=" + arriveTime + ", serviceStartTime=" + serviceStartTime + ", departureTime="
				+ departureTime + ", id=" + id + ", employe=" + employe.getId() + "]";
	}

	

	
	
	
	
	
	
	
	
	
}
