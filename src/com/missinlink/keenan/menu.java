package com.missinlink.keenan;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.missinlink.culture.R;

public class menu extends ListActivity {
	
	
	String classes[] = {"Music", "Biography", "Shows", "Twitter",
			"Facebook", "Email", "Media", "Website"};
	
	

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(menu.this, android.R.layout.simple_list_item_1, classes));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		
		
		
		super.onListItemClick(l, v, position, id);
		
		String cheese = classes[position];
		
		try{
		Class ourClass = Class.forName("com.missinlink.keenan." + cheese);
		Intent ourIntent = new Intent(menu.this, ourClass);
		startActivity(ourIntent);
		}catch(ClassNotFoundException error){
			error.printStackTrace();
			
		}
	}

	
		
	

}