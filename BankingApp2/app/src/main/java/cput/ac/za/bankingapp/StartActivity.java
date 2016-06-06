package cput.ac.za.bankingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);//should be in my main so when the program starts here


        Button btnStart = (Button) findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
              //Intent myintent = new Intent(this,FirstScreen.class)
              Intent myIntent = new Intent(view.getContext(),FirstScreen.class);
              startActivityForResult(myIntent,0);
              //startActivity(myIntent);
            }
        });

    }


}
