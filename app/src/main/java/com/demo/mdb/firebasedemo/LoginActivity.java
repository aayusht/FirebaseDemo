package com.demo.mdb.firebasedemo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private static FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Part 1: Authentication
        //Question 1: add Firebase Authentication to your project
        //Question 2: create an instance variable for the FirebaseAuth and initialize it below

        //here

        //Question 3: create an instance variable to listen for the auth state. Log when the auth state changes


        //Question 4 in attemptLogin()
        ((Button) findViewById(R.id.loginButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attemptLogin();
            }
        });

        //Question 5 in attemptSignup()
        ((Button) findViewById(R.id.signupButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attemptSignup();
            }
        });

        //Part 2 in ListActivity
    }

    private void attemptLogin() {
        String email = ((EditText) findViewById(R.id.emailView)).getText().toString();
        String password = ((EditText) findViewById(R.id.emailView)).getText().toString();
        if (!email.equals("") && !password.equals("")) {
            //Question 4: add sign in capability. If it is successful, go to the listactivity, else display a Toast
        }
    }

    private void attemptSignup() {
        String email = ((EditText) findViewById(R.id.emailView)).getText().toString();
        String password = ((EditText) findViewById(R.id.emailView)).getText().toString();

        if (!email.equals("") && !password.equals("")) {
            //Question 5: add sign up capability. Same results as log in.
        }
    }
}
