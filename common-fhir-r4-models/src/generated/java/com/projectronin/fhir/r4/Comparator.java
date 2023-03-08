
package com.projectronin.fhir.r4;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum Comparator {

    EQ("eq"),
    NE("ne"),
    GT("gt"),
    LT("lt"),
    GE("ge"),
    LE("le"),
    SA("sa"),
    EB("eb"),
    AP("ap");
    private final String value;
    private final static Map<String, Comparator> CONSTANTS = new HashMap<String, Comparator>();

    static {
        for (Comparator c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Comparator(String value) {
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
    public static Comparator fromValue(String value) {
        Comparator constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
