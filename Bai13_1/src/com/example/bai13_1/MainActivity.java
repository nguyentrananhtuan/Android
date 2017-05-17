package com.example.bai13_1;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String arr[]=getResources().getStringArray(R.array.myarray);
        ListView lv=(ListView) findViewById(R.id.lvperson);
        ArrayAdapter<String>adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        lv.setAdapter(adapter);
        final TextView txt=(TextView)findViewById(R.id.txtselection);
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				txt.setText("Vị trí:"+arg2+" Giá trị: "+arr[arg2]);
			}
		}
		);
        
    }
}    		
