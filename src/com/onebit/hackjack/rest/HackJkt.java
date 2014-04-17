package com.onebit.hackjack.rest;

import java.util.ArrayList;
import java.util.Arrays;

import android.util.Log;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.onebit.hackjack.entity.Apbd;
import com.onebit.hackjack.entity.Program;
import com.onebit.hackjack.entity.Trayek;
import com.onebit.hackjack.entity.Urusan;

public class HackJkt {

	// define attribute
	public static String API_KEY = "";
	private static String BASE_URL = "http://api.hackjak.bazed.me/";
	private static String APBD_URL = BASE_URL + "apbd?apiKey=" + API_KEY;
	private static String TRAYEK_URL = BASE_URL + "trayek?apiKey=" + API_KEY;
	private static AsyncHttpClient async = new AsyncHttpClient();
	private static Gson gson = new Gson();

	public static void setApiKey(String apiKey) {
		API_KEY = apiKey;
	}

	/*
	 * =================================================================== APBD
	 * API ===================================================================
	 */

	// define method
	public static void getListApbd(ApbdRequestParams apbdParam,
			final HackJktCallback<Apbd> callback) {
		String strParams = "";
		if (apbdParam != null)
			strParams = "&" + apbdParam.paramsBuilder();

		async.get(APBD_URL + strParams, new AsyncHttpResponseHandler() {
			@Override
			public void onFailure(int statusCode, Throwable error,
					String content) {
				Log.e("ERROR_RESPONSE", content + "");
				callback.onFailure(statusCode, error, content);
			}

			@Override
			public void onStart() {
				Log.d("START_REQUEST", "getListApbd() run");
			}

			@Override
			public void onSuccess(int statusCode, String content) {
				Log.d("SUCCESS_RESPONSE", Integer.toString(statusCode) + "");
				ApbdResponse apbdResponse = gson.fromJson(content,
						ApbdResponse.class);
				callback.onSuccess(
						new ArrayList<Apbd>(Arrays.asList(apbdResponse
								.getResult())), apbdResponse.getTotal(),
						apbdResponse.getTime());
			}

		});

	}

	public static void getApbd(String apbdId,
			final HackJktCallback<Apbd> callback) {
		async.get(BASE_URL + "apbd/" + apbdId + "?apiKey=" + API_KEY,
				new AsyncHttpResponseHandler() {

					@Override
					public void onFailure(int statusCode, Throwable error,
							String content) {
						Log.e("ERROR_RESPONSE", content + "");
						callback.onFailure(statusCode, error, content);
					}

					@Override
					public void onStart() {
						Log.d("START_REQUEST", "getApbd() run");
					}

					@Override
					public void onSuccess(int statusCode, String content) {
						Log.d("SUCCESS_RESPONSE", Integer.toString(statusCode)
								+ "");
						ApbdResponse apbdResponse = gson.fromJson(content,
								ApbdResponse.class);
						callback.onSuccess(
								new ArrayList<Apbd>(Arrays.asList(apbdResponse
										.getResult())),
								apbdResponse.getTotal(), apbdResponse.getTime());
					}

				});
	}

	public static void searchApbd(ApbdRequestParams apbdParam,
			final HackJktCallback<Apbd> callback) {
		String strParams = "";
		if (apbdParam != null)
			strParams = "&" + apbdParam.paramsBuilder();

		async.get(BASE_URL + "apbd/search?apiKey=" + API_KEY + strParams,
				new AsyncHttpResponseHandler() {
					@Override
					public void onFailure(int statusCode, Throwable error,
							String content) {
						Log.e("ERROR_RESPONSE", content + "");
						callback.onFailure(statusCode, error, content);
					}

					@Override
					public void onStart() {
						Log.d("START_REQUEST", "searchApbd() run");
					}

					@Override
					public void onSuccess(int statusCode, String content) {
						Log.d("SUCCESS_RESPONSE", Integer.toString(statusCode)
								+ "");
						ApbdResponse apbdResponse = gson.fromJson(content,
								ApbdResponse.class);
						callback.onSuccess(
								new ArrayList<Apbd>(Arrays.asList(apbdResponse
										.getResult())),
								apbdResponse.getTotal(), apbdResponse.getTime());
					}

				});

	}

	/*
	 * ===================================================================
	 * TRAYEK API
	 * ===================================================================
	 */

	public static void getListTrayek(TrayekRequestParams trayekParams,
			final HackJktCallback<Trayek> callback) {
		String strParams = "";
		if (trayekParams != null)
			strParams = "&" + trayekParams.paramsBuilder();

		async.get(TRAYEK_URL + strParams, new AsyncHttpResponseHandler() {
			@Override
			public void onFailure(int statusCode, Throwable error,
					String content) {
				Log.e("ERROR_RESPONSE", content + "");
				callback.onFailure(statusCode, error, content);
			}

			@Override
			public void onStart() {
				Log.d("START_REQUEST", "getListTrayek() run");
			}

			@Override
			public void onSuccess(int statusCode, String content) {
				Log.d("SUCCESS_RESPONSE", Integer.toString(statusCode) + "");
				TrayekResponse trayekResponse = gson.fromJson(content,
						TrayekResponse.class);
				callback.onSuccess(
						new ArrayList<Trayek>(Arrays.asList(trayekResponse
								.getResult())), trayekResponse.getTotal(),
						trayekResponse.getTime());
			}

		});
	}

	public static void getTrayek(String trayekId,
			final HackJktCallback<Trayek> callback) {
		async.get(BASE_URL + "trayek/" + trayekId + "?apiKey=" + API_KEY,
				new AsyncHttpResponseHandler() {

					@Override
					public void onFailure(int statusCode, Throwable error,
							String content) {
						Log.e("ERROR_RESPONSE", content + "");
						callback.onFailure(statusCode, error, content);
					}

					@Override
					public void onStart() {
						Log.d("START_REQUEST", "getApbd() run");
					}

					@Override
					public void onSuccess(int statusCode, String content) {
						Log.d("SUCCESS_RESPONSE", Integer.toString(statusCode)
								+ "");
						TrayekResponse trayekResponse = gson.fromJson(content,
								TrayekResponse.class);
						callback.onSuccess(
								new ArrayList<Trayek>(Arrays
										.asList(trayekResponse.getResult())),
								trayekResponse.getTotal(), trayekResponse
										.getTime());
					}

				});
	}

	public static void searchTrayek(TrayekRequestParams trayekParams,
			final HackJktCallback<Trayek> callback) {
		String strParams = "";
		if (trayekParams != null)
			strParams = "&" + trayekParams.paramsBuilder();

		async.get(BASE_URL + "trayek/search?apiKey=" + API_KEY + strParams,
				new AsyncHttpResponseHandler() {
					@Override
					public void onFailure(int statusCode, Throwable error,
							String content) {
						Log.e("ERROR_RESPONSE", content + "");
						callback.onFailure(statusCode, error, content);
					}

					@Override
					public void onStart() {
						Log.d("START_REQUEST", "searchApbd() run");
					}

					@Override
					public void onSuccess(int statusCode, String content) {
						Log.d("SUCCESS_RESPONSE", Integer.toString(statusCode)
								+ "");
						TrayekResponse trayekResponse = gson.fromJson(content,
								TrayekResponse.class);
						callback.onSuccess(
								new ArrayList<Trayek>(Arrays
										.asList(trayekResponse.getResult())),
								trayekResponse.getTotal(), trayekResponse
										.getTime());
					}

				});
	}

	/*
	 * ===================================================================
	 * URUSAN API
	 * ===================================================================
	 */

	public static void getListUrusan(int tahun,
			final HackJktCallback<Urusan> callback) {
		String urlUrusan = BASE_URL + "apbd/urusan/" + Integer.toString(tahun)
				+ "?apiKey=" + API_KEY;
		async.get(urlUrusan, new AsyncHttpResponseHandler() {

			@Override
			public void onFailure(int statusCode, Throwable error,
					String content) {
				Log.e("ERROR_RESPONSE", content + "");
				callback.onFailure(statusCode, error, content);
			}

			@Override
			public void onStart() {
				Log.d("START_REQUEST", "getListUrusan() run");
			}

			@Override
			public void onSuccess(int statusCode, String content) {
				Log.d("SUCCESS_RESPONSE", Integer.toString(statusCode) + "");
				UrusanResponse urusanResponse = gson.fromJson(content,
						UrusanResponse.class);
				callback.onSuccess(
						new ArrayList<Urusan>(Arrays.asList(urusanResponse
								.getResult())), urusanResponse.getTotal(),
						urusanResponse.getTime());
			}

		});
	}
	
	/*
	 * ===================================================================
	 * PROGRAM API
	 * ===================================================================
	 */
	
	public static void getListProgram(int tahun, final HackJktCallback<Program> callback){
		String urlProgram = BASE_URL + "apbd/program/" + Integer.toString(tahun)
				+ "?apiKey=" + API_KEY;
		async.get(urlProgram, new AsyncHttpResponseHandler() {

			@Override
			public void onFailure(int statusCode, Throwable error,
					String content) {
				Log.e("ERROR_RESPONSE", content + "");
				callback.onFailure(statusCode, error, content);
			}

			@Override
			public void onStart() {
				Log.d("START_REQUEST", "getListUrusan() run");
			}

			@Override
			public void onSuccess(int statusCode, String content) {
				Log.d("SUCCESS_RESPONSE", Integer.toString(statusCode) + "");
				ProgramResponse programResponse = gson.fromJson(content,
						ProgramResponse.class);
				callback.onSuccess(
						new ArrayList<Program>(Arrays.asList(programResponse
								.getResult())), programResponse.getTotal(),
						programResponse.getTime());
			}

		});
	}

}
