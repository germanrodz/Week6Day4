package com.blovvme.week6day4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CustomPie pieChartView;
    CustomViewButton btnCustom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChartView = (CustomPie) findViewById(R.id.pie_chart);
        btnCustom = (CustomViewButton) findViewById(R.id.btnCustom);
        float[] datapoints = {450, 1230, 200, 400};
        pieChartView.setDataPoints(datapoints);
        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is a Custom View extending from Button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
