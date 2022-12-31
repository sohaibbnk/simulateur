package simulateur;

import java.util.ArrayList;

public class Agence {
	
	private int nbrEmployee;
	ArrayList<Employee> listEmployee = new ArrayList<>();
	
	
	public Agence(int nbrEmployee) {
		this.nbrEmployee = nbrEmployee;
		for(int i=0; i<this.nbrEmployee;i++) {
			Employee employee = new Employee();
			listEmployee.add(employee);
		}
		
		
	}
	
	

	
	
	

}
