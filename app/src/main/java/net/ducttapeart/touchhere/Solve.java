package net.ducttapeart.touchhere;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Solve extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve);

    }

    public void onClickProblem(View view){
        Intent i = new Intent(this, problems.class);
        startActivity(i);
    }

    public void onClickBack(View view){
        Intent i = new Intent(this, Task.class);
        startActivity(i);
    }

    public void onClickSearch(View view){
        String url = "http://google.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
