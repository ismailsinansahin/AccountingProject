
package com.cydeo.servicepayment.dto.stripe.stripedto;

import com.cydeo.Checks;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Card {

    private String brand;
    private Checks checks;
    private String country;
    private Integer expMonth;
    private Integer expYear;
    private String fingerprint;
    private String funding;
    private Object installments;
    private String last4;
    private Object mandate;
    private String network;
    private Object threeDSecure;
    private Object wallet;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Checks getChecks() {
        return checks;
    }

    public void setChecks(Checks checks) {
        this.checks = checks;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(Integer expMonth) {
        this.expMonth = expMonth;
    }

    public Integer getExpYear() {
        return expYear;
    }

    public void setExpYear(Integer expYear) {
        this.expYear = expYear;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getFunding() {
        return funding;
    }

    public void setFunding(String funding) {
        this.funding = funding;
    }

    public Object getInstallments() {
        return installments;
    }

    public void setInstallments(Object installments) {
        this.installments = installments;
    }

    public String getLast4() {
        return last4;
    }

    public void setLast4(String last4) {
        this.last4 = last4;
    }

    public Object getMandate() {
        return mandate;
    }

    public void setMandate(Object mandate) {
        this.mandate = mandate;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public Object getThreeDSecure() {
        return threeDSecure;
    }

    public void setThreeDSecure(Object threeDSecure) {
        this.threeDSecure = threeDSecure;
    }

    public Object getWallet() {
        return wallet;
    }

    public void setWallet(Object wallet) {
        this.wallet = wallet;
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.last4 == null)? 0 :this.last4 .hashCode()));
        result = ((result* 31)+((this.funding == null)? 0 :this.funding.hashCode()));
        result = ((result* 31)+((this.mandate == null)? 0 :this.mandate.hashCode()));
        result = ((result* 31)+((this.wallet == null)? 0 :this.wallet.hashCode()));
        result = ((result* 31)+((this.threeDSecure == null)? 0 :this.threeDSecure.hashCode()));
        result = ((result* 31)+((this.network == null)? 0 :this.network.hashCode()));
        result = ((result* 31)+((this.expMonth == null)? 0 :this.expMonth.hashCode()));
        result = ((result* 31)+((this.checks == null)? 0 :this.checks.hashCode()));
        result = ((result* 31)+((this.expYear == null)? 0 :this.expYear.hashCode()));
        result = ((result* 31)+((this.installments == null)? 0 :this.installments.hashCode()));
        result = ((result* 31)+((this.fingerprint == null)? 0 :this.fingerprint.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.brand == null)? 0 :this.brand.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Card) == false) {
            return false;
        }
        Card rhs = ((Card) other);
        return (((((((((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.last4 == rhs.last4)||((this.last4 != null)&&this.last4 .equals(rhs.last4))))&&((this.funding == rhs.funding)||((this.funding!= null)&&this.funding.equals(rhs.funding))))&&((this.mandate == rhs.mandate)||((this.mandate!= null)&&this.mandate.equals(rhs.mandate))))&&((this.wallet == rhs.wallet)||((this.wallet!= null)&&this.wallet.equals(rhs.wallet))))&&((this.threeDSecure == rhs.threeDSecure)||((this.threeDSecure!= null)&&this.threeDSecure.equals(rhs.threeDSecure))))&&((this.network == rhs.network)||((this.network!= null)&&this.network.equals(rhs.network))))&&((this.expMonth == rhs.expMonth)||((this.expMonth!= null)&&this.expMonth.equals(rhs.expMonth))))&&((this.checks == rhs.checks)||((this.checks!= null)&&this.checks.equals(rhs.checks))))&&((this.expYear == rhs.expYear)||((this.expYear!= null)&&this.expYear.equals(rhs.expYear))))&&((this.installments == rhs.installments)||((this.installments!= null)&&this.installments.equals(rhs.installments))))&&((this.fingerprint == rhs.fingerprint)||((this.fingerprint!= null)&&this.fingerprint.equals(rhs.fingerprint))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.brand == rhs.brand)||((this.brand!= null)&&this.brand.equals(rhs.brand))));
    }

}
