package com.example.skisipwallet;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView loginlink,txtV;
    ImageView img_logo;
    EditText etusername,etemail,etpassword,etpassword2;
    Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etusername=findViewById(R.id.etusername);
        txtV=findViewById(R.id.txtV);
        etemail=findViewById(R.id.etemail);
        img_logo=findViewById(R.id.img_logo);
        etpassword=findViewById(R.id.etpass);
        etpassword2=findViewById(R.id.etCpass);
        btn_register=findViewById(R.id.btnregister);
        loginlink=findViewById(R.id.loginlink);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("hi");
           processdata(etusername.getText().toString(),etemail.getText().toString(),etpassword.getText().toString(),etpassword2.getText().toString());



            }
        });

    }
    public  void processdata(String username, String email, String password,String password2)
    {
        Call<responsemodel_1> call= apiController.getInstance()
                .getApi()
                .get_register(username,email,password,password2);

        call.enqueue(new Callback<responsemodel_1>() {
            @Override
            public void onResponse(Call<responsemodel_1> call, Response<responsemodel_1> response) {
                System.out.println(response.raw());
                System.out.println(response.code());
                System.out.println(response.message());
                System.out.println(response.errorBody());
                responsemodel_1 obj=response.body();
                Toast.makeText(MainActivity.this, "Successfully Register", Toast.LENGTH_SHORT).show();
                etusername.setText("");
                etemail.setText("");
                etpassword.setText("");
                etpassword2.setText("");
            }

            @Override
            public void onFailure(Call<responsemodel_1> call, Throwable t) {
                System.out.println("ERROR: "+ t);
                Toast.makeText(MainActivity.this, "something went wrong", Toast.LENGTH_SHORT).show();
                etusername.setText("");
                etemail.setText("");
                etpassword.setText("");
                etpassword2.setText("");
            }
        });
    }
}

