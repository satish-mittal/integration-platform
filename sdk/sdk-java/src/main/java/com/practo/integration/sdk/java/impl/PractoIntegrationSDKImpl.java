package com.practo.integration.sdk.java.impl;

import com.practo.integration.sdk.java.AppointmentDetails;
import com.practo.integration.sdk.java.DoctorDetails;
import com.practo.integration.sdk.java.PatientDetails;
import com.practo.integration.sdk.java.PractoIntegrationSDK;
import com.practo.integration.sdk.java.SDKException;

public class PractoIntegrationSDKImpl implements PractoIntegrationSDK {
    
    public PractoIntegrationSDKImpl(String agentHost, int agentPort) {
        
    }

    public void connectEstablishmentToPracto(String applicationID, String applicationSecret, String establishmentKey)
            throws SDKException {
        // TODO Auto-generated method stub

    }

    public void addDoctorDetails(String applicationID, String applicationSecret, String establishmentKey,
            DoctorDetails doctorParams) throws SDKException {
        // TODO Auto-generated method stub

    }

    public void updateDoctorDetails(String applicationID, String applicationSecret, String establishmentKey,
            DoctorDetails doctorParams) throws SDKException {
        // TODO Auto-generated method stub

    }

    public DoctorDetails getDoctorDetails(String applicationID, String applicationSecret, String establishmentKey,
            long localDoctorId) throws SDKException {
        // TODO Auto-generated method stub
        return null;
    }

    public void addEstablishmentAppointment(String applicationID, String applicationSecret, String establishmentKey,
            AppointmentDetails appointmentDetails) throws SDKException {
        // TODO Auto-generated method stub

    }

    public void updateEstablishmentAppointment(String applicationID, String applicationSecret, String establishmentKey,
            AppointmentDetails appointmentDetails) throws SDKException {
        // TODO Auto-generated method stub

    }

    public void updatePatientDetails(String applicationID, String applicationSecret, String establishmentKey,
            PatientDetails localPatientInfo) throws SDKException {
        // TODO Auto-generated method stub

    }

}
