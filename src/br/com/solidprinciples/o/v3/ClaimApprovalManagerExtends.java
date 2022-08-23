package br.com.solidprinciples.o.v3;

public class ClaimApprovalManagerExtends {
	public void processClaim(InsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}