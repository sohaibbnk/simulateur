package simulateur;

import java.util.ArrayList;

public class Agency {
	
    ArrayList<Employee>em=new ArrayList<>();
    Queue qu;
    
	public Agency(int nbrEmploye) {
		for(int i=0 ;i<nbrEmploye;i++) {
			Employee emp=new Employee(0);
			em.add(emp);
		}
	}

}
