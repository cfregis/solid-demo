package br.com.solidprinciples.o.v3;


public class OCPMain3 {

	public static void main(String[] args) {
		HealthInsuranceSurveyor h = new HealthInsuranceSurveyor();
		
		VehicleInsuranceSurveyor v = new VehicleInsuranceSurveyor();
		
		ClaimApprovalManagerExtends c = new ClaimApprovalManagerExtends();
		c.processClaim(h);
		c.processClaim(v);
	}

}
