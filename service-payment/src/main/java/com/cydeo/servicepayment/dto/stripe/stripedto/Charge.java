
package com.cydeo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Charge {

    private String id;
    private String object;
    private Integer amount;
    private Integer amountCaptured;
    private Integer amountRefunded;
    private Object application;
    private Object applicationFee;
    private Object applicationFeeAmount;
    private String balanceTransaction;
    private BillingDetails billingDetails;
    private Object calculatedStatementDescriptor;
    private Boolean captured;
    private Integer created;
    private String currency;
    private Object customer;
    private String description;
    private Boolean disputed;
    private Object failureBalanceTransaction;
    private Object failureCode;
    private Object failureMessage;
    private FraudDetails fraudDetails;
    private Object invoice;
    private Boolean livemode;
    private Metadata metadata;
    private Object onBehalfOf;
    private Object outcome;
    private Boolean paid;
    private Object paymentIntent;
    private String paymentMethod;
    private PaymentMethodDetails paymentMethodDetails;
    private Object receiptEmail;
    private Object receiptNumber;
    private String receiptUrl;
    private Boolean refunded;
    private Refunds refunds;
    private Object review;
    private Object shipping;
    private Object sourceTransfer;
    private Object statementDescriptor;
    private Object statementDescriptorSuffix;
    private String status;
    private Object transferData;
    private Object transferGroup;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmountCaptured() {
        return amountCaptured;
    }

    public void setAmountCaptured(Integer amountCaptured) {
        this.amountCaptured = amountCaptured;
    }

    public Integer getAmountRefunded() {
        return amountRefunded;
    }

    public void setAmountRefunded(Integer amountRefunded) {
        this.amountRefunded = amountRefunded;
    }

    public Object getApplication() {
        return application;
    }

    public void setApplication(Object application) {
        this.application = application;
    }

    public Object getApplicationFee() {
        return applicationFee;
    }

    public void setApplicationFee(Object applicationFee) {
        this.applicationFee = applicationFee;
    }

    public Object getApplicationFeeAmount() {
        return applicationFeeAmount;
    }

    public void setApplicationFeeAmount(Object applicationFeeAmount) {
        this.applicationFeeAmount = applicationFeeAmount;
    }

    public String getBalanceTransaction() {
        return balanceTransaction;
    }

    public void setBalanceTransaction(String balanceTransaction) {
        this.balanceTransaction = balanceTransaction;
    }

    public BillingDetails getBillingDetails() {
        return billingDetails;
    }

    public void setBillingDetails(BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
    }

    public Object getCalculatedStatementDescriptor() {
        return calculatedStatementDescriptor;
    }

    public void setCalculatedStatementDescriptor(Object calculatedStatementDescriptor) {
        this.calculatedStatementDescriptor = calculatedStatementDescriptor;
    }

    public Boolean getCaptured() {
        return captured;
    }

    public void setCaptured(Boolean captured) {
        this.captured = captured;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Object getCustomer() {
        return customer;
    }

    public void setCustomer(Object customer) {
        this.customer = customer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDisputed() {
        return disputed;
    }

    public void setDisputed(Boolean disputed) {
        this.disputed = disputed;
    }

    public Object getFailureBalanceTransaction() {
        return failureBalanceTransaction;
    }

    public void setFailureBalanceTransaction(Object failureBalanceTransaction) {
        this.failureBalanceTransaction = failureBalanceTransaction;
    }

    public Object getFailureCode() {
        return failureCode;
    }

    public void setFailureCode(Object failureCode) {
        this.failureCode = failureCode;
    }

    public Object getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(Object failureMessage) {
        this.failureMessage = failureMessage;
    }

    public FraudDetails getFraudDetails() {
        return fraudDetails;
    }

    public void setFraudDetails(FraudDetails fraudDetails) {
        this.fraudDetails = fraudDetails;
    }

    public Object getInvoice() {
        return invoice;
    }

    public void setInvoice(Object invoice) {
        this.invoice = invoice;
    }

    public Boolean getLivemode() {
        return livemode;
    }

    public void setLivemode(Boolean livemode) {
        this.livemode = livemode;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Object getOnBehalfOf() {
        return onBehalfOf;
    }

    public void setOnBehalfOf(Object onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
    }

    public Object getOutcome() {
        return outcome;
    }

    public void setOutcome(Object outcome) {
        this.outcome = outcome;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Object getPaymentIntent() {
        return paymentIntent;
    }

    public void setPaymentIntent(Object paymentIntent) {
        this.paymentIntent = paymentIntent;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethodDetails getPaymentMethodDetails() {
        return paymentMethodDetails;
    }

    public void setPaymentMethodDetails(PaymentMethodDetails paymentMethodDetails) {
        this.paymentMethodDetails = paymentMethodDetails;
    }

    public Object getReceiptEmail() {
        return receiptEmail;
    }

    public void setReceiptEmail(Object receiptEmail) {
        this.receiptEmail = receiptEmail;
    }

    public Object getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(Object receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getReceiptUrl() {
        return receiptUrl;
    }

    public void setReceiptUrl(String receiptUrl) {
        this.receiptUrl = receiptUrl;
    }

    public Boolean getRefunded() {
        return refunded;
    }

    public void setRefunded(Boolean refunded) {
        this.refunded = refunded;
    }

    public Refunds getRefunds() {
        return refunds;
    }

    public void setRefunds(Refunds refunds) {
        this.refunds = refunds;
    }

    public Object getReview() {
        return review;
    }

    public void setReview(Object review) {
        this.review = review;
    }

    public Object getShipping() {
        return shipping;
    }

    public void setShipping(Object shipping) {
        this.shipping = shipping;
    }

    public Object getSourceTransfer() {
        return sourceTransfer;
    }

    public void setSourceTransfer(Object sourceTransfer) {
        this.sourceTransfer = sourceTransfer;
    }

    public Object getStatementDescriptor() {
        return statementDescriptor;
    }

    public void setStatementDescriptor(Object statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    public Object getStatementDescriptorSuffix() {
        return statementDescriptorSuffix;
    }

    public void setStatementDescriptorSuffix(Object statementDescriptorSuffix) {
        this.statementDescriptorSuffix = statementDescriptorSuffix;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getTransferData() {
        return transferData;
    }

    public void setTransferData(Object transferData) {
        this.transferData = transferData;
    }

    public Object getTransferGroup() {
        return transferGroup;
    }

    public void setTransferGroup(Object transferGroup) {
        this.transferGroup = transferGroup;
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
        result = ((result* 31)+((this.transferData == null)? 0 :this.transferData.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.billingDetails == null)? 0 :this.billingDetails.hashCode()));
        result = ((result* 31)+((this.livemode == null)? 0 :this.livemode.hashCode()));
        result = ((result* 31)+((this.amountCaptured == null)? 0 :this.amountCaptured.hashCode()));
        result = ((result* 31)+((this.failureBalanceTransaction == null)? 0 :this.failureBalanceTransaction.hashCode()));
        result = ((result* 31)+((this.statementDescriptor == null)? 0 :this.statementDescriptor.hashCode()));
        result = ((result* 31)+((this.receiptEmail == null)? 0 :this.receiptEmail.hashCode()));
        result = ((result* 31)+((this.applicationFeeAmount == null)? 0 :this.applicationFeeAmount.hashCode()));
        result = ((result* 31)+((this.onBehalfOf == null)? 0 :this.onBehalfOf.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.refunds == null)? 0 :this.refunds.hashCode()));
        result = ((result* 31)+((this.applicationFee == null)? 0 :this.applicationFee.hashCode()));
        result = ((result* 31)+((this.calculatedStatementDescriptor == null)? 0 :this.calculatedStatementDescriptor.hashCode()));
        result = ((result* 31)+((this.shipping == null)? 0 :this.shipping.hashCode()));
        result = ((result* 31)+((this.review == null)? 0 :this.review.hashCode()));
        result = ((result* 31)+((this.amountRefunded == null)? 0 :this.amountRefunded.hashCode()));
        result = ((result* 31)+((this.captured == null)? 0 :this.captured.hashCode()));
        result = ((result* 31)+((this.balanceTransaction == null)? 0 :this.balanceTransaction.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.paymentMethodDetails == null)? 0 :this.paymentMethodDetails.hashCode()));
        result = ((result* 31)+((this.refunded == null)? 0 :this.refunded.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.outcome == null)? 0 :this.outcome.hashCode()));
        result = ((result* 31)+((this.receiptNumber == null)? 0 :this.receiptNumber.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.disputed == null)? 0 :this.disputed.hashCode()));
        result = ((result* 31)+((this.failureCode == null)? 0 :this.failureCode.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.paymentIntent == null)? 0 :this.paymentIntent.hashCode()));
        result = ((result* 31)+((this.statementDescriptorSuffix == null)? 0 :this.statementDescriptorSuffix.hashCode()));
        result = ((result* 31)+((this.application == null)? 0 :this.application.hashCode()));
        result = ((result* 31)+((this.sourceTransfer == null)? 0 :this.sourceTransfer.hashCode()));
        result = ((result* 31)+((this.transferGroup == null)? 0 :this.transferGroup.hashCode()));
        result = ((result* 31)+((this.paid == null)? 0 :this.paid.hashCode()));
        result = ((result* 31)+((this.paymentMethod == null)? 0 :this.paymentMethod.hashCode()));
        result = ((result* 31)+((this.invoice == null)? 0 :this.invoice.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.receiptUrl == null)? 0 :this.receiptUrl.hashCode()));
        result = ((result* 31)+((this.failureMessage == null)? 0 :this.failureMessage.hashCode()));
        result = ((result* 31)+((this.object == null)? 0 :this.object.hashCode()));
        result = ((result* 31)+((this.customer == null)? 0 :this.customer.hashCode()));
        result = ((result* 31)+((this.fraudDetails == null)? 0 :this.fraudDetails.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Charge) == false) {
            return false;
        }
        Charge rhs = ((Charge) other);
        return (((((((((((((((((((((((((((((((((((((((((((((this.transferData == rhs.transferData)||((this.transferData!= null)&&this.transferData.equals(rhs.transferData)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.billingDetails == rhs.billingDetails)||((this.billingDetails!= null)&&this.billingDetails.equals(rhs.billingDetails))))&&((this.livemode == rhs.livemode)||((this.livemode!= null)&&this.livemode.equals(rhs.livemode))))&&((this.amountCaptured == rhs.amountCaptured)||((this.amountCaptured!= null)&&this.amountCaptured.equals(rhs.amountCaptured))))&&((this.failureBalanceTransaction == rhs.failureBalanceTransaction)||((this.failureBalanceTransaction!= null)&&this.failureBalanceTransaction.equals(rhs.failureBalanceTransaction))))&&((this.statementDescriptor == rhs.statementDescriptor)||((this.statementDescriptor!= null)&&this.statementDescriptor.equals(rhs.statementDescriptor))))&&((this.receiptEmail == rhs.receiptEmail)||((this.receiptEmail!= null)&&this.receiptEmail.equals(rhs.receiptEmail))))&&((this.applicationFeeAmount == rhs.applicationFeeAmount)||((this.applicationFeeAmount!= null)&&this.applicationFeeAmount.equals(rhs.applicationFeeAmount))))&&((this.onBehalfOf == rhs.onBehalfOf)||((this.onBehalfOf!= null)&&this.onBehalfOf.equals(rhs.onBehalfOf))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.refunds == rhs.refunds)||((this.refunds!= null)&&this.refunds.equals(rhs.refunds))))&&((this.applicationFee == rhs.applicationFee)||((this.applicationFee!= null)&&this.applicationFee.equals(rhs.applicationFee))))&&((this.calculatedStatementDescriptor == rhs.calculatedStatementDescriptor)||((this.calculatedStatementDescriptor!= null)&&this.calculatedStatementDescriptor.equals(rhs.calculatedStatementDescriptor))))&&((this.shipping == rhs.shipping)||((this.shipping!= null)&&this.shipping.equals(rhs.shipping))))&&((this.review == rhs.review)||((this.review!= null)&&this.review.equals(rhs.review))))&&((this.amountRefunded == rhs.amountRefunded)||((this.amountRefunded!= null)&&this.amountRefunded.equals(rhs.amountRefunded))))&&((this.captured == rhs.captured)||((this.captured!= null)&&this.captured.equals(rhs.captured))))&&((this.balanceTransaction == rhs.balanceTransaction)||((this.balanceTransaction!= null)&&this.balanceTransaction.equals(rhs.balanceTransaction))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.paymentMethodDetails == rhs.paymentMethodDetails)||((this.paymentMethodDetails!= null)&&this.paymentMethodDetails.equals(rhs.paymentMethodDetails))))&&((this.refunded == rhs.refunded)||((this.refunded!= null)&&this.refunded.equals(rhs.refunded))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.outcome == rhs.outcome)||((this.outcome!= null)&&this.outcome.equals(rhs.outcome))))&&((this.receiptNumber == rhs.receiptNumber)||((this.receiptNumber!= null)&&this.receiptNumber.equals(rhs.receiptNumber))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.disputed == rhs.disputed)||((this.disputed!= null)&&this.disputed.equals(rhs.disputed))))&&((this.failureCode == rhs.failureCode)||((this.failureCode!= null)&&this.failureCode.equals(rhs.failureCode))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this.paymentIntent == rhs.paymentIntent)||((this.paymentIntent!= null)&&this.paymentIntent.equals(rhs.paymentIntent))))&&((this.statementDescriptorSuffix == rhs.statementDescriptorSuffix)||((this.statementDescriptorSuffix!= null)&&this.statementDescriptorSuffix.equals(rhs.statementDescriptorSuffix))))&&((this.application == rhs.application)||((this.application!= null)&&this.application.equals(rhs.application))))&&((this.sourceTransfer == rhs.sourceTransfer)||((this.sourceTransfer!= null)&&this.sourceTransfer.equals(rhs.sourceTransfer))))&&((this.transferGroup == rhs.transferGroup)||((this.transferGroup!= null)&&this.transferGroup.equals(rhs.transferGroup))))&&((this.paid == rhs.paid)||((this.paid!= null)&&this.paid.equals(rhs.paid))))&&((this.paymentMethod == rhs.paymentMethod)||((this.paymentMethod!= null)&&this.paymentMethod.equals(rhs.paymentMethod))))&&((this.invoice == rhs.invoice)||((this.invoice!= null)&&this.invoice.equals(rhs.invoice))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.receiptUrl == rhs.receiptUrl)||((this.receiptUrl!= null)&&this.receiptUrl.equals(rhs.receiptUrl))))&&((this.failureMessage == rhs.failureMessage)||((this.failureMessage!= null)&&this.failureMessage.equals(rhs.failureMessage))))&&((this.object == rhs.object)||((this.object!= null)&&this.object.equals(rhs.object))))&&((this.customer == rhs.customer)||((this.customer!= null)&&this.customer.equals(rhs.customer))))&&((this.fraudDetails == rhs.fraudDetails)||((this.fraudDetails!= null)&&this.fraudDetails.equals(rhs.fraudDetails))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
