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

public class Main3Activity extends AppCompatActivity {

    private MainActivity.CustomAdapter customAdapter;

    String[] Names3 = new String[]{"Magna 1.2","Magna 1.2","Magna 1.2","Magna 1.2","Sportz 1.2",
            "Sportz 1.2","Sportz 1.2","Sportz 1.2","Sportz Dual Tone 1.2","Asta 1.2","Asta 1.2",
            "Magna 1.2 AT","Sportz 1.2 (o)","Sportz 1.2 (0)","Sportz 1.2 AT","Sportz 1.2 AT"};
    String[] Color3 = {"Sleek Silver","Fiery Red","White+Black","Polar White","Sleek Silver","Polar White","Polar White","Star Dust","Polar White","Star Dust"};
    int[] Images3 = {R.drawable.silver,R.drawable.fiery,R.drawable.wb,R.drawable.lb1,
            R.drawable.silver,R.drawable.lb1,R.drawable.lb1,R.drawable.stadust,R.drawable.lb1,R.drawable.stadust};
    String[] Number3 = {"58","14","12","1","32","4","4","2","2","1","2","1","5","4","2","1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ListView listView = (ListView) findViewById(R.id.listView3);
        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);


    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return Images3.length;
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
            View view = getLayoutInflater().inflate(R.layout.customlayout2, null);

            TextView textView34 = (TextView)view.findViewById(R.id.textView34);
            TextView textView35 = (TextView)view.findViewById(R.id.textView35);
            ImageView imageView6 = (ImageView)view.findViewById(R.id.imageView6);
            TextView textView36 = (TextView)view.findViewById(R.id.textView36);




            textView34.setText(Names3[i]);
            textView35.setText(Color3[i]);
            imageView6.setImageResource(Images3[i]);
            textView36.setText(Number3[i]);
            return view;
        }
    }
}



