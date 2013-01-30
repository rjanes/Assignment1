package com.caloriecounter.assignment1;

import android.os.Bundle;
import android.app.Activity;
import android.app.DialogFragment;
import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	private final String TAG = "Main Activity";
	private Button changebutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i(TAG, "onCreate");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onStart(Bundle savedInstanceState){
		super.onStart();
		Log.i(TAG, "onStart");
	}
	
	public void onResume(){
		super.onResume();
		Log.i(TAG, "onResume");
	}
	
	public void onPause(){
		super.onPause();
		Log.i(TAG, "onPause");
	}
	
	public void onStop(){
		super.onStop();
		Log.i(TAG, "onStop");
	}
	public void onDesdroy(){
	super.onPause();	
	Log.i(TAG, "onDesdroy");
	}
	
	//FOR THE DATEPICKER IN CLASS LOGDATE
  	public void showDatePickerDialog(View v) {
  	    DialogFragment newFragment = new LogDate();
  	    newFragment.show(getFragmentManager(), "datePicker");
  	}
  	
  	public void switchScreenUser(){
  		changebutton = (Button) findViewById(R.id.button1);
  		changebutton.setText("CHANGED");
  	}
}
