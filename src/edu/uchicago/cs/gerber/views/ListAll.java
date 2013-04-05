package edu.uchicago.cs.gerber.views;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//make sure to include this in your AndroidManifest

//<activity
//android:name=".ListAll"
//android:label="ListAllActivities" >
//<intent-filter>
//    <action android:name="android.intent.action.MAIN" />
//    <category android:name="android.intent.category.LAUNCHER" />
//</intent-filter>
//</activity>

//also make sure to have this in your layout directory

//<?xml version="1.0" encoding="utf-8"?>
//<LinearLayout
//    xmlns:android="http://schemas.android.com/apk/res/android"
//    android:orientation="vertical"
//    android:layout_width="fill_parent" 
//    android:layout_height="fill_parent" >
//
//    <ListView
//        android:id="@android:id/list"
//        android:layout_width="fill_parent" 
//        android:layout_height="fill_parent"
//        android:drawSelectorOnTop="false"
//        android:choiceMode="multipleChoice"
//        />
//</LinearLayout>

public class ListAll extends ListActivity {

	//this list corresponds with the other activities you want to launch
	String[] strItems = { "ViewsActivity1", "ViewsActivity2" };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.listall);
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_expandable_list_item_1, strItems));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int nPos, long id) {

		String strPackage = getApplicationContext().getPackageName();
		Class cls = null;
		try {
			cls = Class.forName(strPackage + "." + strItems[nPos]);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		if (cls != null) {
			Intent itn = new Intent(this, cls);
			startActivity(itn);
		}
	}

}
