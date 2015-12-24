package com.websarva.wings.android.hellosample2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * CodeZine
 * Android開発で覚えておきたい 一歩先のJava構文
 * HelloSampleアプリ
 * トップレベルクラス版
 *
 * メインアクティビティクラス。
 *
 * @author Shinzo SAITO
 */
public class MainActivity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		EditText input = (EditText) findViewById(R.id.etName);
		TextView output = (TextView) findViewById(R.id.tvOutput);

		Button button = (Button) findViewById(R.id.btClick);
		HelloListener listener = new HelloListener(input, output);
		button.setOnClickListener(listener);
	}
}
