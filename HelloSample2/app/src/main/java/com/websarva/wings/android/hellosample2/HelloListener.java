package com.websarva.wings.android.hellosample2;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * CodeZine
 * Android開発で覚えておきたい 一歩先のJava構文
 * HelloSampleアプリ
 * トップレベルクラス版
 *
 * リスナクラス。
 *
 * @author Shinzo SAITO
 */
public class HelloListener implements View.OnClickListener {
	/**
	 * 入力画面部品。
	 */
	private EditText _input;
	/**
	 * 出力画面部品。
	 */
	private TextView _output;

	/**
	 * コンストラクタ。
	 * 画面部品をあらかじめもらい、フィールドに保持しておかないと、onClick()メソッドで利用できない。
	 *
	 * @param input 入力画面部品。
	 * @param output 出力画面部品。
	 */
	public HelloListener(EditText input, TextView output) {
		_input = input;
		_output = output;
	}

	@Override
	public void onClick(View v) {
		String inputStr = _input.getText().toString();
		_output.setText(inputStr + "さん、こんにちは!");
	}
}
