package com.example.copadomundo2014;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.SumPathEffect;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ResultadosActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_classifica);
		
		Button btvolta;
		
		TextView txtselecao1, txtselecao2, txtselecao3, txtselecao4;
		TextView txtponto1, txtponto2, txtponto3, txtponto4;
		TextView txtsg1, txtsg2, txtsg3, txtsg4;
		
		Integer brasilpontos = 0 , croaciapontos = 0, camaroespontos = 0, mexicopontos = 0;
		Integer brasilgols = 0 , croaciagols = 0, camaroesgols = 0 , mexicogols = 0;
		
		txtselecao1 = (TextView)findViewById(R.id.selecao1);
		txtselecao2 = (TextView)findViewById(R.id.selecao2);
		txtselecao3 = (TextView)findViewById(R.id.selecao3);
		txtselecao4 = (TextView)findViewById(R.id.selecao4);
		txtponto1 = (TextView)findViewById(R.id.pontos1);
		txtponto2 = (TextView)findViewById(R.id.pontos2);
		txtponto3 = (TextView)findViewById(R.id.pontos3);
		txtponto4 = (TextView)findViewById(R.id.pontos4);
		txtsg1 = (TextView)findViewById(R.id.txtSaldogols1);
		txtsg2 = (TextView)findViewById(R.id.txtSaldogols2);
		txtsg3 = (TextView)findViewById(R.id.txtSaldogols3);
		txtsg4 = (TextView)findViewById(R.id.txtSaldogols4);
	
		Intent it = getIntent();
		if (it != null)
		{
			Bundle params = it.getExtras();
			if(params !=null)
			{
				
				String stringjogobr1 = params.getString("brasiljogo1");
				String stringjogocr1 = params.getString("croaciajogo1");
				String stringjogoca1 = params.getString("camaroesjogo1");
				String stringjogome1 = params.getString("mexicojogo1");
				Integer jogobr1 = Integer.parseInt(stringjogobr1);
				Integer jogocr1 = Integer.parseInt(stringjogocr1);
				Integer jogoca1 = Integer.parseInt(stringjogoca1);
				Integer jogome1 = Integer.parseInt(stringjogome1);
				String stringjogobr2 = params.getString("brasiljogo2");
				String stringjogocr2 = params.getString("croaciajogo2");
				String stringjogoca2 = params.getString("camaroesjogo2");
				String stringjogome2 = params.getString("mexicojogo2");
				Integer jogobr2 = Integer.parseInt(stringjogobr2);
				Integer jogocr2 = Integer.parseInt(stringjogocr2);
				Integer jogoca2 = Integer.parseInt(stringjogoca2);
				Integer jogome2 = Integer.parseInt(stringjogome2);
				String stringjogobr3 = params.getString("brasiljogo3");
				String stringjogocr3 = params.getString("croaciajogo3");
				String stringjogoca3 = params.getString("camaroesjogo3");
				String stringjogome3 = params.getString("mexicojogo3");
				Integer jogobr3 = Integer.parseInt(stringjogobr3);
				Integer jogocr3 = Integer.parseInt(stringjogocr3);
				Integer jogoca3 = Integer.parseInt(stringjogoca3);
				Integer jogome3 = Integer.parseInt(stringjogome3);
				
				int[][] matriz = new int[4][3];  
				matriz[0][0] = jogobr1; 
				matriz[0][1] = jogobr2;  
				matriz[0][2] = jogobr3;  
				matriz[1][0] = jogocr1;
				matriz[1][1] = jogocr2;
				matriz[1][2] = jogocr3;
				matriz[2][0] = jogoca1;
				matriz[2][1] = jogoca2;
				matriz[2][2] = jogoca3;
				matriz[3][0] = jogome1;
				matriz[3][1] = jogome2;
				matriz[3][2] = jogome3;
				
				
				if (matriz[0][0] > matriz[1][0]){
					brasilpontos = brasilpontos + 3;
				}
				else if (matriz[0][0] < matriz[1][0])
				{
					brasilpontos = brasilpontos + 0;
					
				}
				else{
					brasilpontos = brasilpontos + 1;
				}
				if (matriz[0][1] > matriz[2][1]) 
				{
					brasilpontos = brasilpontos + 3;
				
			    }
				else if (matriz[0][1] < matriz[2][1])
				{
					brasilpontos = brasilpontos + 0;
					
				}
				else 
				{
					brasilpontos = brasilpontos + 1;
					
				}
				
				
				if (matriz[0][2] > matriz[3][2]) 
				{
					brasilpontos = brasilpontos + 3;
				
			    }
				else if (matriz[0][2] < matriz[3][2])
				{
					brasilpontos = brasilpontos + 0;
					
				}
				else 
				{
					brasilpontos = brasilpontos + 1;
					
				}
				
				brasilgols = matriz[0][0] + matriz[0][1] + matriz[0][2]; 
				
				
				String brgol = brasilgols.toString();
				String brpont = brasilpontos.toString();
				
				txtselecao1.setText("Brasil");
				txtponto1.setText(brpont);
				txtsg1.setText(brgol);
				
				
				if (matriz[1][0] > matriz[0][0]) 
				{
					croaciapontos = croaciapontos + 3;
				
			    }
				else if (matriz[1][0] < matriz[0][0])
				{
					croaciapontos = croaciapontos + 0;
					
				}
				else 
				{
					croaciapontos = croaciapontos + 1;
					
				}
				
				
				if (matriz[1][1] > matriz[3][1]) 
				{
					croaciapontos = croaciapontos + 3;
				
			    }
				else if (matriz[1][1] < matriz[3][1])
				{
					croaciapontos = croaciapontos + 0;
					
				}
				else 
				{
					croaciapontos = croaciapontos + 1;
					
				}
				
				
				if (matriz[1][2] > matriz[2][2]) 
				{
					croaciapontos = croaciapontos + 3;
				
			    }
				else if (matriz[1][2] < matriz[2][2])
				{
					croaciapontos = croaciapontos + 0;
					
				}
				else 
				{
					croaciapontos = croaciapontos + 1;
					
				}
				
				croaciagols = matriz[1][0] + matriz[1][1] + matriz[1][2]; 
				
				
				String crgol = croaciagols.toString();
				String crpont = croaciapontos.toString();
				
				txtselecao2.setText("Croacia");
				txtponto2.setText(crpont);
				txtsg2.setText(crgol);
				
				
				if (matriz[2][0] > matriz[3][0]) 
				{
					camaroespontos = camaroespontos + 3;
				
			    }
				else if (matriz[2][0] < matriz[3][0])
				{
					camaroespontos = camaroespontos + 0;
					
				}
				else 
				{
					camaroespontos = camaroespontos + 1;
					
				}
				
				
				if (matriz[2][1] > matriz[1][1]) 
				{
					camaroespontos = camaroespontos + 3;
				
			    }
				else if (matriz[2][1] < matriz[1][1])
				{
					camaroespontos = camaroespontos + 0;
					
				}
				else 
				{
					camaroespontos = camaroespontos + 1;
					
				}
				
				
				if (matriz[2][2] > matriz[0][2]) 
				{
					camaroespontos = camaroespontos + 3;
				
			    }
				else if (matriz[2][2] < matriz[0][2])
				{
					camaroespontos = camaroespontos + 0;
					
				}
				else 
				{
					camaroespontos = camaroespontos + 1;
					
				}
				
				camaroesgols = matriz[2][0] + matriz[2][1] + matriz[2][2]; 
				
				
				String cagol = camaroesgols.toString();
				String capont = camaroespontos.toString();
				
				txtselecao3.setText("Camaroes");
				txtponto3.setText(capont);
				txtsg3.setText(cagol);
				
				
				if (matriz[3][0] > matriz[2][0]) 
				{
					mexicopontos = mexicopontos + 3;
				
			    }
				else if (matriz[3][0] < matriz[2][0])
				{
					mexicopontos = mexicopontos + 0;
					
				}
				else 
				{
					mexicopontos = mexicopontos + 1;
					
				}
				
				
				if (matriz[3][1] > matriz[0][1]) 
				{
					mexicopontos = mexicopontos + 3;
				
			    }
				else if (matriz[3][1] < matriz[0][1])
				{
					mexicopontos = mexicopontos + 0;
					
				}
				else 
				{
					mexicopontos = mexicopontos + 1;
					
				}
				
				
				if (matriz[3][2] > matriz[1][2]) 
				{
					mexicopontos = mexicopontos + 3;
				
			    }
				else if (matriz[3][2] < matriz[1][2])
				{
					mexicopontos = mexicopontos + 0;
					
				}
				else 
				{
					mexicopontos = mexicopontos + 1;
					
				}
				
				mexicogols = matriz[3][0] + matriz[3][1] + matriz[3][2]; 
				
				
				String megol = mexicogols.toString();
				String mepont = mexicopontos.toString();
				
				txtselecao4.setText("Mexico");
				txtponto4.setText(mepont);
				txtsg4.setText(megol);
				
				
			}
		}
		
	btvolta = (Button)findViewById(R.id.btnVoltaGrupoo);
	btvolta.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent it = new Intent(ResultadosActivity.this, MenuActivity.class);
			startActivity(it);
			
		}
	});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.classifica, menu);
		return true;
	}

}
