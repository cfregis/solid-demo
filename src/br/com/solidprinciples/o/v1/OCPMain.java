package br.com.solidprinciples.o.v1;

public class OCPMain {

	public static void main(String[] args) {
		HealthInsuranceSurveyor h = new HealthInsuranceSurveyor();
		ClaimApprovalManager c = new ClaimApprovalManager();
		c.processHealthClaim(h);				
				
	}

}
