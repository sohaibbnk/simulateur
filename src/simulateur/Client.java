package simulateur;

public class Client {
	
	private int arriveTime;
	private int serviceStartTime;
	private int departureTime;
<<<<<<< HEAD
	Queue que;
	//constructor
	public Client(int arriveTime , int serviceStartTime , int departureTime) {
	 this.arriveTime=arriveTime;
	 this.serviceStartTime=serviceStartTime;
	 this.departureTime=departureTime;
	}
	public int getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(int arriveTime) {
		this.arriveTime = arriveTime;
	}
	public int getServiceStartTime() {
		return serviceStartTime;
	}
	public void setServiceStartTime(int serviceStartTime) {
		this.serviceStartTime = serviceStartTime;
	}
	public int getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	@Override
	public String toString() {
		return "Client [arriveTime=" + arriveTime + ", serviceStartTime=" + serviceStartTime + ", departureTime="
				+ departureTime + "]";
	}
=======
	private int patience;
	StatisticManager statisticManager;
	
	
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
	
	
	
	
	
>>>>>>> 40b815da5012e6b9a776a7066eeff22fcecc3677
	
	
}
