package com.onebit.hackjack.rest;

import java.io.Serializable;

import com.onebit.hackjack.entity.Apbd;

public class ApbdResponse implements Serializable {

	// define attribute
	private static final long serialVersionUID = 4;
	private int total;
	private int currentPageTotal;
	private String time;
	private Apbd[] result;
	
	// define getter
	public int getTotal() {
		return total;
	}
	public String getTime() {
		return time;
	}
	public Apbd[] getResult() {
		return result;
	}
	public int getCurrentPageTotal() {
		return currentPageTotal;
	}
	
	// define setter
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public void setResult(Apbd[] result) {
		this.result = result;
	}
	public void setCurrentPageTotal(int currentPageTotal) {
		this.currentPageTotal = currentPageTotal;
	}
	
	
	
	
}
