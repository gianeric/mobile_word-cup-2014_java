package com.example.copadomundo2014;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuActivity extends Activity {
	
	Button bta, btb, btc, btd, bte, btf, btg, bth;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
	
		bta = (Button) findViewById(R.id.ga);
		btb = (Button) findViewById(R.id.gb);
		btc = (Button) findViewById(R.id.gc);
		btd = (Button) findViewById(R.id.gd);
		bte = (Button) findViewById(R.id.ge);
		btf = (Button) findViewById(R.id.gf);
		btg = (Button) findViewById(R.id.gg);
		bth = (Button) findViewById(R.id.gh);
	
	
		bta.setOnClickListener(new OnClickListener() 
		{
			public void onClick(View arg0)
			{
				Intent grupoa = new Intent (MenuActivity.this, JogosActivity.class);
					startActivity(grupoa);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}
