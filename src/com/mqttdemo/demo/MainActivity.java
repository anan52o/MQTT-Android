package com.mqttdemo.demo;

import com.example.mqttdemo.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		TextView tvOpenPush = (TextView)findViewById(R.id.tv_open_push);
		TextView tvStopPush = (TextView)findViewById(R.id.tv_stop_push);
		TextView tvSendPush = (TextView)findViewById(R.id.tv_send_push);
		
		tvOpenPush.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				MqttService.actionStart(MainActivity.this);
			}
		});
		
		tvStopPush.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				MqttService.actionStop(MainActivity.this);
			}
		});
		
		tvSendPush.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				MqttService.actionPushMsg(MainActivity.this);
			}
		});
		
	}
	
}
