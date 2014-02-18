package com.example.passingsimpledata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	final static String NAME_KEY = "NAME";
	final static String AGE_KEY = "AGE";
	final static String USER_KEY = "USER";
	final static String PERSON_KEY = "PERSON";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SecondActivity.class);
				intent.putExtra(NAME_KEY, "Bob Smith");
				//sintent.putExtra(AGE_KEY, (double)25.5);
				
				User user = new User("Alice", 26.4);
				Person person = new Person("Alice", "Charlotte, NC", 25.5);
				intent.putExtra(PERSON_KEY, person);
				intent.putExtra(USER_KEY, user);
				
				startActivity(intent);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
