package com.example.thushara.perfectwater.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.EditText;
import com.example.thushara.perfectwater.R;

import java.util.ArrayList;

import model.UserType;

public class RegistrationActivity extends AppCompatActivity {

    private Spinner userType;
    private EditText name ;
    private EditText username;
    private EditText password;
    private ArrayList records;
    private String[] info = {name.toString(), username.toString(), password.toString(), records.toString()};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**
         * Grab the dialog widgets so we can get info for later
         */

        name = (EditText) findViewById(R.id.register_name);
        username = (EditText) findViewById(R.id.register_username);
        password = (EditText) findViewById(R.id.register_password);
        userType = (Spinner) findViewById(R.id.usertypeSpinner);
        records.add(info);


        //loads the spinners and sets the values in it
        userType = (Spinner) findViewById(R.id.usertypeSpinner);
        ArrayAdapter<UserType> userTypeAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, UserType.values());
        userTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        userType.setAdapter(userTypeAdapter);

        Button registrationButton = (Button) findViewById(R.id.registration_button);
        registrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register_new_user();
                startActivity(new Intent(RegistrationActivity.this, HomeScreen.class));
                finish();
            }
        });

        Button cancelButton = (Button) findViewById(R.id.cancel_registration);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //clearfields();
                finish();
                startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
            }
        });
    }

    // functionality when the "register" button is clicked
    private boolean register_new_user(){
        return true;
    }

/*
     *//**
     * Clears all the fields of the fields on the registration screen
     *//*
    private void clearfields(){
        EditText nameView = (EditText) findViewById(R.id.register_name);
        AutoCompleteTextView usernameView = (AutoCompleteTextView) findViewById(R.id.register_username);
        EditText passwordView = (EditText) findViewById(R.id.register_password);

        Spinner userTypeView = (Spinner) findViewById(R.id.usertypeSpinner);

        nameView.setText("");
        usernameView.setText("");
        passwordView.setText("");

    }*/

}