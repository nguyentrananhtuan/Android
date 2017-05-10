package com.example.btthuchanh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {
	EditText edita,editb,txtKQ;
	Button btnThucHien;
	RadioButton radCong,radTru,radNhan,radChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edita=(EditText)findViewById(R.id.edita);
        editb=(EditText)findViewById(R.id.editb);
        radCong=(RadioButton) findViewById(R.id.radCong);
        radTru=(RadioButton) findViewById(R.id.radTru);
        radNhan=(RadioButton) findViewById(R.id.radNhan);
        radChia=(RadioButton) findViewById(R.id.radChia);
        txtKQ=(EditText) findViewById(R.id.txtKQ);
        btnThucHien=(Button) findViewById(R.id.btnThucHien);
        btnThucHien.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				float a=Float.parseFloat(edita.getText().toString());
				float b=Float.parseFloat(editb.getText().toString());
				if(radCong.isChecked()){
					txtKQ.setText((a+b)+"");
				}
				if(radTru.isChecked()){
					txtKQ.setText((a-b)+"");
				}
				if(radNhan.isChecked()){
					txtKQ.setText((a*b)+"");
				}
				if(radChia.isChecked()){
					if(b==0)
						txtKQ.setText("Lỗi, b phải lớn hơn 0");
					else
					txtKQ.setText((a/b)+"");
				}
				
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
