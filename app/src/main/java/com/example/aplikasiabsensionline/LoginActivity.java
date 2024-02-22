package com.example.aplikasiabsensionline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    CheckBox lihatPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        lihatPassword = (CheckBox) findViewById(R.id.lihatPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        lihatPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lihatPassword.isChecked()){
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else  {
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
    }
}