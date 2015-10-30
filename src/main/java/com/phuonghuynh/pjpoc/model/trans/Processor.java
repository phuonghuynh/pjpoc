package com.phuonghuynh.pjpoc.model.trans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by phuonghqh on 10/30/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Processor implements Serializable {

  private Boolean authorized;

  private String approvalCode;

  public Boolean getAuthorized() {
    return authorized;
  }

  public void setAuthorized(Boolean authorized) {
    this.authorized = authorized;
  }

  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }
}
