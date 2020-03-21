package tests.aniket.springboot.testspringboot.beans;

import java.util.ArrayList;
import java.util.List;

public class EligibilityWorker {

	
	private List<EligibilityInputs> eligibilityList;
	
	private static EligibilityWorker eligibilityWorker;
	
	
	private EligibilityWorker() {
		eligibilityList = new ArrayList<>();
	}
	
	public static EligibilityWorker getInstance() {
		if(eligibilityWorker ==null) {
			eligibilityWorker = new EligibilityWorker();
			return eligibilityWorker;
		}else {
			return eligibilityWorker;
		}
	}
	
	public List<EligibilityInputs> getEligRecords() {
	    return eligibilityList;
	    }
	
	  public void add(EligibilityInputs student) {
		  eligibilityList.add(student);
		    }
	
}
