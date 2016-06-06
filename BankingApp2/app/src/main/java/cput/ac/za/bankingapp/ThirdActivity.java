package cput.ac.za.bankingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cput.ac.za.bankingapp.domain.Client;
import cput.ac.za.bankingapp.repository.client.ClientRepository;
import cput.ac.za.bankingapp.repository.client.impl.ClientRepositoryImpl;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
     
        Button submit =(Button)findViewById(R.id.btnSubmit);

        Intent i = getIntent();

        final Client myClientCatch = (Client)i.getSerializableExtra("ClientValue");

        Toast.makeText(ThirdActivity.this,myClientCatch.toString(),Toast.LENGTH_LONG).show();

        EditText myEdit = (EditText)findViewById(R.id.displayAlltxt);
        myEdit.setText(myClientCatch.toString());


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClientRepository repo = new ClientRepositoryImpl(getApplicationContext());

                Client insertedEntity =repo.save(myClientCatch);

                //Call the fourth activity
                Intent myIntent = new Intent(view.getContext(),FourthActivity.class);
                startActivity(myIntent);
            }
        });

    }
}
