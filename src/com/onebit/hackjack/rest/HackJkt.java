package com.onebit.hackjack.rest;

import java.util.ArrayList;
import java.util.Arrays;

import android.util.Log;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.onebit.hackjack.entity.Apbd;
import com.onebit.hackjack.entity.Trayek;

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
	 * ===================================================================
	 * APBD API
	 * ===================================================================
	 * */
	
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
	 * */

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
								new ArrayList<Trayek>(Arrays.asList(trayekResponse
										.getResult())),
								trayekResponse.getTotal(), trayekResponse.getTime());
					}

				});

	}

}
