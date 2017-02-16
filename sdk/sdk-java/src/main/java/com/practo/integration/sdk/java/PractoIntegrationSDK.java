package com.practo.integration.sdk.java;

public interface PractoIntegrationSDK {

    /**
     * @param applicationID Application ID issued by Practo that uniquely identifies the application 
     * @param applicationSecret Application Secret key issued by Practo
     * @param establishmentKey Establishment specific unique key issued by Practo
     * @throws SDKException thrown if connection to Practo Platform fails
     */
    public void connectEstablishmentToPracto(String applicationID, String applicationSecret,
            String establishmentKey) throws SDKException;

    /**
     * @param applicationID
     * @param applicationSecret
     * @param establishmentKey
     * @param doctorParams details of HIMS doctor to be added
     * @throws SDKException
     */
    public void addDoctorDetails(String applicationID, String applicationSecret,
            String establishmentKey, DoctorDetails doctorParams) throws SDKException;

    /**
     * @param applicationID
     * @param applicationSecret
     * @param establishmentKey
     * @param doctorParams
     * @throws SDKException
     */
    public void updateDoctorDetails(String applicationID, String applicationSecret,
            String establishmentKey, DoctorDetails doctorParams) throws SDKException;

    /**
     * @param applicationID
     * @param applicationSecret
     * @param establishmentKey
     * @param localDoctorId
     * @return
     * @throws SDKException
     */
    public DoctorDetails getDoctorDetails(String applicationID, String applicationSecret,
            String establishmentKey, long localDoctorId) throws SDKException;

    /**
     * @param applicationID
     * @param applicationSecret
     * @param establishmentKey
     * @param appointmentDetails
     * @throws SDKException
     */
    public void addEstablishmentAppointment(String applicationID, String applicationSecret,
            String establishmentKey, AppointmentDetails appointmentDetails) throws SDKException;

    /**
     * @param applicationID
     * @param applicationSecret
     * @param establishmentKey
     * @param appointmentDetails
     * @throws SDKException
     */
    public void updateEstablishmentAppointment(String applicationID, String applicationSecret,
            String establishmentKey, AppointmentDetails appointmentDetails) throws SDKException;

    /**
     * @param applicationID
     * @param applicationSecret
     * @param establishmentKey
     * @param localPatientInfo
     * @throws SDKException
     */
    public void updatePatientDetails(String applicationID, String applicationSecret,
            String establishmentKey, PatientDetails localPatientInfo) throws SDKException;
}
