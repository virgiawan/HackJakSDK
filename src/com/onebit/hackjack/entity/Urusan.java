package com.onebit.hackjack.entity;

import java.io.Serializable;

public class Urusan implements Serializable {

	// define attribute
	private static final long serialVersionUID = 56;
	private String urusan;
	private String namaUrusan;
	
	// define getter
	public String getUrusan() {
		return urusan;
	}
	public String getNamaUrusan() {
		return namaUrusan;
	}
	
	// define setter
	public void setUrusan(String urusan) {
		this.urusan = urusan;
	}
	public void setNamaUrusan(String namaUrusan) {
		this.namaUrusan = namaUrusan;
	}
	
	
}
