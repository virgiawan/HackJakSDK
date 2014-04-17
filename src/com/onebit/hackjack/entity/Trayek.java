package com.onebit.hackjack.entity;

import java.io.Serializable;

public class Trayek implements Serializable  {

	// define attribute
	private static final long serialVersionUID = 2;
	private String id;
	private String jenisAngkutan;
	private String jenisTrayek;
	private String noTrayek;
	private String namaTrayek;
	private String terminal;
	private String kodeWilayah;
	private String wilayah;
	private String sukuDinas;
	private String[] ruteBerangkat;
	private String[] ruteKembali;
	
	// define getter
	public String getId() {
		return id;
	}
	public String getJenisAngkutan() {
		return jenisAngkutan;
	}
	public String getJenisTrayek() {
		return jenisTrayek;
	}
	public String getNoTrayek() {
		return noTrayek;
	}
	public String getNamaTrayek() {
		return namaTrayek;
	}
	public String getTerminal() {
		return terminal;
	}
	public String getKodeWilayah() {
		return kodeWilayah;
	}
	public String getWilayah() {
		return wilayah;
	}
	public String getSukuDinas() {
		return sukuDinas;
	}
	public String[] getRuteBerangkat() {
		return ruteBerangkat;
	}
	public String[] getRuteKembali() {
		return ruteKembali;
	}
	
	// define setter
	public void setId(String id) {
		this.id = id;
	}
	public void setJenisAngkutan(String jenisAngkutan) {
		this.jenisAngkutan = jenisAngkutan;
	}
	public void setJenisTrayek(String jenisTrayek) {
		this.jenisTrayek = jenisTrayek;
	}
	public void setNoTrayek(String noTrayek) {
		this.noTrayek = noTrayek;
	}
	public void setNamaTrayek(String namaTrayek) {
		this.namaTrayek = namaTrayek;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public void setKodeWilayah(String kodeWilayah) {
		this.kodeWilayah = kodeWilayah;
	}
	public void setWilayah(String wilayah) {
		this.wilayah = wilayah;
	}
	public void setSukuDinas(String sukuDinas) {
		this.sukuDinas = sukuDinas;
	}
	public void setRuteBerangkat(String[] ruteBerangkat) {
		this.ruteBerangkat = ruteBerangkat;
	}
	public void setRuteKembali(String[] ruteKembali) {
		this.ruteKembali = ruteKembali;
	}
	
}
