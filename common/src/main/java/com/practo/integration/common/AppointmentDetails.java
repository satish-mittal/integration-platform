package com.practo.integration.common;

import lombok.Data;

@Data
public class AppointmentDetails {

    public long localDoctorId;

    public int scheduledStartTimeMin;

    public int scheduledEndTimeMin;

    public PatientDetails patientDetails;

    public AppointmentStatus status;
    
    public long localAppointmentId;
    
    public long practoAppointmentId;
    
    public PaymentDetails paymentDetails;
}
