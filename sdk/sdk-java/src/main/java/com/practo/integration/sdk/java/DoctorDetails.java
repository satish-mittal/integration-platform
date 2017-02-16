package com.practo.integration.sdk.java;

import lombok.Data;

@Data
public class DoctorDetails {
    public String doctorName;

    public String doctorPhoneNum;

    public String doctorEmailId; 

    public String doctorSpecialityName;

    public long localDoctorId;

    public String localDepartmentName;

    public DoctorTimings doctorTimings;

    public int slotDuration;
}
