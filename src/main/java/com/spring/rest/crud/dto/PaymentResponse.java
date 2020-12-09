package com.spring.rest.crud.dto;

import java.util.List;

import com.spring.rest.curd.model.Payment;

public class PaymentResponse {

	private String status;
	private String message;
	private String txdate;
	private List<Payment> payments;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTxdate() {
		return txdate;
	}

	public void setTxdate(String txdate) {
		this.txdate = txdate;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

}
