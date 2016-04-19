package net.ducttapeart.touchhere;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;


public class Task extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

    }

    public void onClickBack(View view){
        Intent i = new Intent(this, Home.class);
        startActivity(i);
    }
    public void onClickApp(View view){
        Intent i = new Intent(this, FindApp.class);
        startActivity(i);
    }
    public void onClickSolve(View view){
        Intent i = new Intent(this, Solve.class);
        startActivity(i);
    }

}
