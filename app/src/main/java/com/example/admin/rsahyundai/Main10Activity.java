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

public class Main10Activity extends AppCompatActivity {

    private MainActivity.CustomAdapter customAdapter;


    int[] IMAGES1 = {R.drawable.lb,R.drawable.lb1,R.drawable.black};
    String[] Names = new String[]{"SX","SX AT","SX AT"};
    String[] Color = {"Polar White","Polar White","Thunder Black"};
    String[] Number = {"1","2","1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        final ListView listView = (ListView)findViewById(R.id.listView10);
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


