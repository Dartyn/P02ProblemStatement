package com.example.a16022667.p02problemstatement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holidays> {

    private ArrayList<Holidays> holidays;
    private Context context;
    private TextView tvHolidaysName;
    private ImageView ivholiday;

    public HolidayAdapter(Context context, int resource, ArrayList<Holidays> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holidays = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvHolidaysName = (TextView) rowView.findViewById(R.id.tvholiday);
        // Get the ImageView object
        ivholiday = (ImageView) rowView.findViewById(R.id.ivholiday);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holidays currentHoliday = holidays.get(position);
        // Set the TextView to show the food

        tvHolidaysName.setText(currentHoliday.getName().toString());
        String text = tvHolidaysName.getText().toString();
        // Set the image to star or nostar accordingly
    if(text.equalsIgnoreCase("New Year's Day")){
        ivholiday.setImageResource(R.drawable.new_year);
    }else if (text.equalsIgnoreCase("Labour Day")){
        ivholiday.setImageResource(R.drawable.labour_day);
    }
        // Return the nicely done up View to the ListView
        return rowView;
    }
}
