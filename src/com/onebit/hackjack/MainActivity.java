package com.onebit.hackjack;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.onebit.hackjack.entity.Trayek;
import com.onebit.hackjack.rest.HackJkt;
import com.onebit.hackjack.rest.HackJktCallback;
import com.onebit.hackjack.rest.TrayekRequestParams;

public class MainActivity extends Activity {

	// define attribute
	private TextView textTest;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textTest = (TextView) findViewById(R.id.text_test);
		TrayekRequestParams params = new TrayekRequestParams();
		params.setJenisTrayek("Metromini");
		params.setNamaTrayek("Kalideres");
		HackJkt.setApiKey("BmzuhEMBPnlc4Q9wNKC8mTr78VIR66Xs");
		
		HackJkt.searchTrayek(params, new HackJktCallback<Trayek>() {

			@Override
			public void onSuccess(ArrayList<Trayek> result, int total,
					String time) {
				Log.d("HALO_1", Integer.toString(result.size()));

			}

			@Override
			public void onFailure(int statusCode, Throwable error,
					String content) {

			}
		});

	}

}
