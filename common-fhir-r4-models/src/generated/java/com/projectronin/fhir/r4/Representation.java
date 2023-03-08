
package com.projectronin.fhir.r4;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum Representation {

    XML_ATTR("xmlAttr"),
    XML_TEXT("xmlText"),
    TYPE_ATTR("typeAttr"),
    CDA_TEXT("cdaText"),
    XHTML("xhtml");
    private final String value;
    private final static Map<String, Representation> CONSTANTS = new HashMap<String, Representation>();

    static {
        for (Representation c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Representation(String value) {
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
    public static Representation fromValue(String value) {
        Representation constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
