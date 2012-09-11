package com.missinlink.keenan;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import com.missinlink.culture.R;


public class splash extends Activity {
	
	MediaPlayer splashmusic;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		splashmusic = MediaPlayer.create(splash.this, R.raw.splashing);
		//start
		splashmusic.start();
		
		
		
Thread timer = new Thread(){
			
			public void run(){
				
				try{
					
					sleep(11750);
					
					
				}catch(InterruptedException error){
					
					error.printStackTrace();
					
				}finally{
					
					//create intent
					Intent openMenu = new Intent("com.missinlink.keenan.MENU");
					
					startActivity(openMenu);
					
				}
			}
			
		};
		timer.start();
		
	}
		
	
	
	


@Override
protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	
	
	splashmusic.release();
	
	finish();
	
}


}
