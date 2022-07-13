
package com.cydeo.servicepayment.dto.stripe.stripedto;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Checks {

    private Object addressLine1Check;
    private Object addressPostalCodeCheck;
    private String cvcCheck;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getAddressLine1Check() {
        return addressLine1Check;
    }

    public void setAddressLine1Check(Object addressLine1Check) {
        this.addressLine1Check = addressLine1Check;
    }

    public Object getAddressPostalCodeCheck() {
        return addressPostalCodeCheck;
    }

    public void setAddressPostalCodeCheck(Object addressPostalCodeCheck) {
        this.addressPostalCodeCheck = addressPostalCodeCheck;
    }

    public String getCvcCheck() {
        return cvcCheck;
    }

    public void setCvcCheck(String cvcCheck) {
        this.cvcCheck = cvcCheck;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.addressPostalCodeCheck == null)? 0 :this.addressPostalCodeCheck.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cvcCheck == null)? 0 :this.cvcCheck.hashCode()));
        result = ((result* 31)+((this.addressLine1Check == null)? 0 :this.addressLine1Check.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Checks) == false) {
            return false;
        }
        Checks rhs = ((Checks) other);
        return (((((this.addressPostalCodeCheck == rhs.addressPostalCodeCheck)||((this.addressPostalCodeCheck!= null)&&this.addressPostalCodeCheck.equals(rhs.addressPostalCodeCheck)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cvcCheck == rhs.cvcCheck)||((this.cvcCheck!= null)&&this.cvcCheck.equals(rhs.cvcCheck))))&&((this.addressLine1Check == rhs.addressLine1Check)||((this.addressLine1Check!= null)&&this.addressLine1Check.equals(rhs.addressLine1Check))));
    }

}
