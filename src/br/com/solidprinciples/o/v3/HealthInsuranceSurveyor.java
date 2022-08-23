package br.com.solidprinciples.o.v3;

public class HealthInsuranceSurveyor extends InsuranceSurveyor{
	
	public boolean isValidClaim(){
		System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
		/*Logic to validate health insurance claims*/
		return true;
	}
}
