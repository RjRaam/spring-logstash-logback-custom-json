package com.springboot.springlogstashlogbackcustomjson;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.contrib.json.classic.JsonLayout;

import java.util.Map;

public class CustomJsonLayout extends JsonLayout {

    public CustomJsonLayout() {
        // To avoid display another level of object for "MDC"
        // Without this log message will display Json Object with "MDC"
        this.setIncludeMDC(false);
    }

    @Override
    protected void addCustomDataToJsonMap(Map<String, Object> map, ILoggingEvent event) {
        //Since MDC is excluded as a separate object, this help to use the MDC k/v together with the other json props
        map.putAll(event.getMDCPropertyMap());
        super.addCustomDataToJsonMap(map, event);
    }
}
