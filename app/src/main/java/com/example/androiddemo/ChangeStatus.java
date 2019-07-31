package com.example.androiddemo;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

//import amplitude package


public class ChangeStatus extends AppCompatActivity {

    static EditText text;
    static JSONObject status;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_status);


        /*
         * Integrate your amplitude
         */

        Button save = findViewById(R.id.save);




        text = findViewById(R.id.status);
        status = new JSONObject();





        save.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        try {
                            status.put("new status", text.getText().toString());


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        //Add  status changed event with event property
                        onBackPressed();
                    }
                }
        );

    }
}
