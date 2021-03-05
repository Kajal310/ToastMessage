package com.example.toastmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast = Toast.makeText(MainActivity.this,"Kajal is the best ! :)",Toast.LENGTH_SHORT);


        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<1000;i++){
                    try {
                        Thread.sleep(2000);
                        toast.show();
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            }
        });
        t.start();
    }
}
