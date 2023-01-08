package simulateur;

import java.util.ArrayList;
import java.util.Random;

public class Agency {
	
    ArrayList<Employee>em=new ArrayList<>();
	Random rand=new Random();
    Queue qu;
    int j;
    
	public Agency(int nbrEmploye , int ArrivelTime,int PatienceClient) {
		qu=new Queue(em,ArrivelTime,PatienceClient);
		for(int i=0 ;i<nbrEmploye;i++) {
			Employee emp=new Employee(0);
			emp.setId(i);
			em.add(emp);
		}
	}
	
	public Employee getEmployee() {
		
		for( j=0 ; j<em.size() ; j++) {
			if(em.get(j).isFree() || em.get(j).serviceFinished())
				break;
		}
		
		if(j!=em.size()) {//exist minimaum un employee libre

			do {
				int randEmploye=rand.nextInt(em.size());
				if(em.get(randEmploye).isFree() || em.get(randEmploye).serviceFinished()) {
					return em.get(randEmploye);
				}
				

			}while(true);
			
		} return null;
	}

}
