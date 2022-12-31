package simulateur;

public class Client {
	private int arriveTime;
	private int serviceStartTime;
	private int departureTime;
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
	
}
