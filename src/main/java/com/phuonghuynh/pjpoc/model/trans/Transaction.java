package com.phuonghuynh.pjpoc.model.trans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by phuonghqh on 10/30/15.
 * example json pjpoc/src/main/resources/example/recurringBillTransaction.json
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction implements Serializable {

  private Long transactionId;

  private String uri;

  private BigDecimal amountBase;

  private BigDecimal amountTotal;

  private String status;

  private String created;

  private String lastModified;

  private Response response;

  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public BigDecimal getAmountBase() {
    return amountBase;
  }

  public void setAmountBase(BigDecimal amountBase) {
    this.amountBase = amountBase;
  }

  public BigDecimal getAmountTotal() {
    return amountTotal;
  }

  public void setAmountTotal(BigDecimal amountTotal) {
    this.amountTotal = amountTotal;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public Response getResponse() {
    return response;
  }

  public void setResponse(Response response) {
    this.response = response;
  }
}
