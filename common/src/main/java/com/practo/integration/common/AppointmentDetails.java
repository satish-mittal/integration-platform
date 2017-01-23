package com.practo.integration.common;

import lombok.Data;

@Data
public class AppointmentDetails {

    public long localDoctorId;

    public int scheduledStartTimeMin;

    public int scheduledEndTimeMin;

    public PatientDetails localPatientInfo;

    public long localAppointmentId;

    public AppointmentStatus status;
}
