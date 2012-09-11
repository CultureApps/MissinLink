package com.missinlink.keenan;

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


public class Facebook extends Activity implements View.OnClickListener {
	
	WebView webview;
	EditText url;
	Button bMenu;
	
	public void onCreate(Bundle savedInstanceState) {
	   super.onCreate(savedInstanceState);
	    setContentView(R.layout.fb);
	
		// TODO Auto-generated method stub
		webview = (WebView) findViewById(R.id.webView1);
	    webview.getSettings().setJavaScriptEnabled(true); 
	    webview.getSettings().setLoadWithOverviewMode(true);
	    webview.getSettings().setUseWideViewPort(true);
	    try{
	    webview.loadUrl("http://www.facebook.com/pages/Missin-MF-Link/257317548706");
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	    
	   // Button go = (Button) findViewById(R.id.bGo);
	    Button back = (Button) findViewById(R.id.bBack);
	    Button forward = (Button) findViewById(R.id.bForward);
	    Button refresh = (Button) findViewById(R.id.bRP);
	    Button bMenu = (Button) findViewById(R.id.bMenu);
	    //bar
	    
		//url = (EditText) findViewById(R.id.tUrl);
	    
	   // go.setOnClickListener(this);
	    back.setOnClickListener(this);
	    forward.setOnClickListener(this);
	    refresh.setOnClickListener(this);
	    bMenu.setOnClickListener(this);
	    //clear.setOnClickListener(this);
	    
	    

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		
			
		case R.id.bBack:
			
			if(webview.canGoBack())
				webview.goBack();
			break;
			
		case R.id.bForward:
			
			if(webview.canGoForward())
				webview.goForward();
			break;
			
		case R.id.bRP:
			webview.reload();
			
			break;
			
		
			
		}
		
	
	
	bMenu.setOnClickListener(new View.OnClickListener(){
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
		
			
			try{
				Class sendto = Class.forName("com.missinlink.keenan.MENU");
				Intent intent = new Intent(Facebook.this, sendto);
				startActivity(intent);
				}catch(ClassNotFoundException error){
					error.printStackTrace();
					
				}
			
			}
		
		});
	
	
	 
}
}