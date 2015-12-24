package com.websarva.wings.android.hellosample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * CodeZine
 * Android開発で覚えておきたい 一歩先のJava構文
 * HelloSampleアプリ
 *
 * メインアクティビティクラス。
 *
 * @author Shinzo SAITO
 */
public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button button = (Button) findViewById(R.id.btClick);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				EditText input = (EditText) findViewById(R.id.etName);
				TextView output = (TextView) findViewById(R.id.tvOutput);
				String inputStr = input.getText().toString();
				output.setText(inputStr + "さん、こんにちは!");
			}
		});
	}
}
