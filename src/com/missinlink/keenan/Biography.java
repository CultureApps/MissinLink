package com.missinlink.keenan;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.webkit.WebView;
import com.missinlink.culture.R;
import com.phonegap.*;



public class Biography extends DroidGap {
	
	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/bio.html");
		
		//setContentView(R.layout.bio);
		
		//MenuButton = (Button) findViewById(R.id.bReturn);
		
		
	//	MenuButton.setOnClickListener(new View.OnClickListener() {
			
		//	@Override
		//	public void onClick(View v) {
				// TODO Auto-generated method stub
		//		try{
		//			Class ourClass = Class.forName("com.missinlink.keenan.menu");
	//				Intent ourIntent = new Intent(Biography.this, ourClass);
	//				startActivity(ourIntent);
		//			}catch(ClassNotFoundException error){
		//				error.printStackTrace();
						
		//			}
				
	//			finish();
				
			
				
	//		}
	//	});
		
		
		
		
	}
	//protected void onPause() {
		// TODO Auto-generated method stub
	//	super.onPause();
	//	finish();
	//}
	
}