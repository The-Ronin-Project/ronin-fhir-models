
package com.projectronin.fhir.r4;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum Category {

    FOOD("food"),
    MEDICATION("medication"),
    ENVIRONMENT("environment"),
    BIOLOGIC("biologic");
    private final String value;
    private final static Map<String, Category> CONSTANTS = new HashMap<String, Category>();

    static {
        for (Category c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Category(String value) {
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
    public static Category fromValue(String value) {
        Category constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
