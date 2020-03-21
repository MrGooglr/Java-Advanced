package tests.aniket.springboot.testspringboot.beans;

import java.math.BigDecimal;

public class EligibilityInputs {

	
	private String lanID;
	private String branch_name;
	private BigDecimal tenor = new BigDecimal(0);
	private String programType;
	
	
	
	
	public String getProgramType() {
		return programType;
	}
	public void setProgramType(String programType) {
		this.programType = programType;
	}
	public String getLanID() {
		return lanID;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public BigDecimal getTenor() {
		return tenor;
	}
	public void setLanID(String lanID) {
		this.lanID = lanID;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public void setTenor(BigDecimal tenor) {
		this.tenor = tenor;
	}
	
	
	
	
}
