package com.openlab.humanpokedex;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    private MaterialButton signIn, signUp, recFace;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.login_activity);

        signIn = findViewById(R.id.signInButton);
        signUp = findViewById(R.id.signUpButton);
        recFace = findViewById(R.id.recognizeFaceButton);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });

        recFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recognizeFace();
            }
        });
    }

    public void signIn() {

    }

    public void signUp() {

    }

    public void recognizeFace() {

    }
}
