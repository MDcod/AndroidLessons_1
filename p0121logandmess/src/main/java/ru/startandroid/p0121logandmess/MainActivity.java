package ru.startandroid.p0121logandmess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btnOk, btnCancel;
    TextView tvOut;
    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Найдем все View элементы");
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        Log.d(TAG,"Присваиваем обработчик кнопкам");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG,"По id определяем кнопку которая была нажата");
        switch (v.getId()) {
            case R.id.btnOk:
                Log.d(TAG,"Нажата кнопка Ok");
                tvOut.setText("Нажата кнопка OK");
                Toast.makeText(this,"Была нажата кнопка Ok",Toast.LENGTH_LONG).show();
                break;
            case R.id.btnCancel:
                Log.d(TAG,"Нажата кнопка Cancel");
                tvOut.setText("Нажата кнопка Cancel");
                Toast.makeText(this,"Была нажата кнопка Cancel",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
