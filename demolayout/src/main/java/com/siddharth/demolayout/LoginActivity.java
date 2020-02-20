package com.siddharth.demolayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    EditText editusername, editpassword;
    TextView signUP;
    Button logIN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editusername=findViewById(R.id.editusername);
        editpassword = findViewById(R.id.editpassword);
        signUP = findViewById(R.id.signUP);
        logIN = findViewById(R.id.logIN);

        signUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,RegistrationActivity.class);
                startActivity(intent);
            }
        });

        

    }
}
