package ru.startandroid.p0111resvalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvBottom;
    Button btnBottom;
    LinearLayout llBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBottom = (TextView) findViewById(R.id.tvBottom);
        btnBottom = (Button) findViewById(R.id.btnBottom);
        llBottom = (LinearLayout) findViewById(R.id.llBottom);

        llBottom.setBackgroundResource(R.color.llBottomColor);
        btnBottom.setText(R.string.btnBottomButton);
        tvBottom.setText(R.string.tvBottomText);

    }
}
