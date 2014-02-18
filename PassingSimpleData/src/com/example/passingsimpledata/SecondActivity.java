package com.example.passingsimpledata;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		if(getIntent().getExtras() != null){
			String name = getIntent().getExtras().getString(MainActivity.NAME_KEY);
			double age = getIntent().getExtras().getDouble(MainActivity.AGE_KEY, 22);
			User user = (User) getIntent().getExtras().getSerializable(MainActivity.USER_KEY);
			Person person = (Person) getIntent().getExtras().getParcelable(MainActivity.PERSON_KEY);
			
			//Toast.makeText(this, name + ", " + age, Toast.LENGTH_LONG).show();
			//Toast.makeText(this, user.toString(), Toast.LENGTH_LONG).show();
			Toast.makeText(this, person.toString(), Toast.LENGTH_LONG).show();
		}
		else
		{
			
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
