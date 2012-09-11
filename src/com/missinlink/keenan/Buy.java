package com.missinlink.keenan;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import com.missinlink.culture.R;


public class Buy extends Activity implements OnClickListener{

	WebView webview;
	
	
	public void onCreate(Bundle savedInstanceState) {
	   super.onCreate(savedInstanceState);
	    setContentView(R.layout.buy);
	
		// TODO Auto-generated method stub
		webview = (WebView) findViewById(R.id.wBuy);
	    webview.getSettings().setJavaScriptEnabled(true); 
	    webview.getSettings().setLoadWithOverviewMode(true);
	    webview.getSettings().setUseWideViewPort(true);
	    try{
	    webview.loadUrl("http://www.reverbnation.com/artist/artist_shows/154696#!/thekitchenent");
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	   

	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		finish();
		
	}
	
	
}
