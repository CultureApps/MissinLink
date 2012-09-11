package com.missinlink.keenan;

import android.app.Activity;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.app.Activity;

import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import com.missinlink.culture.R;

public class Shows extends Activity implements View.OnClickListener {

	WebView webview;
	
	
	public void onCreate(Bundle savedInstanceState) {
	   super.onCreate(savedInstanceState);
	    setContentView(R.layout.shows);
	
		// TODO Auto-generated method stub
		webview = (WebView) findViewById(R.id.webView2);
	    webview.getSettings().setJavaScriptEnabled(true); 
	    webview.getSettings().setLoadWithOverviewMode(true);
	    webview.getSettings().setUseWideViewPort(true);
	    try{
	    webview.loadUrl("http://www.themissinlink.com/tourdates/");
	    }catch(Exception e){
	    	e.printStackTrace();
	    }

	
	
	
}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
}
