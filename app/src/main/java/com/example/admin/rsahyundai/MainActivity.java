package com.example.admin.rsahyundai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class
MainActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.eon,R.drawable.giten1,R.drawable.giten,R.drawable.it1,R.drawable.it2,R.drawable.v1,R.drawable.xvtvt,R.drawable.x1,R.drawable.creta1,R.drawable.creta2,
            R.drawable.creta3,R.drawable.creta4,R.drawable.creta5,R.drawable.verna1,R.drawable.verna2};

    String[] NAMES = {"EON(30/45)","GRAND i10 VTVT(120/143)","GRAND i10 CRDi(4/9)","ELITE i20 VTVT(8/14)","ELITE i20 CRDi(7/10)","NEXT GEN VERNA VTVT",
    "XCENT VTVT(3/6)","XCENT CRDi(0/1)","2018 CRETA VTVT 1.6(0/1)",
            "2018 CRETA CRDi 1.6(2/3)","CRETA VTVT 1.6(1/3)","CRETA CRDI 1.4(1/2)",
            "CRETA CRDi 1.6(0/1)","NEXT GEN VERNA VTVT","NEXT GEN VERNA CRDi"};

    String[] DESCRIPTION = {"Era+    30/45\nMAGINA+    0/1",
            "Magna 1.2    65/85\nSportz    25/39\nSportz Dual    1/2\nTone 1.2    \nASTA 1.2    1/3\nMagna 1.2 AT    0/1\nSPORTZ (0) 1.2    6/9\nSPORTZ 1.2 AT    2/3",
                            "Magna 1.2 CRDi    2/3\nSPORTZ 1.2 CRDi    1/2\nSPORTZ (0) 1.2 CRDi    1/2\nASTA 1.2    1/2",
                            "MAGNA    2/4\nEXECUTIVE SPORTZ    4/7\nASTA 1.2    0/1\nASTA DUAL TONE    0/1\nASTO (0)    0/1",
                            "Magna    2/4\nExecutive Sportz    0/1\nASTA (0)    3/5",
                            "VTVT 1.4 EX    1/3",
                            "E+    1/3\nS    1/2\nSX    0/1",
                            "E+    0/1",
                            "SX AT    0/1",
                            "SX AT    1/3",
    "E+    1/3",
    "E+    1/2",
    "SX(0)    0/1",
   "SX    0/1",
    "EX    1/3\nSX    0/1\nSX(0)    1/2\nSX+ AT    0/1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ListView listView = (ListView)findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent myintent = new Intent(view.getContext(),Main2Activity.class);
                    startActivityForResult(myintent,0);
                }
                if(position==1){
                    Intent myintent = new Intent(view.getContext(),Main3Activity.class);
                    startActivityForResult(myintent,1);
                }
                if(position==2){
                    Intent myintent = new Intent(view.getContext(),Main4Activity.class);
                    startActivityForResult(myintent,2);
                }
                if(position==3){
                    Intent myintent = new Intent(view.getContext(),Main5Activity.class);
                    startActivityForResult(myintent,3);
                }
                if(position==4){
                    Intent myintent = new Intent(view.getContext(),Main6Activity.class);
                    startActivityForResult(myintent,4);
                }
                if(position==5){
                    Intent myintent = new Intent(view.getContext(),Main7Activity.class);
                    startActivityForResult(myintent,5);
                }
                if(position==6){
                    Intent myintent = new Intent(view.getContext(),Main8Activity.class);
                    startActivityForResult(myintent,6);
                }
                if(position==7){
                    Intent myintent = new Intent(view.getContext(),Main9Activity.class);
                    startActivityForResult(myintent,7);
                }
                if(position==8){
                    Intent myintent = new Intent(view.getContext(),Main10Activity.class);
                    startActivityForResult(myintent,8);
                }
                if(position==9){
                    Intent myintent = new Intent(view.getContext(),Main11Activity.class);
                    startActivityForResult(myintent,9);
                }
                if(position==10){
                    Intent myintent = new Intent(view.getContext(),Main12Activity.class);
                    startActivityForResult(myintent,10);
                }
                if(position==11){
                    Intent myintent = new Intent(view.getContext(),Main13Activity.class);
                    startActivityForResult(myintent,11);
                }
                if(position==12){
                    Intent myintent = new Intent(view.getContext(),Main14Activity.class);
                    startActivityForResult(myintent,12);
                }
                if(position==13){
                    Intent myintent = new Intent(view.getContext(),Main15Activity.class);
                    startActivityForResult(myintent,13);
                }
                if(position==14){
                    Intent myintent = new Intent(view.getContext(),Main16Activity.class);
                    startActivityForResult(myintent,14);
                }
                if(position==15){
                    Intent myintent = new Intent(view.getContext(),Main17Activity.class);
                    startActivityForResult(myintent,15);
                }

            }
        });

            }



    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            Log.e("Test","Images  length " + IMAGES.length);
            return IMAGES.length;

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
            View view = getLayoutInflater().inflate(R.layout.customlayout, null);
            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            TextView textView_name = (TextView)view.findViewById(R.id.textView_name);
            TextView textView_description = (TextView)view.findViewById(R.id.textView_description);
            Log.e("Test"," no of view " + i);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTION[i]);
            return view;
        }
    }
}
