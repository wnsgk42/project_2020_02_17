package com.example.project_cocoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login_activity extends AppCompatActivity {
    private EditText EditText_id;
    private EditText EditText_password;
    private String myId="wnsgk42";
    private String myPw ="123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText_id = findViewById(R.id.EditText_id);
        EditText_password = findViewById(R.id.EditText_password);

        Button Button_login = findViewById(R.id.Button_login);

        Button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = EditText_id.getText().toString();
                String pw = EditText_password.getText().toString();

                if(id.equals(myId) && pw.equals(myPw)){

                }
            }
        });

    }
}
