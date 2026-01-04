package com.example.myapp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void openprogressdialog(View view)
    {
         ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("New Title");
        progressDialog.setMessage("New Message");
        progressDialog.setIcon(R.drawable.baseline_whatsapp_24);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setMax(100);
        progressDialog.setProgress(0);
        progressDialog.setCancelable(false);
        progressDialog.show();

         Handler handler = new Handler(){
           @Override
            public void handleMessage(@NonNull Message msg){
               super.handleMessage(msg);
               progressDialog.incrementProgressBy(1);
               if (progressDialog.getProgress() >= progressDialog.getMax()) {
                   progressDialog.dismiss();
               }
           }
        };

        new Thread(() -> {
            try {
                while (progressDialog.getProgress() <= progressDialog.getMax()) {
                    Thread.sleep(100); // Simulate work
                    handler.sendMessage(handler.obtainMessage());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
