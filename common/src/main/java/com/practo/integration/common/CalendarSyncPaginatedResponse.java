package com.practo.integration.common;

import java.util.List;

import lombok.Data;

@Data
public class CalendarSyncPaginatedResponse {

    public List<AppointmentDetails> appointments;

    public long newIndex;
    
    public boolean isLastPage;
}
