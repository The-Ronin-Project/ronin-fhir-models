
package com.projectronin.fhir.r4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A summary of information based on the results of executing a TestScript.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "identifier",
    "name",
    "_name",
    "status",
    "_status",
    "testScript",
    "result",
    "_result",
    "score",
    "_score",
    "tester",
    "_tester",
    "issued",
    "_issued",
    "participant",
    "setup",
    "test",
    "teardown"
})
@Generated("jsonschema2pojo")
public class TestReport
    extends DomainResource
{

    /**
     * This is a TestReport resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("This is a TestReport resource")
    private String resourceType;
    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.")
    private Identifier identifier;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String name;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _name;
    /**
     * The current state of this test report.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The current state of this test report.")
    private TestReport.Status status;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _status;
    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("testScript")
    @JsonPropertyDescription("A reference from one resource to another.")
    private Reference testScript;
    /**
     * The overall result from the execution of the TestScript.
     * 
     */
    @JsonProperty("result")
    @JsonPropertyDescription("The overall result from the execution of the TestScript.")
    private TestReport.Result result;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_result")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _result;
    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("score")
    @JsonPropertyDescription("A rational number with implicit precision")
    private Double score;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_score")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _score;
    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("tester")
    @JsonPropertyDescription("A sequence of Unicode characters")
    private String tester;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_tester")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _tester;
    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("issued")
    @JsonPropertyDescription("A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.")
    private String issued;
    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issued")
    @JsonPropertyDescription("Base definition for all elements in a resource.")
    private Element _issued;
    /**
     * A participant in the test execution, either the execution engine, a client, or a server.
     * 
     */
    @JsonProperty("participant")
    @JsonPropertyDescription("A participant in the test execution, either the execution engine, a client, or a server.")
    private List<TestReport_Participant> participant = new ArrayList<TestReport_Participant>();
    /**
     * A summary of information based on the results of executing a TestScript.
     * 
     */
    @JsonProperty("setup")
    @JsonPropertyDescription("A summary of information based on the results of executing a TestScript.")
    private TestReport_Setup setup;
    /**
     * A test executed from the test script.
     * 
     */
    @JsonProperty("test")
    @JsonPropertyDescription("A test executed from the test script.")
    private List<TestReport_Test> test = new ArrayList<TestReport_Test>();
    /**
     * A summary of information based on the results of executing a TestScript.
     * 
     */
    @JsonProperty("teardown")
    @JsonPropertyDescription("A summary of information based on the results of executing a TestScript.")
    private TestReport_Teardown teardown;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This is a TestReport resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is a TestReport resource
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
     * 
     */
    @JsonProperty("identifier")
    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public Element get_name() {
        return _name;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_name")
    public void set_name(Element _name) {
        this._name = _name;
    }

    /**
     * The current state of this test report.
     * 
     */
    @JsonProperty("status")
    public TestReport.Status getStatus() {
        return status;
    }

    /**
     * The current state of this test report.
     * 
     */
    @JsonProperty("status")
    public void setStatus(TestReport.Status status) {
        this.status = status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public Element get_status() {
        return _status;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_status")
    public void set_status(Element _status) {
        this._status = _status;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("testScript")
    public Reference getTestScript() {
        return testScript;
    }

    /**
     * A reference from one resource to another.
     * (Required)
     * 
     */
    @JsonProperty("testScript")
    public void setTestScript(Reference testScript) {
        this.testScript = testScript;
    }

    /**
     * The overall result from the execution of the TestScript.
     * 
     */
    @JsonProperty("result")
    public TestReport.Result getResult() {
        return result;
    }

    /**
     * The overall result from the execution of the TestScript.
     * 
     */
    @JsonProperty("result")
    public void setResult(TestReport.Result result) {
        this.result = result;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_result")
    public Element get_result() {
        return _result;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_result")
    public void set_result(Element _result) {
        this._result = _result;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    /**
     * A rational number with implicit precision
     * 
     */
    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_score")
    public Element get_score() {
        return _score;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_score")
    public void set_score(Element _score) {
        this._score = _score;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("tester")
    public String getTester() {
        return tester;
    }

    /**
     * A sequence of Unicode characters
     * 
     */
    @JsonProperty("tester")
    public void setTester(String tester) {
        this.tester = tester;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_tester")
    public Element get_tester() {
        return _tester;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_tester")
    public void set_tester(Element _tester) {
        this._tester = _tester;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("issued")
    public String getIssued() {
        return issued;
    }

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     * 
     */
    @JsonProperty("issued")
    public void setIssued(String issued) {
        this.issued = issued;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issued")
    public Element get_issued() {
        return _issued;
    }

    /**
     * Base definition for all elements in a resource.
     * 
     */
    @JsonProperty("_issued")
    public void set_issued(Element _issued) {
        this._issued = _issued;
    }

    /**
     * A participant in the test execution, either the execution engine, a client, or a server.
     * 
     */
    @JsonProperty("participant")
    public List<TestReport_Participant> getParticipant() {
        return participant;
    }

    /**
     * A participant in the test execution, either the execution engine, a client, or a server.
     * 
     */
    @JsonProperty("participant")
    public void setParticipant(List<TestReport_Participant> participant) {
        this.participant = participant;
    }

    /**
     * A summary of information based on the results of executing a TestScript.
     * 
     */
    @JsonProperty("setup")
    public TestReport_Setup getSetup() {
        return setup;
    }

    /**
     * A summary of information based on the results of executing a TestScript.
     * 
     */
    @JsonProperty("setup")
    public void setSetup(TestReport_Setup setup) {
        this.setup = setup;
    }

    /**
     * A test executed from the test script.
     * 
     */
    @JsonProperty("test")
    public List<TestReport_Test> getTest() {
        return test;
    }

    /**
     * A test executed from the test script.
     * 
     */
    @JsonProperty("test")
    public void setTest(List<TestReport_Test> test) {
        this.test = test;
    }

    /**
     * A summary of information based on the results of executing a TestScript.
     * 
     */
    @JsonProperty("teardown")
    public TestReport_Teardown getTeardown() {
        return teardown;
    }

    /**
     * A summary of information based on the results of executing a TestScript.
     * 
     */
    @JsonProperty("teardown")
    public void setTeardown(TestReport_Teardown teardown) {
        this.teardown = teardown;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestReport.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        String superString = super.toString();
        if (superString!= null) {
            int contentStart = superString.indexOf('[');
            int contentEnd = superString.lastIndexOf(']');
            if ((contentStart >= 0)&&(contentEnd >contentStart)) {
                sb.append(superString, (contentStart + 1), contentEnd);
            } else {
                sb.append(superString);
            }
        }
        if (sb.length()>baseLength) {
            sb.append(',');
        }
        sb.append("resourceType");
        sb.append('=');
        sb.append(((this.resourceType == null)?"<null>":this.resourceType));
        sb.append(',');
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("_name");
        sb.append('=');
        sb.append(((this._name == null)?"<null>":this._name));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_status");
        sb.append('=');
        sb.append(((this._status == null)?"<null>":this._status));
        sb.append(',');
        sb.append("testScript");
        sb.append('=');
        sb.append(((this.testScript == null)?"<null>":this.testScript));
        sb.append(',');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("_result");
        sb.append('=');
        sb.append(((this._result == null)?"<null>":this._result));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("_score");
        sb.append('=');
        sb.append(((this._score == null)?"<null>":this._score));
        sb.append(',');
        sb.append("tester");
        sb.append('=');
        sb.append(((this.tester == null)?"<null>":this.tester));
        sb.append(',');
        sb.append("_tester");
        sb.append('=');
        sb.append(((this._tester == null)?"<null>":this._tester));
        sb.append(',');
        sb.append("issued");
        sb.append('=');
        sb.append(((this.issued == null)?"<null>":this.issued));
        sb.append(',');
        sb.append("_issued");
        sb.append('=');
        sb.append(((this._issued == null)?"<null>":this._issued));
        sb.append(',');
        sb.append("participant");
        sb.append('=');
        sb.append(((this.participant == null)?"<null>":this.participant));
        sb.append(',');
        sb.append("setup");
        sb.append('=');
        sb.append(((this.setup == null)?"<null>":this.setup));
        sb.append(',');
        sb.append("test");
        sb.append('=');
        sb.append(((this.test == null)?"<null>":this.test));
        sb.append(',');
        sb.append("teardown");
        sb.append('=');
        sb.append(((this.teardown == null)?"<null>":this.teardown));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this._result == null)? 0 :this._result.hashCode()));
        result = ((result* 31)+((this._name == null)? 0 :this._name.hashCode()));
        result = ((result* 31)+((this.test == null)? 0 :this.test.hashCode()));
        result = ((result* 31)+((this.tester == null)? 0 :this.tester.hashCode()));
        result = ((result* 31)+((this._status == null)? 0 :this._status.hashCode()));
        result = ((result* 31)+((this._score == null)? 0 :this._score.hashCode()));
        result = ((result* 31)+((this._issued == null)? 0 :this._issued.hashCode()));
        result = ((result* 31)+((this.participant == null)? 0 :this.participant.hashCode()));
        result = ((result* 31)+((this.result == null)? 0 :this.result.hashCode()));
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.testScript == null)? 0 :this.testScript.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this._tester == null)? 0 :this._tester.hashCode()));
        result = ((result* 31)+((this.setup == null)? 0 :this.setup.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.issued == null)? 0 :this.issued.hashCode()));
        result = ((result* 31)+((this.teardown == null)? 0 :this.teardown.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestReport) == false) {
            return false;
        }
        TestReport rhs = ((TestReport) other);
        return ((((((((((((((((((((super.equals(rhs)&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this._result == rhs._result)||((this._result!= null)&&this._result.equals(rhs._result))))&&((this._name == rhs._name)||((this._name!= null)&&this._name.equals(rhs._name))))&&((this.test == rhs.test)||((this.test!= null)&&this.test.equals(rhs.test))))&&((this.tester == rhs.tester)||((this.tester!= null)&&this.tester.equals(rhs.tester))))&&((this._status == rhs._status)||((this._status!= null)&&this._status.equals(rhs._status))))&&((this._score == rhs._score)||((this._score!= null)&&this._score.equals(rhs._score))))&&((this._issued == rhs._issued)||((this._issued!= null)&&this._issued.equals(rhs._issued))))&&((this.participant == rhs.participant)||((this.participant!= null)&&this.participant.equals(rhs.participant))))&&((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result))))&&((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score))))&&((this.testScript == rhs.testScript)||((this.testScript!= null)&&this.testScript.equals(rhs.testScript))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this._tester == rhs._tester)||((this._tester!= null)&&this._tester.equals(rhs._tester))))&&((this.setup == rhs.setup)||((this.setup!= null)&&this.setup.equals(rhs.setup))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.issued == rhs.issued)||((this.issued!= null)&&this.issued.equals(rhs.issued))))&&((this.teardown == rhs.teardown)||((this.teardown!= null)&&this.teardown.equals(rhs.teardown))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * The overall result from the execution of the TestScript.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Result {

        PASS("pass"),
        FAIL("fail"),
        PENDING("pending");
        private final String value;
        private final static Map<String, TestReport.Result> CONSTANTS = new HashMap<String, TestReport.Result>();

        static {
            for (TestReport.Result c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Result(String value) {
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
        public static TestReport.Result fromValue(String value) {
            TestReport.Result constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The current state of this test report.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        COMPLETED("completed"),
        IN_PROGRESS("in-progress"),
        WAITING("waiting"),
        STOPPED("stopped"),
        ENTERED_IN_ERROR("entered-in-error");
        private final String value;
        private final static Map<String, TestReport.Status> CONSTANTS = new HashMap<String, TestReport.Status>();

        static {
            for (TestReport.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static TestReport.Status fromValue(String value) {
            TestReport.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
