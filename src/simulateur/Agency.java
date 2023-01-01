package simulateur;

import java.util.ArrayList;
import java.util.Random;

public class Agency {
	
    ArrayList<Employee> em =new ArrayList<>();
	Random rand=new Random();
    Queue qu;
    int j;
    
	public Agency(int nbrEmploye) {
		qu=new Queue();
		for(int i=0 ;i<nbrEmploye;i++) {
			Employee emp=new Employee(0);
			em.add(emp);
		}
	}
	
	public Employee getEmployee() {
		
		for( j=0 ; j<em.size() ; j++) {
			if(em.get(j).isFree())
				break;
		}
		
		if(j!=em.size()) {//exist minimaum un employee libre

			do {
				int randEmploye=rand.nextInt(em.size());
				return em.get(randEmploye);

			}while(true);
			
		} return null;
	}

}
