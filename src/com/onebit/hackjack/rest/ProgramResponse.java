package com.onebit.hackjack.rest;

import java.io.Serializable;

import com.onebit.hackjack.entity.Program;

public class ProgramResponse implements Serializable {

	// define attribute
	private static final long serialVersionUID = 1221;
	private int total;
	private int currentPageTotal;
	private String time;
	private Program[] result;
	
	// define getter
	public int getTotal() {
		return total;
	}
	public int getCurrentPageTotal() {
		return currentPageTotal;
	}
	public Program[] getResult() {
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
	public void setResult(Program[] result) {
		this.result = result;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
