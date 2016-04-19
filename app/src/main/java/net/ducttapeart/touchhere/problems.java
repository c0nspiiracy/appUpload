package net.ducttapeart.touchhere;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class problems extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems);


        String[] problems = {"Check Battery Level", "Charge your Android device", "Connect to Wi-Fi", "Change Volumes", "Change Wallpaper", "Device is too Warm", "Block a Number", "Restart Device", "Set Screen Lock"};
        ListAdapter problemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, problems);
        ListView problemListView = (ListView) findViewById(R.id.problemListView);
        problemListView.setAdapter(problemAdapter);


        problemListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                switch (itemPosition) {
                    case 0:
                        Intent app1 = new Intent(problems.this, CheckBatteryLevel.class);
                        startActivity(app1);
                        break;

                    case 1:
                        Intent app2 = new Intent(problems.this, ChargeDevice.class);
                        startActivity(app2);
                        break;

                    case 2:
                        Intent app3 = new Intent(problems.this, Wifi.class);
                        startActivity(app3);
                        break;
                    case 3:
                        Intent app4 = new Intent(problems.this, volume.class);
                        startActivity(app4);
                        break;
                    case 4:
                        Intent app5 = new Intent(problems.this, ChangeWallpaper.class);
                        startActivity(app5);
                        break;

                    case 5:
                        Intent app6 = new Intent(problems.this, WarmDevice.class);
                        startActivity(app6);
                        break;

                    case 6:
                        Intent app7 = new Intent(problems.this, BlockNumber.class);
                        startActivity(app7);
                        break;
                    case 7:
                        Intent app8 = new Intent(problems.this, RestartDevice.class);
                        startActivity(app8);
                        break;
                    case 8:
                        Intent app9 = new Intent(problems.this, ManageSecurity.class);
                        startActivity(app9);
                        break;
                }
            }
        });
    }


    public void onClickBack(View view){
        Intent i = new Intent(this, Solve.class);
        startActivity(i);
    }

}
