package com.example.a16022667.p02problemstatement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Holidays> holidays;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        holidays = new ArrayList<Holidays>();


        lv = (ListView) this.findViewById(R.id.lvType);

        holidays.add(new Holidays("Secular"));
        aa = new HolidayAdapter(this, R.layout.activity_holiday, holidays);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new  AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holidays selectedholiday = holidays.get(position);
                Intent i = new Intent(MainActivity.this,HolidayActivity.class);


                i.putExtra("holidaySelected",selectedholiday.getName());
                startActivity(i);
            }

        });
    }
}
