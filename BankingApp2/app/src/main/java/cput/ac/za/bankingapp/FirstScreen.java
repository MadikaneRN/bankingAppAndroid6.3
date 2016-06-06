package cput.ac.za.bankingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cput.ac.za.bankingapp.domain.Client;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        Button btnPreview = (Button) findViewById(R.id.btnPreview);

        final EditText myId =(EditText)findViewById(R.id.txtIdno);
        final EditText fname = (EditText) findViewById(R.id.txtFirstName);
        final EditText lname = (EditText)findViewById(R.id.txtLastName);
        final EditText mylongId = (EditText)findViewById(R.id.longtxt);

        btnPreview.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                String firstName = fname.getText().toString();
                String lastName = lname.getText().toString();
                String idNum = myId.getText().toString();
                Long longId = Long.parseLong(mylongId.getText().toString());


                Client myClient = new Client.Builder()
                        .id(longId)
                        .idNo(idNum)
                        .name(firstName)
                        .surName(lastName)
                        .build();

                Intent myIntent = new Intent(view.getContext(),ThirdActivity.class);
                myIntent.putExtra("ClientValue",myClient);

                startActivity(myIntent);
            }
        });

}
}
