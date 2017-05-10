package com.example.vidu_bmi;

import java.text.DecimalFormat;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity 
	implements OnClickListener{
	Button btnChandoan;
	EditText editTen,editChieucao,
			editCannang,editBMI,editChandoan;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnChandoan=(Button) findViewById(R.id.btntinhBMI);
		btnChandoan.setOnClickListener(this);
		editTen=(EditText) findViewById(R.id.editten);
		editChieucao=(EditText) findViewById(R.id.editchieucao);
		editCannang=(EditText) findViewById(R.id.editcannang);
		editBMI=(EditText) findViewById(R.id.editBMI);
		editChandoan=(EditText) findViewById(R.id.editChanDoan);
	}
	@Override
	public void onClick(View arg0) {
		double H=Double.parseDouble(editChieucao.getText()+"");
		double W=Double.parseDouble(editCannang.getText()+"");
		double BMI=W/Math.pow(H, 2);
		String chandoan="";
		if(BMI<18)
		{
			chandoan="Bạn gầy";
		}
		else if(BMI<=24.9)
		{
			chandoan="Bạn bình thường";
		}
		else if(BMI<=29.9)
		{
			chandoan="Bạn béo phì độ 1";
		}
		else if(BMI<=34.9)
		{
			chandoan="Bạn béo phì độ 2";
		}
		else
		{
			chandoan="Bạn béo phì độ 3";
		}
		DecimalFormat dcf=new DecimalFormat("#.0");
		editBMI.setText(dcf.format(BMI));
		editChandoan.setText(chandoan);
	}
}
