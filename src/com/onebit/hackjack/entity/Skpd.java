package com.onebit.hackjack.entity;

import java.io.Serializable;

public class Skpd implements Serializable {

	// define attribute
	private static final long serialVersionUID = 1320;
	private String SKPDKode;
	private String SKPDNama;
	
	// define getter
	public String getSKPDKode() {
		return SKPDKode;
	}
	public String getSKPDNama() {
		return SKPDNama;
	}
	
	// define setter
	public void setSKPDKode(String sKPDKode) {
		SKPDKode = sKPDKode;
	}
	public void setSKPDNama(String sKPDNama) {
		SKPDNama = sKPDNama;
	}
	
}
