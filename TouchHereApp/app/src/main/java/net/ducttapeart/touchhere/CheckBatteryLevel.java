package net.ducttapeart.touchhere;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class CheckBatteryLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prob_activity_check_battery_level);

    }

    public void onClickBack(View view){
        Intent i = new Intent(this, problems.class);
        startActivity(i);
    }

}
