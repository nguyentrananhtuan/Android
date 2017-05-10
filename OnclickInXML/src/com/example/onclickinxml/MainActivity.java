package com.example.onclickinxml;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_Tong2so(View v){
    	EditText edittxta=(EditText)findViewById((Integer) R.id.edittxta);
    	int a=Integer.parseInt(edittxta.getText()+"");
    	EditText edittxtb=(EditText)findViewById((Integer) R.id.edittxtb);
    	int b=Integer.parseInt(edittxtb.getText()+"");
    	TextView txtkq=(TextView) findViewById((Integer) R.id.txtkq);
    	txtkq.setText((a+b)+"");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
