package com.practo.integration.sdk.java.impl;

import com.practo.integration.sdk.java.PractoIntegrationSDKCallback;

public class AgentClient {
    private PractoIntegrationSDKCallback sdkCallback = null;
    
    public AgentClient(PractoIntegrationSDKCallback sdkCallback) {
        this.sdkCallback = sdkCallback;
    }

}
