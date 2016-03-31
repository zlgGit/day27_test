package com.example.day27_test;

import android.Manifest;
import android.app.DownloadManager;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selfPermisson();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Log.i("--Request-", "处理权限");

        if (grantResults[0]==PackageManager.PERMISSION_GRANTED)
        {
            Log.i("--.Request-","获得了权限");
        }
        else
        {
            Log.i("--.checkSel-", "没有权限,继续申请");
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},0);

        }

    }
    public void selfPermisson()
    {
        if (Build.VERSION.SDK_INT >Build.VERSION_CODES.KITKAT)

        {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {


                Log.i("--.checkSel-", "获得了权限");
            } else {

                Log.i("--.checkSel-", "没有权限，申请");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 0);
            }
        }
        else {
            Log.i("--.VERSION-", "--");
        }
    }
}
