
package com.projectronin.fhir.r4;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CoverageEligibilityPurpose {

    AUTH_REQUIREMENTS("auth-requirements"),
    BENEFITS("benefits"),
    DISCOVERY("discovery"),
    VALIDATION("validation");
    private final String value;
    private final static Map<String, CoverageEligibilityPurpose> CONSTANTS = new HashMap<String, CoverageEligibilityPurpose>();

    static {
        for (CoverageEligibilityPurpose c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CoverageEligibilityPurpose(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CoverageEligibilityPurpose fromValue(String value) {
        CoverageEligibilityPurpose constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
