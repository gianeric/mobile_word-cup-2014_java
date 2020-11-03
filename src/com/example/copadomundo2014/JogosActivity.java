package com.example.copadomundo2014;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class JogosActivity extends Activity {
	
	EditText ed1, ed2, ed3, ed4, ed5, ed6,
	         ed7, ed8, ed9, ed10, ed11, ed12;
	
	Button btApura, btVolta;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jogos);
		
		//Edits
		ed1 = (EditText)findViewById(R.id.editText1);
		ed2 = (EditText)findViewById(R.id.editText2);
		ed3 = (EditText)findViewById(R.id.editText3);
		ed4 = (EditText)findViewById(R.id.editText4);
		ed5 = (EditText)findViewById(R.id.editText5);
		ed6 = (EditText)findViewById(R.id.editText6);
		ed7 = (EditText)findViewById(R.id.editText7);
		ed8 = (EditText)findViewById(R.id.editText8);
		ed9 = (EditText)findViewById(R.id.editText9);
		ed10 = (EditText)findViewById(R.id.editText10);
		ed11 = (EditText)findViewById(R.id.editText11);
		ed12 = (EditText)findViewById(R.id.editText12);
	
		//Botoes
		
		btApura = (Button)findViewById(R.id.btnApurar);
		btVolta = (Button)findViewById(R.id.btnMenu);
		
		
		btVolta.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent voltaGrupos = new Intent (JogosActivity.this, MenuActivity.class);
				startActivity(voltaGrupos);
				
			}
		});
		
		btApura.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// pegar strings dos edits inseridos pelo usuario
				
				
				String jogobr = ed1.getText().toString();
				String jogocr = ed2.getText().toString();
				String jogoca = ed3.getText().toString();
				String jogome = ed4.getText().toString();												
				String jogobr2 = ed5.getText().toString();
				String jogome2 = ed6.getText().toString();
				String jogoca2 = ed7.getText().toString();
				String jogocr2 = ed8.getText().toString();								
				String jogobr3 = ed9.getText().toString();
				String jogoca3 = ed10.getText().toString();
				String jogome3 = ed11.getText().toString();
				String jogocr3 = ed12.getText().toString();
		
				 // Passando por parametro
					Intent it = new Intent(JogosActivity.this, ResultadosActivity.class);
					Bundle params = new Bundle();
				
						params.putString("brasiljogo1", jogobr);
						params.putString("croaciajogo1", jogocr);
						params.putString("camaroesjogo1", jogoca);
						params.putString("mexicojogo1", jogome);
		        
						params.putString("brasiljogo2", jogobr2);
						params.putString("croaciajogo2", jogocr2);
						params.putString("camaroesjogo2", jogoca2);
						params.putString("mexicojogo2", jogome2);
		        
						params.putString("brasiljogo3", jogobr3);
						params.putString("croaciajogo3", jogocr3);
						params.putString("camaroesjogo3", jogoca3);
						params.putString("mexicojogo3", jogome3);
		        
		        			it.putExtras(params);
		        		startActivity(it);
				
			}
			
		
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jogos, menu);
		return true;
	}

}
