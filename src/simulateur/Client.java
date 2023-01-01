package simulateur;

public class Client {
	
	private int arriveTime;
	private int serviceTime;
	private int departureTime;
	private int patience;
	StatisticManager statisticManager;
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
	
	
	
	
	
	
	
}
