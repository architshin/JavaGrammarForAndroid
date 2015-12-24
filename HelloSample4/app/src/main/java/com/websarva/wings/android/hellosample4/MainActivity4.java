package com.websarva.wings.android.hellosample4;

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
 * 無名クラス変数化版
 *
 * メインアクティビティクラス。
 *
 * @author Shinzo SAITO
 */
public class MainActivity4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button button = (Button) findViewById(R.id.btClick);
		View.OnClickListener listener = new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				EditText input = (EditText) findViewById(R.id.etName);
				TextView output = (TextView) findViewById(R.id.tvOutput);
				String inputStr = input.getText().toString();
				output.setText(inputStr + "さん、こんにちは!");
			}
		};
		button.setOnClickListener(listener);
	}
}
