
package com.projectronin.fhir.r4;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ListMode {

    FIRST("first"),
    SHARE("share"),
    LAST("last"),
    COLLATE("collate");
    private final String value;
    private final static Map<String, ListMode> CONSTANTS = new HashMap<String, ListMode>();

    static {
        for (ListMode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ListMode(String value) {
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
    public static ListMode fromValue(String value) {
        ListMode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
