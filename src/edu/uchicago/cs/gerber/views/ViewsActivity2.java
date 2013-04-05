package edu.uchicago.cs.gerber.views;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.Toast;

public class ViewsActivity2 extends Activity implements Spinner.OnItemSelectedListener, OnRatingBarChangeListener, OnSeekBarChangeListener  {

	Spinner spn;
	RatingBar rtb;
	SeekBar skb;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.va2);

		spn = (Spinner) findViewById(R.id.spn);
		rtb = (RatingBar) findViewById(R.id.rtb);
		skb = (SeekBar) findViewById(R.id.skb);

		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.days_of_week,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spn.setAdapter(adapter);
		
		spn.setOnItemSelectedListener(this);
		rtb.setOnRatingBarChangeListener(this);
		skb.setOnSeekBarChangeListener(this);
		

	}

	//################################################
	// these methods satisfy the OnItemSelectedListener interface
	//################################################
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		
		Toast.makeText(ViewsActivity2.this, "you day position " + position, Toast.LENGTH_SHORT).show();
		
	}
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}

	//################################################
	// these methods satisfy the OnRatingBarChangeListener interface
	//################################################
	@Override
	public void onRatingChanged(RatingBar ratingBar, float rating,
			boolean fromUser) {
		Toast.makeText(getApplicationContext(), "your rating " + ratingBar.getRating(), Toast.LENGTH_SHORT).show();
		
	
	}

	
	//################################################
	// these methods satisfy the OnSeekBarChangeListener interface
	//################################################

	@Override
	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) {
	}

	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {
		
	}

	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {
		Toast.makeText(getApplicationContext(), "your seek value " + seekBar.getProgress(), Toast.LENGTH_SHORT).show();
	}

}

