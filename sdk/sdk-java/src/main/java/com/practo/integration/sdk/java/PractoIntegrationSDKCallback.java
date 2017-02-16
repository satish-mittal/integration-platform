package com.practo.integration.sdk.java;

public interface PractoIntegrationSDKCallback {

    /**
     * @param localDoctorId
     * @param doctorStatus
     * @throws SDKException
     */
    public void handleDoctorStatusChange(String localDoctorId, DoctorStatus doctorStatus) throws SDKException;

    /**
     * @param localDoctorId
     * @param syncStartTime
     * @param syncEndTime
     * @param currentIndex
     * @return
     * @throws SDKException
     */
    public CalendarSyncPaginatedResponse handleDoctorCalendarSync(long localDoctorId, long syncStartTime,
            long syncEndTime, long currentIndex) throws SDKException;

    /**
     * @param appointmentDetails
     * @throws SDKException
     */
    public void handlePractoAppointmentCreated(AppointmentDetails appointmentDetails) throws SDKException;
    
    /**
     * @param appointmentDetails
     * @throws SDKException
     */
    public void handlePractoAppointmentUpdated(AppointmentDetails appointmentDetails) throws SDKException;
}
