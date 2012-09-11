package com.missinlink.keenan;

import android.app.Activity;

import android.content.Context;
import android.content.Intent;


import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController.MediaPlayerControl;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import com.missinlink.culture.R;



public class Music extends Activity implements View.OnClickListener, OnSeekBarChangeListener, OnItemSelectedListener {
	

	Spinner spinner;
	String entries;
	ImageView mImage;
	Button bStop, bBuy, bMenu;
	MediaPlayer letsmokethis, lickin, chill, daydreaming, makemeleak, happyfeelings, digitaltime, toughtitty;
	SeekBar sb;
	AudioManager am;
	

	
	
	
	public void onCreate(Bundle savedInstanceState) {
		   super.onCreate(savedInstanceState);
		    setContentView(R.layout.music);
		    
		    //set image
		    mImage = (ImageView) findViewById(R.drawable.ml1);
		    
		    //Set Buttons
		    
		    bStop = (Button) findViewById(R.id.bStop);
		    bMenu = (Button) findViewById(R.id.bMenu);
		    bBuy = (Button) findViewById(R.id.bBuy);
		    
		    //Set Music up
		    
		    chill = MediaPlayer.create(Music.this, R.raw.chill);
		    letsmokethis = MediaPlayer.create(Music.this, R.raw.letsmokethis);
		    daydreaming = MediaPlayer.create(Music.this, R.raw.daydreaming);
		    lickin = MediaPlayer.create(Music.this, R.raw.lickin);
		    makemeleak = MediaPlayer.create(Music.this, R.raw.makemeleak);
		    happyfeelings = MediaPlayer.create(Music.this, R.raw.happyfeelings);
		    digitaltime = MediaPlayer.create(Music.this, R.raw.digitaltime);
		    toughtitty = MediaPlayer.create(Music.this, R.raw.toughtitty);
		    
		    
		    sb = (SeekBar) findViewById(R.id.sVol);
		    am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
		    
		    int maxV = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
		     int curV = am.getStreamVolume(AudioManager.STREAM_MUSIC);
		     
		     sb.setMax(maxV);
		     sb.setProgress(curV);
		     sb.setOnSeekBarChangeListener(this);

		    //Create list items
		    String[] entries = {"Pick a Song", "Chill", "Let's Smoke This","Lickin'","Daydreaming", "Making Me Leak", "Happy Feelings", "Digital Time", "Tough Titty"};
		    
		    	
		    
		    ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, entries);
		    spinner = (Spinner) findViewById(R.id.spinner1);
		    spinner.setAdapter(adapter);
		    spinner.setOnItemSelectedListener(this);
		    
		    //set listener for buttons
		    
		   // bStop.setOnClickListener(this);
		   // bBuy.setOnClickListener(this);
		    

		
}

	public void onProgressChanged(SeekBar seekBar, int progress, boolean arg2) {
		// TODO Auto-generated method stub
		am.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);

	}

	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		int position = spinner.getSelectedItemPosition();
		switch (position){
		case 0:  
			                           //Inserted IF/ELSE Statement to release a song on new spinner selection
			
			break;
		case 1:
			
					
			if(chill.isPlaying()){
				chill.release();
			}else{
				chill.start();
				
			}
			
			
			break;
			
		case 2:
			
			
			if(letsmokethis.isPlaying()){
				letsmokethis.release();
			}else{
			letsmokethis.start();
			}
			
			
			break;
					
		case 3:
			
			
			if(lickin.isPlaying()){
				lickin.release();
			}else{
				lickin.start();
			}
			
			
			break;
			
		case 4:
			
			
			if(daydreaming.isPlaying()){
				daydreaming.release();
			}else{
				daydreaming.start();
			}
			
			
			
			break;
			
		case 5:
			
			
			if(makemeleak.isPlaying()){
				makemeleak.release();
			}else{
				makemeleak.start();
			}
			
			
			
			break;			
			
		case 6:
			
			
			
			if(happyfeelings.isPlaying()){
				happyfeelings.release();
			}else{
				happyfeelings.start();
			}
			
			break;
			
		case 7:
			
			
			if(digitaltime.isPlaying()){
				digitaltime.release();
			}else{
				digitaltime.start();
			}
			
			break;
			
		case 8:
			
			
			
			if(toughtitty.isPlaying()){
				toughtitty.release();
			}else{
				toughtitty.start();
			}
			
			
			break;
			
			
			
		}
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onPause(){
		super.onPause();
		letsmokethis.release();
		lickin.release();
		chill.release();
		daydreaming.release();
		makemeleak.release();
		happyfeelings.release();
		digitaltime.release();
		toughtitty.release();
		
	}
	
	
	
		
	//onResume was here
	@Override
	public void onResume(){
		super.onResume();
		int position = spinner.getSelectedItemPosition();
		switch (position){
		
		}
		

		//onResume ended here
	
	bBuy.setOnClickListener(new View.OnClickListener(){
		
	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		
		try{
			Class sendto = Class.forName("com.missinlink.keenan.Buy");
			Intent intent = new Intent(Music.this, sendto);
			startActivity(intent);
			}catch(ClassNotFoundException error){
				error.printStackTrace();
				
			}
		
		}
	
	});
	
	bMenu.setOnClickListener(new View.OnClickListener(){
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
		
			
			try{
				Class sendto = Class.forName("com.missinlink.keenan.MENU");
				Intent intent = new Intent(Music.this, sendto);
				startActivity(intent);
				}catch(ClassNotFoundException error){
					error.printStackTrace();
					
				}
			
			}
		
		});
		

	
		bStop.setOnClickListener(new View.OnClickListener(){
	
			public void onClick(View v){
				
				
				
				//if(letsmokethis.isPlaying()){letsmokethis.release(); were created here to stop a single mediaplayer file
				
				if(letsmokethis.isPlaying()){
					letsmokethis.reset();
					
				}else if (lickin.isPlaying()){
					lickin.reset();
					
				}else if(chill.isPlaying()){
					chill.reset();
					
				}else if(daydreaming.isPlaying()){
					daydreaming.reset();
					
				}else if(makemeleak.isPlaying()){
					makemeleak.reset();
										
				}else if(happyfeelings.isPlaying()){
					happyfeelings.reset();
					
				}else if(digitaltime.isPlaying()){
					digitaltime.reset();
					
				}else if(toughtitty.isPlaying()){
					toughtitty.reset();
					
				}else{
					//do nothing
				}
			}
		});
		
			
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	

}
