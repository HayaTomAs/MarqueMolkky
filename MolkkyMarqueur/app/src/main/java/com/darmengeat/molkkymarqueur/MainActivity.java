package com.darmengeat.molkkymarqueur;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.imgAccueil).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextActivity=new Intent(getApplicationContext(),GroupActivity.class);
                startActivity(nextActivity);
                finish();
            }
        });
    }
}
