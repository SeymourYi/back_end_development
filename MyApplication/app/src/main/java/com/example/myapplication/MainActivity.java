package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRegisterBtnClick(View view){
        TextView txtFirstName = findViewById(R.id.textFirstName);
        TextView txtLastName = findViewById(R.id.textLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText editTextFirstName = findViewById(R.id.editFrist);
        EditText editTextLastName = findViewById(R.id.editLastName);
        EditText editTexEmail = findViewById(R.id.editEmail);

        txtFirstName.setText("First Name:" + editTextFirstName.getText().toString() );
        txtLastName.setText("Last Name:" + editTextLastName.getText().toString() );
        txtEmail.setText("First Name:" + editTexEmail.getText().toString() );


    }
}
