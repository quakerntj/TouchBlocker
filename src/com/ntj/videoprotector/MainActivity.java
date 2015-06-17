package com.ntj.videoprotector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void onClickStart(View v) {
		Intent service = new Intent(this, VideoProtectorService.class);
		startService(service);
		finish();
	}
}
