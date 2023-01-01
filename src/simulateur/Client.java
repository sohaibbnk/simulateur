package simulateur;

public class Client {
	
	private int arriveTime;
	private int serviceStartTime;
	private int departureTime;
	private int patience;
	StatisticManager statisticManager;
	Queue queue;
	
	
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
	
	
	
	
	
	
	
}
