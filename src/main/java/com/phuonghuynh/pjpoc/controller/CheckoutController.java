package com.phuonghuynh.pjpoc.controller;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.phuonghuynh.pjpoc.model.trans.Transaction;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by phuonghqh on 10/28/15.
 */

@Controller
public class CheckoutController {

  @Value("${payJunction.api.username}")
  private String apiUsername;

  @Value("${payJunction.api.pwd}")
  private String apiPassword;

  @Value("${payJunction.api.transaction.url}")
  private String transactionUrl;

  @Value("${payJunction.api.key}")
  private String apiKey;

  @RequestMapping("checkout")
  public String abc(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
    model.put("transactionId", request.getParameter("tracking_code"));
    return "/jsp/transaction.jsp";
  }

  //example json pjpoc/src/main/resources/example/recurringBillTransaction.json
  @RequestMapping("checkout/recurring-bill/{transactionId}")
  public String recurringBill(@PathVariable Long transactionId,
                            @RequestParam(required = false) Long postTransactionId, ModelMap modelMap) {
    try {
      Long billTransId = postTransactionId != null ? postTransactionId : transactionId;
      String transactionJson = Unirest.post(transactionUrl)
        .header("X-PJ-Application-Key", apiKey)
        .field("transactionId", billTransId)
        .basicAuth(apiUsername, apiPassword)
        .asString().getBody();

      Transaction transaction = new ObjectMapper().readValue(transactionJson, Transaction.class);
      modelMap.put("transaction", transaction);
      System.out.println(transactionJson);
    }
    catch (UnirestException e) {
      e.printStackTrace();
    }
    catch (JsonParseException e) {
      e.printStackTrace();
    }
    catch (JsonMappingException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }

    return "/jsp/rebillTrans.jsp";
  }
}
