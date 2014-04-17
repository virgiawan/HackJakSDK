package com.onebit.hackjack.entity;

import java.io.Serializable;

public class Apbd implements Serializable {
	
	// define attribute
	private static final long serialVersionUID = 1;
	private String year;
	private String unit;
	private String SKPDNama;
	private String urusan;
	private String namaUrusan;
	private String program;
	private String namaProgram;
	private String noKegiatan;
	private String namaKegiatan;
	private String nilai;
	private String kegiatanId;
	private String SKPDKode2013;
	private String programKode;
	private String realisasi;
	private String persenRealisasi;
	private String id;
	
	// define getter
	public String getYear() {
		return year;
	}
	public String getUnit() {
		return unit;
	}
	public String getSKPDNama() {
		return SKPDNama;
	}
	public String getUrusan() {
		return urusan;
	}
	public String getNamaUrusan() {
		return namaUrusan;
	}
	public String getProgram() {
		return program;
	}
	public String getNamaProgram() {
		return namaProgram;
	}
	public String getNoKegiatan() {
		return noKegiatan;
	}
	public String getNamaKegiatan() {
		return namaKegiatan;
	}
	public String getNilai() {
		return nilai;
	}
	public String getKegiatanId() {
		return kegiatanId;
	}
	public String getSKPDKode2013() {
		return SKPDKode2013;
	}
	public String getProgramKode() {
		return programKode;
	}
	public String getRealisasi() {
		return realisasi;
	}
	public String getPersenRealisasi() {
		return persenRealisasi;
	}
	public String getId() {
		return id;
	}
	
	// define setter
	public void setYear(String year) {
		this.year = year;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public void setSKPDNama(String sKPDNama) {
		SKPDNama = sKPDNama;
	}
	public void setUrusan(String urusan) {
		this.urusan = urusan;
	}
	public void setNamaUrusan(String namaUrusan) {
		this.namaUrusan = namaUrusan;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public void setNamaProgram(String namaProgram) {
		this.namaProgram = namaProgram;
	}
	public void setNoKegiatan(String noKegiatan) {
		this.noKegiatan = noKegiatan;
	}
	public void setNamaKegiatan(String namaKegiatan) {
		this.namaKegiatan = namaKegiatan;
	}
	public void setNilai(String nilai) {
		this.nilai = nilai;
	}
	public void setKegiatanId(String kegiatanId) {
		this.kegiatanId = kegiatanId;
	}
	public void setSKPDKode2013(String sKPDKode2013) {
		SKPDKode2013 = sKPDKode2013;
	}
	public void setProgramKode(String programKode) {
		this.programKode = programKode;
	}
	public void setRealisasi(String realisasi) {
		this.realisasi = realisasi;
	}
	public void setPersenRealisasi(String persenRealisasi) {
		this.persenRealisasi = persenRealisasi;
	}
	public void setId(String id) {
		this.id = id;
	}

}
