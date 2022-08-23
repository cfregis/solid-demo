package br.com.solidprinciples.o.v2;

import br.com.solidprinciples.o.v1.HealthInsuranceSurveyor;

public class OCPMain2 {

	public static void main(String[] args) {
		HealthInsuranceSurveyor h = new HealthInsuranceSurveyor();
		
		VehicleInsuranceSurveyor v = new VehicleInsuranceSurveyor();
		
		ClaimApprovalManagerUpdated c = new ClaimApprovalManagerUpdated();
		c.processHealthClaim(h);
		c.processVehicleClaim(v);
	}

}
