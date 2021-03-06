package com.onebit.hackjack.rest;

import java.io.Serializable;

import com.onebit.hackjack.entity.Urusan;

public class UrusanResponse implements Serializable {

	// define variable
	private static final long serialVersionUID = 7678;
	private int total;
	private int currentPageTotal;
	private String time;
	private Urusan[] result;
	
	// define getter
	public int getTotal() {
		return total;
	}
	public int getCurrentPageTotal() {
		return currentPageTotal;
	}
	public Urusan[] getResult() {
		return result;
	}
	public String getTime() {
		return time;
	}
	
	// define setter
	public void setTotal(int total) {
		this.total = total;
	}
	public void setCurrentPageTotal(int currentPageTotal) {
		this.currentPageTotal = currentPageTotal;
	}
	public void setResult(Urusan[] result) {
		this.result = result;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
