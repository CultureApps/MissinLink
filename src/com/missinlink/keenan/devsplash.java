package com.missinlink.keenan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.missinlink.culture.R;

//All Rights Reserved. Copyright. 2011. Keenan Cooke.
//KeenanCooke@live.com
//513.549.7791

public class devsplash extends Activity{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.devsplash);
		

		
Thread timer = new Thread(){
			
			public void run(){
				
				try{
					
					sleep(3000);
					
					
				}catch(InterruptedException error){
					
					error.printStackTrace();
					
				}finally{
					
					//create intent
					Intent openMenu = new Intent("com.missinlink.keenan.SPLASH");
					
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

	finish();
	
}


}