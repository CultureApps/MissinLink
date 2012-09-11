package com.missinlink.keenan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.missinlink.culture.R;

public class Email extends Activity implements View.OnClickListener {

	EditText personsEmail, intro;
	String emailAdd, beginning;
	Button sendEmail;
	Button MenuButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//screen layout
		setContentView(R.layout.email);
		
		
		
		//Make your button known
		initializeVars();
		sendEmail.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated();
				String emailaddress[] = { emailAdd };
				String message = beginning;
				
				Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
				emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailaddress);
				emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "From the Missin MF Link's Android App ");
				emailIntent.setType("plain/text");
				emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
				startActivity(emailIntent);
				
			}
		});
		
		
		
		
		
		MenuButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
					Class sendto = Class.forName("com.missinlink.keenan.menu");
					Intent intent = new Intent(Email.this, sendto);
					startActivity(intent);
					}catch(ClassNotFoundException error){
						error.printStackTrace();
						
					}
				
			}
		});
	
	

	}
	

	private void initializeVars() {
		// TODO Auto-generated method stub
		personsEmail = (EditText) findViewById(R.id.etEmails);
		personsEmail.setText("LincolnTramble@gmail.com", EditText.BufferType.EDITABLE);

		intro = (EditText) findViewById(R.id.etIntro);
		sendEmail = (Button) findViewById(R.id.bSentEmail);
		MenuButton = (Button) findViewById(R.id.bReturn);
	}

	
	
	


	private void convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated() {
		// TODO Auto-generated method stub
		emailAdd = personsEmail.getText().toString();
		beginning = intro.getText().toString();
		
	
	
	

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