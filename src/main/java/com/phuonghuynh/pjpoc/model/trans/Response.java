package com.phuonghuynh.pjpoc.model.trans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by phuonghqh on 10/30/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response implements Serializable {

  private Boolean approved;

  private String message;

  private Processor processor;

  public Boolean getApproved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Processor getProcessor() {
    return processor;
  }

  public void setProcessor(Processor processor) {
    this.processor = processor;
  }
}
