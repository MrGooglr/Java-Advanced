package tests.aniket.springboot.testspringboot;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tests.aniket.springboot.testspringboot.beans.EligibilityInputs;
import tests.aniket.springboot.testspringboot.beans.EligibilityOutputs;

@RestController
public class EligGenController {

	@PostMapping("/unsecuredV2")
	public List<EligibilityOutputs> addElig(@RequestBody EligibilityInputs eligibilityInputs) {
		List<EligibilityOutputs> listToReturn = new ArrayList<>();
		EligibilityOutputs stdregreply = new EligibilityOutputs();
		
		if("PSBL".equalsIgnoreCase(eligibilityInputs.getProgramType())) {
			stdregreply = psblEligMethod(eligibilityInputs);
			listToReturn.add(stdregreply);
		}else {
			stdregreply.setLoanID(eligibilityInputs.getLanID());
			stdregreply.setRemarks("INVALID PROGRAM");
			listToReturn.add(stdregreply);
		}
		
		return listToReturn;
	}

	public static EligibilityOutputs psblEligMethod(EligibilityInputs eligibilityInputs) {
		EligibilityOutputs eligibilityOutputs = new EligibilityOutputs();
		
		BigDecimal eli = new BigDecimal(255);
		
		eli = eli.multiply(eligibilityInputs.getTenor());
		
		eligibilityOutputs.setLoanID(eligibilityInputs.getLanID());
		eligibilityOutputs.setAmount(eli);
		eligibilityOutputs.setRemarks("FROM PSBL");
		
		return eligibilityOutputs;
	}
	
}
