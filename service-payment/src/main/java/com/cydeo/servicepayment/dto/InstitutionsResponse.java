package com.cydeo.servicepayment.dto;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InstitutionsResponse {


    Meta MetaObject;
    ArrayList< Object > data = new ArrayList < Object > ();


    // Getter Methods

    public Meta getMeta() {
        return MetaObject;
    }

    // Setter Methods

    public void setMeta(Meta metaObject) {
        this.MetaObject = metaObject;
    }
}


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
 class Meta {
    private String tracingId;
    private float count;


    // Getter Methods

    public String getTracingId() {
        return tracingId;
    }

    public float getCount() {
        return count;
    }

    // Setter Methods

    public void setTracingId(String tracingId) {
        this.tracingId = tracingId;
    }

    public void setCount(float count) {
        this.count = count;
    }
}
/**
 * {
 *     "meta": {
 *         "tracingId": "454fb5c780c44c0e8779ba5e9c19ab47",
 *         "count": 3
 *     },
 *     "data": [
 *         {
 *             "id": "aibgb-sandbox",
 *             "name": "AIB Sandbox",
 *             "fullName": "AIB Sandbox",
 *             "countries": [
 *                 {
 *                     "displayName": "United Kingdom",
 *                     "countryCode2": "GB"
 *                 }
 *             ],
 *             "environmentType": "SANDBOX",
 *             "credentialsType": "OPEN_BANKING_UK_MANUAL",
 *             "media": [
 *                 {
 *                     "source": "https://images.yapily.com/image/802c775a-2818-483f-a81e-8b55dea90043?size=0",
 *                     "type": "logo"
 *                 },
 *                 {
 *                     "source": "https://images.yapily.com/image/0896d227-7a3a-423c-988e-000c0af04dc1?size=0",
 *                     "type": "icon"
 *                 }
 *             ],
 *             "features": [
 *                 "INITIATE_ACCOUNT_REQUEST",
 *                 "PERIODIC_PAYMENT_FREQUENCY_EXTENDED",
 *                 "ACCOUNT_DIRECT_DEBITS",
 *                 "ACCOUNT_TRANSACTIONS",
 *                 "INITIATE_DOMESTIC_SCHEDULED_PAYMENT",
 *                 "CREATE_SINGLE_PAYMENT_SORTCODE",
 *                 "INITIATE_DOMESTIC_SINGLE_PAYMENT",
 *                 "CREATE_DOMESTIC_SINGLE_PAYMENT",
 *                 "INITIATE_INTERNATIONAL_SINGLE_PAYMENT",
 *                 "INITIATE_SINGLE_PAYMENT_SORTCODE",
 *                 "ACCOUNT",
 *                 "CREATE_DOMESTIC_SCHEDULED_PAYMENT",
 *                 "ACCOUNT_REQUEST_DETAILS",
 *                 "EXISTING_PAYMENT_INITIATION_DETAILS",
 *                 "ACCOUNTS",
 *                 "CREATE_INTERNATIONAL_SINGLE_PAYMENT",
 *                 "EXISTING_PAYMENTS_DETAILS",
 *                 "CREATE_DOMESTIC_PERIODIC_PAYMENT",
 *                 "ACCOUNT_TRANSACTIONS_WITH_MERCHANT",
 *                 "ACCOUNT_PERIODIC_PAYMENTS",
 *                 "INITIATE_DOMESTIC_PERIODIC_PAYMENT"
 *             ]
 *         },
 */