package net.ducttapeart.touchhere;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.widget.Toast;


public class FindApp extends AppCompatActivity {




    public static String[] apps = {"Facebook", "Gmail", "Google Photos", "Instagram",  "Netflix", "PayPal", "Snapchat", "Spotify", "Twitter", "Youtube"};
    public static int[] appLogos = {R.drawable.facebook, R.drawable.gmail, R.drawable.google_photos,
            R.drawable.instagram,R.drawable.netflix, R.drawable.paypal, R.drawable.chat,R.drawable.spotify, R.drawable.twitter,R.drawable.youtube};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_app);

        ListAdapter appAdapter = new CustomAdapter(this, apps, appLogos);

        final ListView appList = (ListView) findViewById(R.id.appList);
        appList.setAdapter(appAdapter);


        appList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                switch (itemPosition){
                    case 0:
                        Intent app1 = new Intent(FindApp.this, facebook.class);
                        startActivity(app1);
                        break;

                    case 1 :
                        Intent app2 = new Intent(FindApp.this, gmail.class);
                        startActivity(app2);
                        break;

                    case 2 :
                        Intent app3 = new Intent(FindApp.this, google_photos.class);
                        startActivity(app3);
                        break;
                    case 3 :
                        Intent app4 = new Intent(FindApp.this, instagram.class);
                        startActivity(app4);
                        break;
                    case 4 :
                        Intent app5 = new Intent(FindApp.this, netflix.class);
                        startActivity(app5);
                        break;
                    case 5 :
                        Intent app10 = new Intent(FindApp.this, paypal.class);
                        startActivity(app10);
                        break;
                    case 6 :
                        Intent app6 = new Intent(FindApp.this, snapchat.class);
                        startActivity(app6);
                        break;
                    case 7 :
                        Intent app7 = new Intent(FindApp.this, spotify.class);
                        startActivity(app7);
                        break;
                    case 8 :
                        Intent app8 = new Intent(FindApp.this, twitter.class);
                        startActivity(app8);
                        break;
                    case 9 :
                        Intent app9 = new Intent(FindApp.this, Youtube.class);
                        startActivity(app9);
                        break;
                }
            }
        });
    }



    public void onClickBack(View view){
        Intent i = new Intent(this, Task.class);
        startActivity(i);
    }

}
