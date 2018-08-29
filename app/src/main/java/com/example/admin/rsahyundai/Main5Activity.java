package com.example.admin.rsahyundai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    private MainActivity.CustomAdapter customAdapter;


    int[] IMAGES1 = {R.drawable.lb,R.drawable.silver,R.drawable.lb,R.drawable.stadust,
            R.drawable.fiery,R.drawable.lb1,R.drawable.wb,R.drawable.lb1,R.drawable.fiery,R.drawable.lb};
    String[] Names = new String[]{"Magna Executive","Magna Executive","Sportz","Sportz","Sportz",
            "Asta 1.2","Asta Dual Tone","Asto (0)","Asto (0)","Asta 1.2 CVT"};
    String[] Color = {"Polar White","Sleek Silver","Polar White","Star Dust","Fiery Red",
            "Polar White","White+Black","Polar White","Fiery Red","Polar White"};
    String[] Number = {"2","2","5","1","1","1","1","1","1","1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        final ListView listView = (ListView)findViewById(R.id.listView5);
        CustomAdapter customAdapter1 = new CustomAdapter();

        listView.setAdapter(customAdapter1);


    }

    class CustomAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return IMAGES1.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }



        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.customlayout2, null);


            ImageView imageView6 = (ImageView)view1.findViewById(R.id.imageView6);
            TextView textView36 = (TextView)view1.findViewById(R.id.textView36);
            TextView textView34 = (TextView)view1.findViewById(R.id.textView34);
            TextView textView35 = (TextView)view1.findViewById(R.id.textView35);



            imageView6.setImageResource(IMAGES1[i]);
            textView34.setText(Names[i]);
            textView35.setText(Color[i]);
            textView36.setText(Number[i]);
            return view1;
        }
    }

}


