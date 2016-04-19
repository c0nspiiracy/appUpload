package net.ducttapeart.touchhere;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class twitter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_activity_twitter);
    }

    public void onClick(View view){
        PackageManager pm = this.getPackageManager();

        if(isPackageInstalled("com.twitter.android", pm)) {
            Intent i;
            PackageManager manager = getPackageManager();
            try {
                i = manager.getLaunchIntentForPackage("com.twitter.android");
                if (i == null)
                    throw new PackageManager.NameNotFoundException();
                i.addCategory(Intent.CATEGORY_LAUNCHER);
                startActivity(i);
            } catch (PackageManager.NameNotFoundException e) {

            }
        }
        else{
            String url = "https://play.google.com/store/apps/details?id=com.twitter.android&hl=en";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
    }

    private boolean isPackageInstalled(String packagename, PackageManager packageManager) {
        try {
            packageManager.getPackageInfo(packagename, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public void onClickBack(View view){
        Intent i = new Intent(this, FindApp.class);
        startActivity(i);
    }

}
