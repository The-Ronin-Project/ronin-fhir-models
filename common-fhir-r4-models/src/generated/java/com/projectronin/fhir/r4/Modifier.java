
package com.projectronin.fhir.r4;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum Modifier {

    MISSING("missing"),
    EXACT("exact"),
    CONTAINS("contains"),
    NOT("not"),
    TEXT("text"),
    IN("in"),
    NOT_IN("not-in"),
    BELOW("below"),
    ABOVE("above"),
    TYPE("type"),
    IDENTIFIER("identifier"),
    OF_TYPE("ofType");
    private final String value;
    private final static Map<String, Modifier> CONSTANTS = new HashMap<String, Modifier>();

    static {
        for (Modifier c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Modifier(String value) {
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
    public static Modifier fromValue(String value) {
        Modifier constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
