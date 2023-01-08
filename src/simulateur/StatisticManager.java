package simulateur;

import java.util.ArrayList;

public class StatisticManager {
	ArrayList<Client> listServedClient = new ArrayList<>();
	ArrayList<Client> listNonServedClient = new ArrayList<>();
	int i,tempMoyen;
	public StatisticManager() {
		// TODO Auto-generated constructor stub
	}
	
	
 public void registerServedClient(Client client) {
	 listServedClient.add(client);
 }
 
 public void registerNonServedClient(Client client) {
	 listNonServedClient.add(client);
 }
 public double moyenTempDesClient() {
	 tempMoyen=0;
	 for(i=0 ;i<listServedClient.size() ; i++) {
		 tempMoyen+= listServedClient.get(i).getPatience();
	 }
	 for(i=0 ;i<listNonServedClient.size() ; i++) {
	  tempMoyen+= listNonServedClient.get(i).getPatience();
	 }
	 return tempMoyen/(listNonServedClient.size()+listServedClient.size());
	 	 
 }
 
 public double moyenTempServiceClient() {
	 tempMoyen=0;
	 for(i=0 ;i<listServedClient.size() ; i++) {
		 tempMoyen+=( listServedClient.get(i).getDepartureTime() - listServedClient.get(i).getServiceStartTime() );
	 }
	 return tempMoyen/(listServedClient.size());
 }
 
 
 public double calculateAverageEmployOccupationRate(int nbrEmlpoyee) {
	 int occupationTime=0;
	 for(int i=0;i<listServedClient.size();i++) {
		 
		 occupationTime+=( listServedClient.get(i).getDepartureTime() - listServedClient.get(i).getServiceStartTime() );

	 }
	 return (double) occupationTime/nbrEmlpoyee;
 }
 
 
 public double occupationDesOmployee(double average, int SimluationDuration) {
	 
  return (average*100)/SimluationDuration;
  
 }

@Override
public String toString() {
	return "StatisticManager[listNonServedClient=" + listNonServedClient
			+ "]";
}

}
