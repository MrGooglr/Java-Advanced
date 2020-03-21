package tests.aniket.springboot.testspringboot.beans;

import java.math.BigDecimal;

public class EligibilityOutputs {

	private String loanID;
	private BigDecimal amount = new BigDecimal(0);
	private String remarks;
	
	

	public String getLoanID() {
		return loanID;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setLoanID(String loanID) {
		this.loanID = loanID;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
