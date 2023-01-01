package simulateur;

public class Client {
	
	private int arriveTime;
	private int serviceTime;
	private int departureTime;
	private int patience;
	StatisticManager statisticManager;
<<<<<<< HEAD
	Queue que;
	Employee employe;
	//constructor
	public Client(int arriveTime , int serviceStartTime , int departureTime,StatisticManager statisticManager) {
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
				+ departureTime + "]";
	}
=======
	Queue queue;
	
	
	public Client() {}
	
	public int getPatience() {
		return patience;
	}

	public void setPatience(int patience) {
		this.patience = patience;
	}

	

	public int getArriveTime() {
		return arriveTime;
	}

	public int getServiceTime() {
		return serviceTime;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setArriveTime(int arriveTime) {
		this.arriveTime = arriveTime;
	}

	public void setServiceTime(int serviceTime) {
		this.serviceTime = serviceTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
>>>>>>> 4f4e3f73d73ae2612c8eb4333441477067fb5d75
	
	
	
	
	
	
	
}
