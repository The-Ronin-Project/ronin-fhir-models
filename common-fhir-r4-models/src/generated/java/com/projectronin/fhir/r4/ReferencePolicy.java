
package com.projectronin.fhir.r4;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ReferencePolicy {

    LITERAL("literal"),
    LOGICAL("logical"),
    RESOLVES("resolves"),
    ENFORCED("enforced"),
    LOCAL("local");
    private final String value;
    private final static Map<String, ReferencePolicy> CONSTANTS = new HashMap<String, ReferencePolicy>();

    static {
        for (ReferencePolicy c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ReferencePolicy(String value) {
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
    public static ReferencePolicy fromValue(String value) {
        ReferencePolicy constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
