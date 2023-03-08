
package com.projectronin.fhir.r4;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum PermittedDataType {

    QUANTITY("Quantity"),
    CODEABLE_CONCEPT("CodeableConcept"),
    STRING("string"),
    BOOLEAN("boolean"),
    INTEGER("integer"),
    RANGE("Range"),
    RATIO("Ratio"),
    SAMPLED_DATA("SampledData"),
    TIME("time"),
    DATE_TIME("dateTime"),
    PERIOD("Period");
    private final String value;
    private final static Map<String, PermittedDataType> CONSTANTS = new HashMap<String, PermittedDataType>();

    static {
        for (PermittedDataType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PermittedDataType(String value) {
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
    public static PermittedDataType fromValue(String value) {
        PermittedDataType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
