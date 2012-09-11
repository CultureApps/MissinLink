package com.missinlink.keenan;

import android.app.Activity;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import com.missinlink.culture.R;

public class Website extends Activity implements View.OnClickListener {

	WebView webview;
	Button bMenu;
	
	
	public void onCreate(Bundle savedInstanceState) {
	   super.onCreate(savedInstanceState);
	    setContentView(R.layout.website);
	
		// TODO Auto-generated method stub
	    
	    bMenu.setOnClickListener(this);
	   // Button bMenu = (Button) findViewById(R.id.bMenu);
	    
		webview = (WebView) findViewById(R.id.webSite);
	    webview.getSettings().setJavaScriptEnabled(true); 
	    webview.getSettings().setLoadWithOverviewMode(true);
	    webview.getSettings().setUseWideViewPort(true);
	    try{
	    webview.loadUrl("http://www.themissinlink.com/");
	    }catch(Exception e){
	    	e.printStackTrace();
	    }

	
	
	

	bMenu.setOnClickListener(new View.OnClickListener(){
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
		
			
			try{
				Class sendto = Class.forName("com.missinlink.keenan.MENU");
				Intent intent = new Intent(Website.this, sendto);
				startActivity(intent);
				}catch(ClassNotFoundException error){
					error.printStackTrace();
					
				}
			
			}
		
		});
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
}