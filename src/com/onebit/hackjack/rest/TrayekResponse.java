package com.onebit.hackjack.rest;

import java.io.Serializable;

import com.onebit.hackjack.entity.Trayek;

public class TrayekResponse implements Serializable {

	// define attribute
	private static final long serialVersionUID = 3;
	private int total;
	private int currentPageTotal;
	private String time;
	private Trayek[] result;
	
	// define getter
	public int getTotal() {
		return total;
	}
	public String getTime() {
		return time;
	}
	public Trayek[] getResult() {
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
	public void setResult(Trayek[] result) {
		this.result = result;
	}
	public void setCurrentPageTotal(int currentPageTotal) {
		this.currentPageTotal = currentPageTotal;
	}

}
