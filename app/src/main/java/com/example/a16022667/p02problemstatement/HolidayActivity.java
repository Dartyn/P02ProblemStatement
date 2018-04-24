package com.example.a16022667.p02problemstatement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HolidayActivity extends AppCompatActivity {

    ListView lv;
    TextView tvHolidays;
    ArrayList<Holidays> holidays;
    ArrayAdapter aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiday);

        lv = (ListView) this.findViewById(R.id.lvholiday);
        tvHolidays = (TextView) findViewById(R.id.tvholiday);

        Intent i = getIntent();

        String info = i.getStringExtra("info");

        TextView tvholi = (TextView)findViewById(R.id.tvselectedholiday);

        tvholi.setText(info);
        holidays = new ArrayList<Holidays>();
        holidays.add(new Holidays("New Year's Day"));
        holidays.add(new Holidays("Labour Day"));

        aa = new HolidayAdapter(this, R.layout.activity_holiday, holidays);
        lv.setAdapter(aa);

    }

}
