package br.com.solidprinciples.o.v1;

public class ClaimApprovalManager {
	public void processHealthClaim (HealthInsuranceSurveyor surveyor){
		if(surveyor.isValidClaim()){
			System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
		}
	}
}
