
package com.projectronin.fhir.r4;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum Aggregation {

    CONTAINED("contained"),
    REFERENCED("referenced"),
    BUNDLED("bundled");
    private final String value;
    private final static Map<String, Aggregation> CONSTANTS = new HashMap<String, Aggregation>();

    static {
        for (Aggregation c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Aggregation(String value) {
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
    public static Aggregation fromValue(String value) {
        Aggregation constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
