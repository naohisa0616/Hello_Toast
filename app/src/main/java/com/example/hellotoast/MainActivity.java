package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    //レイアウトファイルで設定したIDを使ってTextViewへの参照を取得
    private TextView mShowCount;

    @Override
    //コンテンツビューをXMLレイアウトに設定するために使われ、レイアウト内の他のUI要素（TextViewなど）への参照を取得するためにも使用
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Viewは、文字列のように、idを持つことができるリソース。findViewByIdの呼び出しは、パラメータとしてビューのIDを取り、Viewを返す。
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}