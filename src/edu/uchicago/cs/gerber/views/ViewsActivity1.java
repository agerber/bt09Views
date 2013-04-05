package edu.uchicago.cs.gerber.views;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.DatePicker;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ViewsActivity1 extends Activity implements CompoundButton.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener {
	/** Called when the activity is first created. */

	TextView txtDate;
	ToggleButton tog;
	RadioGroup rgpRad;
	// you don't even need references to the radio buttons

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.va1);

		tog = (ToggleButton) findViewById(R.id.tog);
		tog.setOnCheckedChangeListener(this);

		txtDate = (TextView) findViewById(R.id.txtDate);

		// radio gruop and buttons
		rgpRad = (RadioGroup) findViewById(R.id.grp);
		
		rgpRad.setOnCheckedChangeListener(this);
	}



	@Override
	public void onCheckedChanged(RadioGroup arg0, int nId) {

		switch (nId) {
		case R.id.rad1:
			Toast.makeText(getBaseContext(),
					nId + " you clicked rad button 1",
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.rad2:
			Toast.makeText(getBaseContext(),
					nId + " you clicked rad button 2",
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.rad3:
			Toast.makeText(getBaseContext(),
					nId + " you clicked rad button 3",
					Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}

	}
	
	@Override
	public void onCheckedChanged(CompoundButton arg0, boolean bOn) {
		// TODO Auto-generated method stub
		if (bOn)
			Toast.makeText(getBaseContext(), " on", Toast.LENGTH_SHORT).show();
		else
			Toast.makeText(getBaseContext(), " off", Toast.LENGTH_SHORT).show();

	}

}