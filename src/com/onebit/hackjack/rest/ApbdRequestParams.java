package com.onebit.hackjack.rest;

import java.util.HashMap;

import android.net.Uri;

import com.google.common.base.Joiner;

public class ApbdRequestParams {

	// define attribute 
	private HashMap<String, String> params;
	
	// define constructor
	public ApbdRequestParams() {
		params = new HashMap<String, String>();
	}
	
	public String paramsBuilder(){
		String strParams = null;
		
		if(params.size()>0){
			Joiner.MapJoiner joiner = Joiner.on("&").withKeyValueSeparator("=");
			strParams = joiner.join(params);
		}
		
		return strParams;
	}

	// define setter params
	public void setPerPage(int perPage){
		String strPerPage = Integer.toString(perPage);
		params.put("per_page", strPerPage);
	}
	public void setPage(int page){
		String strPage = Integer.toString(page);
		params.put("page", strPage);
	}
	public void setYear(String year) {
		year = Uri.encode(year).replace("/", "%2f");
		params.put("year", year);
	}
	public void setUnit(String unit) {
		unit = Uri.encode(unit).replace("/", "%2f");
		params.put("unit", unit);
	}
	public void setSKPDNama(String sKPDNama) {
		sKPDNama = Uri.encode(sKPDNama).replace("/", "%2f");
		params.put("SKPDNama", sKPDNama);
	}
	public void setUrusan(String urusan) {
		urusan = Uri.encode(urusan).replace("/", "%2f");
		params.put("urusan", urusan);
	}
	public void setNamaUrusan(String namaUrusan) {
		namaUrusan = Uri.encode(namaUrusan).replace("/", "%2f");
		params.put("namaUrusan", namaUrusan);
	}
	public void setProgram(String program) {
		program = Uri.encode(program).replace("/", "%2f");
		params.put("program", program);
	}
	public void setNamaProgram(String namaProgram) {
		namaProgram = Uri.encode(namaProgram).replace("/", "%2f");
		params.put("namaProgram", namaProgram);
	}
	public void setNoKegiatan(String noKegiatan) {
		noKegiatan = Uri.encode(noKegiatan).replace("/", "%2f");
		params.put("noKegiatan", noKegiatan);
	}
	public void setNamaKegiatan(String namaKegiatan) {
		namaKegiatan = Uri.encode(namaKegiatan).replace("/", "%2f");
		params.put("namaKegiatan", namaKegiatan);
	}
	public void setNilai(String nilai) {
		nilai = Uri.encode(nilai).replace("/", "%2f");
		params.put("nilai", nilai);
	}
	public void setKegiatanId(String kegiatanId) {
		kegiatanId = Uri.encode(kegiatanId).replace("/", "%2f");
		params.put("kegiatanId", kegiatanId);
	}
	public void setSKPDKode2013(String sKPDKode2013) {
		sKPDKode2013 = Uri.encode(sKPDKode2013).replace("/", "%2f");
		params.put("SKPDKode2013", sKPDKode2013);
	}
	public void setProgramKode(String programKode) {
		programKode = Uri.encode(programKode).replace("/", "%2f");
		params.put("programKode", programKode);
	}
	public void setRealisasi(String realisasi) {
		realisasi = Uri.encode(realisasi).replace("/", "%2f");
		params.put("realisasi", realisasi);
	}
	public void setPersenRealisasi(String persenRealisasi) {
		persenRealisasi = Uri.encode(persenRealisasi).replace("/", "%2f");
		params.put("persenRealisasi", persenRealisasi);
	}
	
}
