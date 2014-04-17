package com.onebit.hackjack.entity;

import java.io.Serializable;

public class Program implements Serializable {

	// define attribute
	private static final long serialVersionUID = 329;
	private String program;
	private String namaProgram;
	
	// define getter
	public String getProgram() {
		return program;
	}
	public String getNamaProgram() {
		return namaProgram;
	}
	
	// define setter
	public void setProgram(String program) {
		this.program = program;
	}
	public void setNamaProgram(String namaProgram) {
		this.namaProgram = namaProgram;
	}
	
}
