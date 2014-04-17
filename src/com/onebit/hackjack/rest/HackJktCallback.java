package com.onebit.hackjack.rest;

import java.util.ArrayList;

public interface HackJktCallback<T> {
	public void onSuccess(ArrayList<T> result, int total, String time);

	public void onFailure(int statusCode, Throwable error,
			String content);
}

