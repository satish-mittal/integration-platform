package com.practo.integration.sdk.java;

import java.util.List;

import lombok.Data;

@Data
public class CalendarSyncPaginatedResponse {

    public List<AppointmentDetails> appointments;

    public long newIndex;
    
    public boolean isLastPage;
}
