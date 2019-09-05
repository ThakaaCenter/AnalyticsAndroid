package com.example.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;


//import amplitude package

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email = findViewById(R.id.email);
        username = findViewById(R.id.username);
        Button save = findViewById(R.id.save);
        Button change = findViewById(R.id.button);
        Button purchase = findViewById(R.id.purchase);


        /*
          * Integrate amplitude using API_KEY
          * Add user id
         */




        save.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        JSONObject user_info = new JSONObject();


                        try {
                            user_info.put("email",email.getText().toString());
                            user_info.put("username",username.getText().toString());


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                       //Set user properties

                    }
                }
        );

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Add event clicks events

                Intent i = new Intent(MainActivity.this, ChangeStatus.class);
                startActivity(i);
            }
        });


        purchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                EditText quantity = findViewById(R.id.quantity);
                EditText price = findViewById(R.id.price);

                int _quantity = Integer.parseInt(quantity.getText().toString());
                double _price = Double.parseDouble(price.getText().toString());
                //Add revenue event

                //Add receipt



            }
        });

    }


}
