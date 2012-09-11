package com.missinlink.keenan;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.missinlink.culture.R;


import java.io.IOException;
import java.io.File;
import java.net.URL;

public class Media extends Activity implements View.OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.media);
	

		
		this.setOnClickListener(new View.OnClickListener() {
			
		@Override
		public void onClick(View v) {
			String video_path = "http://www.youtube.com/watch?v=opZ69P-0Jbc";
			Uri uri = Uri.parse(video_path);

			// With this line the Youtube application, if installed, will launch immediately.
			// Without it you will be prompted with a list of the application to choose.
			uri = Uri.parse("vnd.youtube:"  + uri.getQueryParameter("v"));

			Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			startActivity(intent);
			
			
			
		
			
		}
	});




	}

	
	//
	
	//AI39si5HuB7yCcflDGkivNCzdTin5emx570YId6r61eoUTefyY6Wl6NW1duPoD9y1u4L5FQ4LYgvBQmiFa6SOrQfAq0AX51R6g

private void setOnClickListener(OnClickListener onClickListener) {
		// TODO Auto-generated method stub
	String video_path = "http://www.youtube.com/watch?v=b83Icn39lpE";
	Uri uri = Uri.parse(video_path);

	// With this line the Youtube application, if installed, will launch immediately.
	// Without it you will be prompted with a list of the application to choose.
	uri = Uri.parse("vnd.youtube:"  + uri.getQueryParameter("v"));

	Intent intent = new Intent(Intent.ACTION_VIEW, uri);
	startActivity(intent);
	}

protected void onPause() {
// TODO Auto-generated method stub
super.onPause();
finish();
}

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	
       }
}
	
