package br.com.solidprinciples.o.v2;

import br.com.solidprinciples.o.v1.HealthInsuranceSurveyor;

public class ClaimApprovalManagerUpdated {
    public void processHealthClaim (HealthInsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
    public void processVehicleClaim (VehicleInsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}