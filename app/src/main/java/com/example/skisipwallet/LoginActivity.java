package com.example.skisipwallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {


    TextView registerlink,txtV;
    ImageView img_logo;
    EditText etusername,etemail,etpassword;
    Button btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtV=findViewById(R.id.txtV);
        etemail=findViewById(R.id.etemail);
        img_logo=findViewById(R.id.img_logo);
        etpassword=findViewById(R.id.etpass);
        registerlink=findViewById(R.id.registerlink);
        btn_register=findViewById(R.id.btnregister);

    }
}