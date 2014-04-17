package com.onebit.hackjack.rest;

import java.util.HashMap;

import android.net.Uri;

import com.google.common.base.Joiner;

public class TrayekRequestParams {

	// define attribute
	private HashMap<String, String> params;

	// define constructor
	public TrayekRequestParams() {
		params = new HashMap<String, String>();
	}

	public String paramsBuilder() {
		String strParams = null;

		if (params.size() > 0) {
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
	public void setJenisAngkutan(String jenisAngkutan) {
		jenisAngkutan = Uri.encode(jenisAngkutan).replace("/", "%2f");
		params.put("jenisAngkutan", jenisAngkutan);
	}
	public void setJenisTrayek(String jenisTrayek) {
		jenisTrayek = Uri.encode(jenisTrayek).replace("/", "%2f");
		params.put("jenisTrayek", jenisTrayek);
	}
	public void setNoTrayek(String noTrayek) {
		noTrayek = Uri.encode(noTrayek).replace("/", "%2f");
		params.put("noTrayek", noTrayek);
	}
	public void setNamaTrayek(String namaTrayek) {
		namaTrayek = Uri.encode(namaTrayek).replace("/", "%2f");
		params.put("namaTrayek", namaTrayek);
	}
	public void setTerminal(String terminal) {
		terminal = Uri.encode(terminal).replace("/", "%2f");
		params.put("terminal", terminal);
	}
	public void setKodeWilayah(String kodeWilayah) {
		kodeWilayah = Uri.encode(kodeWilayah).replace("/", "%2f");
		params.put("kodeWilayah", kodeWilayah);
	}
	public void setWilayah(String wilayah) {
		wilayah = Uri.encode(wilayah).replace("/", "%2f");
		params.put("jenisTrayek", wilayah);
	}

}
